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
import javax.swing.border.*;
/**
 *
 * @author anshh
 */
public class AdminLogin extends JFrame{
    
    private static final long serialVersionUID = 1L;
    private JTextField adminName;
    private JPasswordField adminPassword;
    public JPanel contentPane;
    private JButton admnLogin;
    
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                        AdminLogin am = new AdminLogin();
                        am.setVisible(true);
                        am.setTitle("OFFICE EASY SYSTEM");
                         
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public AdminLogin()
     {
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNewLabel3 = new JLabel("OFFICE MANAGEMENT SYSTEM");
        lblNewLabel3.setForeground(Color.BLACK);
        lblNewLabel3.setFont(new Font("Times New Roman", Font.BOLD, 50));
        lblNewLabel3.setBounds(100, 2, 1000, 93);
        contentPane.add(lblNewLabel3);
        
        
        JLabel lblNewLabel2 = new JLabel("Admin-Login");
        lblNewLabel2.setForeground(Color.BLACK);
        lblNewLabel2.setFont(new Font("Times New Roman", Font.PLAIN, 35));
        lblNewLabel2.setBounds(370,  58, 273, 93);
        contentPane.add(lblNewLabel2);

        adminName = new JTextField();
        adminName.setFont(new Font("Tahoma", Font.PLAIN, 20));
        adminName.setBounds(481, 175, 250, 40);
        contentPane.add(adminName);
        adminName.setColumns(10);

        adminPassword = new JPasswordField();
        adminPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
        adminPassword.setBounds(481, 290, 250, 40);
        contentPane.add(adminPassword);

        JLabel lblAdminname = new JLabel("Admin-name");
        lblAdminname.setBackground(Color.BLACK);
        lblAdminname.setForeground(Color.BLACK);
        lblAdminname.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblAdminname.setBounds(320, 166, 193, 52);
        contentPane.add(lblAdminname);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setForeground(Color.BLACK);
        lblPassword.setBackground(Color.CYAN);
        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPassword.setBounds(320, 286, 193, 52);
        contentPane.add(lblPassword);

        admnLogin = new JButton("Login");
        admnLogin.setFont(new Font("Tahoma", Font.PLAIN, 17));
        admnLogin.setBounds(540, 392, 140, 40);
         admnLogin.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String userName = adminName.getText();
                String password = adminPassword.getText();
                try {
                    Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ntcc",
                        "root", "a7n8s4h0");

                    PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("Select ADMIN_NAME, PASSWORD from admin_login where ADMIN_NAME=? and PASSWORD=?");

                    st.setString(1, userName);
                    st.setString(2, password);
                    ResultSet rs = st.executeQuery();
                    if (rs.next()) {
                        dispose();
                        AdminHome ah = new AdminHome(userName);
                            ah.setVisible(true);
                            ah.setTitle("Admin-Home");
                        JOptionPane.showMessageDialog(admnLogin, "You have successfully logged in");
                    } else {
                        JOptionPane.showMessageDialog(admnLogin, "Wrong Username & Password");
                    }
                } catch (SQLException sqlException) {
                    sqlException.printStackTrace();
                }
            }
        });
        contentPane.add(admnLogin);
        

     }
}
