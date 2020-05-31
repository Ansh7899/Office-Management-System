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
public class UserHome extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UserHome frame = new UserHome();
                    frame.setVisible(true);
                    frame.setTitle("OFFICE MANAGEMENT SYSTEM");
                } catch (Exception e) {
                    //  method of Java's throwable class which prints the 
                    //  throwable along with other details like the line number
                    //  and class name where the exception occurred.
                    e.printStackTrace();
                    
                }
            }
        });
    }

    public UserHome() {
    }
    public UserHome(String userSes) {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 814, 497);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
       
       JLabel NewLabel = new JLabel("Welcome,"+ userSes);
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
                    UserHome frame = new UserHome(userSes);
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
                ChangePassword bo = new ChangePassword(userSes);
                bo.setTitle("Change Password");
                bo.setVisible(true);

            }
        });
        button.setFont(new Font("Tahoma", Font.PLAIN, 15));
        button.setBounds(550, 20, 200, 30);
        contentPane.add(button);
        
        //sales sheet
        JButton sales = new JButton ("Access Sales sheet");
        sales.setBackground(UIManager.getColor("Button.disabledForeground"));
        sales.addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e) {
                SalesSheet s = new SalesSheet();
                s.setTitle("Add-Lead");
                s.setVisible(true);

            }
        });
        sales.setFont(new Font("Tahoma", Font.PLAIN, 15));
        sales.setBounds(200, 200, 200, 30);
        contentPane.add(sales); 

    //Leave Application
            JButton leave = new JButton ("Apply for Leave");
        leave.setBackground(UIManager.getColor("Button.disabledForeground"));
        leave.addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e) {
                LeaveApply l = new LeaveApply(userSes);
                l.setTitle("Leave Details");
                l.setVisible(true);

            }
        });
        leave.setFont(new Font("Tahoma", Font.PLAIN, 15));
        leave.setBounds(200, 150, 200, 30);
        contentPane.add(leave);
        
        //View Salary
            JButton sal = new JButton ("Salary Details");
        sal.setBackground(UIManager.getColor("Button.disabledForeground"));
        sal.addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e) {
                SalaryDetails l = new SalaryDetails();
                l.setTitle("Leave Details");
                l.setVisible(true);

            }
        });
        sal.setFont(new Font("Tahoma", Font.PLAIN, 15));
        sal.setBounds(200, 250, 200, 30);
        contentPane.add(sal); 

        //View Attendance
        JButton att = new JButton ("View Attendance");
        att.setBackground(UIManager.getColor("Button.disabledForeground"));
        att.addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e) {
                ViewAttendance l = new ViewAttendance();
                l.setTitle("Attendance Details");
                l.setVisible(true); 
            }
        });
        att.setFont(new Font("Tahoma", Font.PLAIN, 15));
        att.setBounds(200, 300, 200, 30);
        contentPane.add(att); 

    }
}