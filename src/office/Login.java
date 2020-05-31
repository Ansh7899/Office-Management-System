/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package office;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.*;
import javax.swing.border.*;/**
 *
 * @author anshh
 */
public class Login extends JFrame {
     private static final long serialVersionUID = 1L ;
    public JTextField textField;
    private JPasswordField passwordField;
    private JButton btnNewButton;
    private JButton btnNewButton2;
    private JLabel label;
    private JPanel contentPane;
    public String s;
    Login(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        ImageIcon img = new  ImageIcon("login.jpg");
        JLabel label = new JLabel("",img,JLabel.CENTER);
        label.setBounds(0,0,1014,597);
        contentPane.add(label);
        

        JLabel lblNewLabel = new JLabel("OFFICE MANAGEMENT SYSTEM");
        lblNewLabel.setForeground(Color.BLACK);
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 50));
        lblNewLabel.setBounds(100, 2, 1000, 93);
        contentPane.add(lblNewLabel);
        
        
        JLabel lblNewLabel2 = new JLabel("Employee-Login");
        lblNewLabel2.setForeground(Color.BLACK);
        lblNewLabel2.setFont(new Font("Times New Roman", Font.PLAIN, 35));
        lblNewLabel2.setBounds(370,  58, 273, 93);
        contentPane.add(lblNewLabel2);

        textField = new JTextField();
        textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
        textField.setBounds(481, 175, 250, 40);
        contentPane.add(textField);
        textField.setColumns(10);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 20));
        passwordField.setBounds(481, 290, 250, 40);
        contentPane.add(passwordField);

        JLabel lblUsername = new JLabel("Username");
        lblUsername.setBackground(Color.BLACK);
        lblUsername.setForeground(Color.BLACK);
        lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblUsername.setBounds(320, 166, 193, 52);
        contentPane.add(lblUsername);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setForeground(Color.BLACK);
        lblPassword.setBackground(Color.CYAN);
        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPassword.setBounds(320, 286, 193, 52);
        contentPane.add(lblPassword);

        btnNewButton = new JButton("Login");
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
        btnNewButton.setBounds(540, 392, 140, 40);
        btnNewButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String userName = textField.getText();
                String password = passwordField.getText();
                s=userName;
                try {
                    Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ntcc",
                        "root", "a7n8s4h0");

                    PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("Select EMP_NAME, PASSWORD from employee_login where EMP_NAME=? and PASSWORD=?");

                    st.setString(1, userName);
                    st.setString(2, password);
                    ResultSet rs = st.executeQuery();
                    if (rs.next()) {
                        dispose();
                        UserHome ah = new UserHome(userName);
                        ah.setTitle("Welcome");
                        ah.setVisible(true);
                        JOptionPane.showMessageDialog(btnNewButton, "You have successfully logged in");
                    } else {
                        JOptionPane.showMessageDialog(btnNewButton, "Wrong Username & Password");
                    }
                } catch (SQLException sqlException) {
                    sqlException.printStackTrace();
                }
            }
        });
        contentPane.add(btnNewButton);
        
        
        btnNewButton2 = new JButton("Admin-Login");
        btnNewButton2.setFont(new Font("Tahoma", Font.PLAIN, 17));
        btnNewButton2.setBounds(515, 450, 190, 40);
        btnNewButton2.addActionListener(new ActionListener() {

            
            public void actionPerformed(ActionEvent e) {
                dispose();
               AdminLogin adm = new AdminLogin();
                 adm.setTitle("Admin-Login");
                adm.setVisible(true);
       }           
       });
       contentPane.add(btnNewButton2);
    
}
}
