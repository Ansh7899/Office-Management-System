/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package office;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author anshh
 */
public class AddLogin extends JFrame {
    private JLabel lbl1;
    private JLabel lbl2;
    private JLabel lbl3;
    private JLabel lbl4;
    private JLabel lbl5;
    private JLabel lbl6;
    private JPanel contentPane;
     
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                AddLogin al = new AddLogin();
                al.setTitle("Add Employee");
                al.setVisible(true);
 
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    AddLogin()
    {
        
    }
    public AddLogin(String name)
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(5, 5, 700, 600);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
    
        lbl1 = new JLabel ("Add Login Details");
        lbl1.setForeground(Color.BLACK);
        lbl1.setFont(new Font("Times New Roman", Font.BOLD, 40));
        lbl1.setBounds(200, 10, 550, 150);
        contentPane.add(lbl1);
    
        lbl2 = new JLabel ("Employee name");
        lbl2.setForeground(Color.BLACK);
        lbl2.setFont(new Font("Times New Roman", Font.BOLD, 25));
        lbl2.setBounds(45, 115, 550, 150);
        contentPane.add(lbl2);
                
        JTextField ename = new JTextField();
        ename.setFont(new Font("Tahoma", Font.PLAIN, 20));
        ename.setBounds(325, 175, 250, 40);
        contentPane.add(ename);
               
        lbl3 = new JLabel ("Employee-ID (UNIQUE)");
        lbl3.setForeground(Color.BLACK);
        lbl3.setFont(new Font("Times New Roman", Font.BOLD, 25));
        lbl3.setBounds(45, 175, 550, 150);
        contentPane.add(lbl3);
                
        JTextField eid = new JTextField();
        eid.setFont(new Font("Tahoma", Font.PLAIN, 20));
        eid.setBounds(325, 235, 250, 40);
        contentPane.add(eid);
        
        lbl4 = new JLabel ("Password");
        lbl4.setForeground(Color.BLACK);
        lbl4.setFont(new Font("Times New Roman", Font.BOLD, 25));
        lbl4.setBounds(45, 235, 550, 150);
        contentPane.add(lbl4);
                
        JPasswordField pass = new JPasswordField();
        pass.setFont(new Font("Tahoma", Font.PLAIN, 20));
        pass.setBounds(325 ,295, 250, 40);
        contentPane.add(pass);
        
        JButton button1 = new JButton("Add Details");
        button1.setForeground(new Color(0, 0, 0));
        button1.setBackground(UIManager.getColor("Button.disabledForeground"));
        button1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    
                try {
                    Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ntcc",
                        "root", "a7n8s4h0");
                        
                    
                    PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("INSERT INTO EMPLOYEE_LOGIN(EMP_NAME,EMP_ID,PASSWORD)" + "VALUES(?,?,?)");
                        st.setString(1, ename.getText());
                        st.setString(2, eid.getText());
                        st.setString(3, pass.getText());
                        st.executeUpdate();
                        
                        dispose();
                        dispose();
                        AdminHome ah = new AdminHome(name);
                        ah.setTitle("Welcome");
                        ah.setVisible(true);
                        
                        JOptionPane.showMessageDialog(button1, "Login-Detail Added"); 
                   
                 } catch (SQLException sqlException) {
                    sqlException.printStackTrace();
                }
            }
        });
        
        button1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        button1.setBounds(300,400, 200, 30);
        contentPane.add(button1);   

            JButton button2 = new JButton("Cancel");
            button2.setForeground(new Color(0, 0, 0));
        button2.setBackground(UIManager.getColor("Button.disabledForeground"));
        button2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    try
                    {    
                       dispose();
                } 
                    catch (Exception sqlException) {
                    sqlException.printStackTrace();
                }
            }
        });
                    button2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        button2.setBounds(300, 450, 200, 30);
        contentPane.add(button2);   }
}