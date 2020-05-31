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
public class AdminHome extends JFrame{
    private JPanel contentPane;
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AdminHome frame = new AdminHome();
                    frame.setVisible(true);
                    frame.setTitle("Admin-Home");
                } catch (Exception e) {
                    //  method of Java's throwable class which prints the 
                    //  throwable along with other details like the line number
                    //  and class name where the exception occurred.
                    e.printStackTrace();
                    
                }
            }
        });
    }
    AdminHome(){}
    
    public AdminHome(String admin)
    {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 814, 497);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
       
       JLabel NewLabel = new JLabel("Welcome,"+ admin);
        NewLabel.setForeground(Color.BLACK);
        NewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
        NewLabel.setBounds(100, 2, 1000, 93);
        contentPane.add(NewLabel); 
        
        
        
        JButton btnNewButton = new JButton("Logout");
        btnNewButton.setForeground(new Color(0, 0, 0));
        btnNewButton.setBackground(UIManager.getColor("Button.disabledForeground"));
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = JOptionPane.showConfirmDialog(btnNewButton, "Are you sure?");
                //JOptionPane.setRootFrame(null);
                if (a == JOptionPane.YES_OPTION) {
                    dispose();
                    Login obj = new Login();
                    obj.setTitle("OFFICE EASY SYSTEM");
                    obj.setVisible(true);
                }
                
                if(a == JOptionPane.NO_OPTION) { 
                    dispose();
                    UserHome frame = new UserHome(admin);
                    frame.setTitle("OFFICE EASY SYSTEM");
                    frame.setVisible(true);
                         
                 }           
            }
                                                        
        });
        btnNewButton.setBounds(550, 70 , 200, 30);
        contentPane.add(btnNewButton);
        
        //change password button
        JButton button = new JButton("Change-password\r\n");
        button.setBackground(UIManager.getColor("Button.disabledForeground"));
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ChangePasswordAdmin bo = new ChangePasswordAdmin(admin);
                bo.setTitle("Change Password");
                bo.setVisible(true);

            }
        });
        button.setFont(new Font("Tahoma", Font.PLAIN, 15));
        button.setBounds(550, 20, 200, 30);
        contentPane.add(button);   
        
        //View Employee data
        JButton button3 = new JButton("Employee Database\r\n");
        button3.setBackground(UIManager.getColor("Button.disabledForeground"));
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ViewEmployee ne = new ViewEmployee();
                ne.setTitle("Employee-Data");
                ne.setVisible(true);

            }
        });
        button3.setFont(new Font("Tahoma", Font.PLAIN, 15));
        button3.setBounds(200, 150, 200, 30);
        contentPane.add(button3);
        
       
        
        //Add Login Details   
        JButton button4 = new JButton("Add Login Details\r\n");
        button4.setBackground(UIManager.getColor("Button.disabledForeground"));
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AddLogin al = new AddLogin(admin);
                al.setTitle("Add Login Details");
                al.setVisible(true);

            }
        });
        button4.setFont(new Font("Tahoma", Font.PLAIN, 15));
        button4.setBounds(200, 200, 200, 30);
        contentPane.add(button4); 
    
        //Add Salary details button
        JButton button5 = new JButton("Salary Details\r\n");
        button5.setBackground(UIManager.getColor("Button.disabledForeground"));
        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Salary al = new Salary();
                al.setTitle("SALARY");
                al.setVisible(true);

            }
        });
        button5.setFont(new Font("Tahoma", Font.PLAIN, 15));
        button5.setBounds(200, 250, 200, 30);
        contentPane.add(button5); 
        
        //Add attendance button
        JButton button6 = new JButton("Attendence\r\n");
        button6.setBackground(UIManager.getColor("Button.disabledForeground"));
        button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AddAttendance al = new AddAttendance();
                al.setTitle("ATTENDANCE");
                al.setVisible(true);            }
        });
        button6.setFont(new Font("Tahoma", Font.PLAIN, 15));
        button6.setBounds(200, 300, 200, 30);
        contentPane.add(button6); 
        
        //view sales sheet
        JButton button7 = new JButton("Sales Sheet\r\n");
        button7.setBackground(UIManager.getColor("Button.disabledForeground"));
        button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SalesSheet ss = new SalesSheet();
                ss.setTitle("SALES SHEET");
                ss.setVisible(true);            }
        });
        button7.setFont(new Font("Tahoma", Font.PLAIN, 15));
        button7.setBounds(200, 350, 200, 30);
        contentPane.add(button7);   
    
        //view leave
        JButton button8 = new JButton("View Leave\r\n");
        button8.setBackground(UIManager.getColor("Button.disabledForeground"));
        button8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LeaveView lv = new LeaveView();
               lv.setTitle("LEAVE VIEW");
                lv.setVisible(true);            
            }
        });
        button8.setFont(new Font("Tahoma", Font.PLAIN, 15));
        button8.setBounds(200, 400, 200, 30);
        contentPane.add(button8);   
    }
}
