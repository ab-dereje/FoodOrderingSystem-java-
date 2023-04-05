package foodOrderingSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Login{
    protected void displayLoginPage(){
        JFrame frame = new JFrame("Login page");
       
        //frame.setIconImage();
        JLabel welcomeLabel = new JLabel("Welcome");
        JLabel labelUserName = new JLabel("Username"); //username
        JTextField usernameTextField = new JTextField();
        JLabel labelPass = new JLabel("Password");
        JPasswordField passwordTextField = new JPasswordField();
        JButton loginButton = new JButton("Login");
        JButton exitButton = new JButton("Exit");
        JButton registerButton = new JButton("Register");
        JButton adminLoginButton = new JButton("Admin");

        //add image to background
        frame.setLayout(new BorderLayout());
	    frame.setContentPane(new JLabel(new ImageIcon("images/login.png")));
	    frame.setLayout(new FlowLayout());
        
        welcomeLabel.setBounds(415,50,150,50);
        welcomeLabel.setFont(new Font("Elephant",Font.BOLD, 25));

        labelUserName.setBounds(350,110,150,20);
        labelUserName.setFont(new Font("Alice", Font.BOLD, 16));
        usernameTextField.setBounds(450,110,150,20);

        

        labelPass.setBounds(350,160,150,20);
        labelPass.setFont(new Font("Elephant", Font.BOLD, 16));
        passwordTextField.setBounds(450,160,150,20);

        loginButton.setBounds(350,210,120,20);
        exitButton.setBounds(400,290,160,20);
        registerButton.setBounds(500,210,120,20);
        adminLoginButton.setBounds(700,30,100,20);


        //registerButton.setBorderPainted(false);

        loginButton.setBackground(Color.CYAN);
        loginButton.setOpaque(true);

        adminLoginButton.setBackground(Color.YELLOW);
        adminLoginButton.setOpaque(true);

        exitButton.setBackground(Color.BLACK);
        exitButton.setOpaque(true);
        exitButton.setForeground(Color.WHITE);

        registerButton.setBackground(Color.PINK);
        registerButton.setOpaque(true);

        //action listner
        loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                //
                char[] password = passwordTextField.getPassword(); // {'h', 'e', 'l', 'l', 'o'}
                //char[] empty = {};

                String pass = String.valueOf(password); //hello
                if (usernameTextField.getText().equals("") || pass.equals("")) {
					JOptionPane.showMessageDialog(null, "Field cannot be empty");
				} 
                else {
					//JOptionPane.showMessageDialog(null, "Creadentials meets:)");
					MainMenu main = new MainMenu();
                    main.displayMainMenu();
                    frame.dispose();
				}

			}
		});

        registerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                Registration createAccount = new Registration();
                createAccount.showRegisterPage();
                frame.dispose();

			}
		});

        adminLoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                //
			}
		});

        exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                System.exit(0); //exit

			}
		});



        //add to frame
        frame.getContentPane().add(welcomeLabel);
        frame.getContentPane().add(usernameTextField);
        frame.getContentPane().add(labelUserName);
        frame.getContentPane().add(labelPass);
        frame.getContentPane().add(passwordTextField);
        frame.getContentPane().add(loginButton);
        frame.getContentPane().add(exitButton);
        frame.getContentPane().add(registerButton);
        frame.getContentPane().add(adminLoginButton);
        
        //frame.setLocationRelativeTo(null);
        frame.setSize(854,480);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);//locaion
        //SwingUtilities.updateComponentTreeUI(frame);
        frame.setVisible(true);
    }
}