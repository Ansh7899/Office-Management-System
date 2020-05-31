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
public class NewEmployee extends JFrame{
    private JPanel contentPane;
    private JTextField ename;
    private JTextField designation;
    private JTextField address;
    private JTextField state;
    private JTextField contactNo;
    private JTextField contactId;
    private JTextField eid;
    private JTextField salary;
    private JTextField pincode;
    private JButton button1;
    private JLabel lbl;
    private JLabel lbl1;
    private JLabel lbl2;
    private JLabel lbl3;
    private JLabel lbl4;
    private JLabel lbl5;
    private JLabel lbl6;
    private JLabel lbl7;
    private JLabel lbl8;
    private JLabel lbl9;
    
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                        NewEmployee am = new NewEmployee();
                        am.setVisible(true);
                        am.setTitle("OFFICE EASY SYSTEM");
                         
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    NewEmployee()
    {
        
    }
    public NewEmployee(String name)
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(5, 5, 1300, 600);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
    
        lbl = new JLabel ("Enter Employee Details");
        lbl.setForeground(Color.BLACK);
        lbl.setFont(new Font("Times New Roman", Font.BOLD, 50));
        lbl.setBounds(400, 10, 550, 150);
        contentPane.add(lbl);
        
        lbl1 = new JLabel("Employee-Name");
        lbl1.setForeground(Color.BLACK);
        lbl1.setFont(new Font("Times New Roman", Font.BOLD, 25));
        lbl1.setBounds(50, 115, 550, 150);
        contentPane.add(lbl1);
        
        ename = new JTextField();
        ename.setFont(new Font("Tahoma", Font.PLAIN, 20));
        ename.setBounds(300, 175, 250, 40);
        contentPane.add(ename);
 
        lbl2 = new JLabel("Designation");
        lbl2.setForeground(Color.BLACK);
        lbl2.setFont(new Font("Times New Roman", Font.BOLD, 25));
        lbl2.setBounds(50, 175, 550, 150);
        contentPane.add(lbl2);
        
        designation = new JTextField();
        designation.setFont(new Font("Tahoma", Font.PLAIN, 20));
        designation.setBounds(300, 235, 250, 40);
        contentPane.add(designation);
        
        lbl3 = new JLabel("Address");
        lbl3.setForeground(Color.BLACK);
        lbl3.setFont(new Font("Times New Roman", Font.BOLD, 25));
        lbl3.setBounds(50, 235, 550, 150);
        contentPane.add(lbl3);

        address = new JTextField();
        address.setFont(new Font("Tahoma", Font.PLAIN, 20));
        address.setBounds(300, 295, 250, 40);
        contentPane.add(address);
        
        lbl4 = new JLabel("State");
        lbl4.setForeground(Color.BLACK);
        lbl4.setFont(new Font("Times New Roman", Font.BOLD, 25));
        lbl4.setBounds(50, 295, 550, 150);
        contentPane.add(lbl4);

        state = new JTextField();
        state.setFont(new Font("Tahoma", Font.PLAIN, 20));
        state.setBounds(300, 355, 250, 40);
        contentPane.add(state);
        
        lbl5 = new JLabel("Pincode");
        lbl5.setForeground(Color.BLACK);
        lbl5.setFont(new Font("Times New Roman", Font.BOLD, 25));
        lbl5.setBounds(50, 355, 550, 150);
        contentPane.add(lbl5);

        pincode = new JTextField();
        pincode.setFont(new Font("Tahoma", Font.PLAIN, 20));
        pincode.setBounds(300, 415, 250, 40);
        contentPane.add(pincode);
        
        lbl6 = new JLabel("Contact No.");
        lbl6.setForeground(Color.BLACK);
        lbl6.setFont(new Font("Times New Roman", Font.BOLD, 25));
        lbl6.setBounds(650, 115, 550, 150);
        contentPane.add(lbl6);
        
        contactNo = new JTextField();
        contactNo.setFont(new Font("Tahoma", Font.PLAIN, 20));
        contactNo.setBounds(850, 175, 250, 40);
        contentPane.add(contactNo);
        
        lbl7 = new JLabel("Contact-Id");
        lbl7.setForeground(Color.BLACK);
        lbl7.setFont(new Font("Times New Roman", Font.BOLD, 25));
        lbl7.setBounds(650, 175, 550, 150);
        contentPane.add(lbl7);
        
        contactId = new JTextField();
        contactId.setFont(new Font("Tahoma", Font.PLAIN, 20));
        contactId.setBounds(850, 235, 250, 40);
        contentPane.add(contactId);
        
        lbl8 = new JLabel("Employee-Id");
        lbl8.setForeground(Color.BLACK);
        lbl8.setFont(new Font("Times New Roman", Font.BOLD, 25));
        lbl8.setBounds(650, 235, 550, 150);
        contentPane.add(lbl8);
  
        eid = new JTextField();
        eid.setFont(new Font("Tahoma", Font.PLAIN, 20));
        eid.setBounds(850, 295, 250, 40);
        contentPane.add(eid);
        
        lbl9 = new JLabel("Salary");
        lbl9.setForeground(Color.BLACK);
        lbl9.setFont(new Font("Times New Roman", Font.BOLD, 25));
        lbl9.setBounds(650, 295, 550, 150);
        contentPane.add(lbl9);
  
        salary = new JTextField();
        salary.setFont(new Font("Tahoma", Font.PLAIN, 20));
        salary.setBounds(850, 355, 250, 40);
        contentPane.add(salary);
        
        button1 = new JButton("Add Employee");
        button1.setForeground(new Color(0, 0, 0));
        button1.setBackground(UIManager.getColor("Button.disabledForeground"));
        button1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String  empname   = ename.getText();
                String  desig  = designation.getText();
                String  add    = address.getText();
                String  sta  = state.getText();
                String  pin    = pincode.getText();
                String  phone  = contactNo.getText();
                String  mail   = contactId.getText();
                String  id    = eid.getText();
                String  sala   = salary.getText();
                
                try {
                    Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ntcc",
                        "root", "a7n8s4h0");

                    PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("INSERT INTO EMPLOYEE_DATA(EMP_ID,EMP_NAME,DESIGNATION,SALARY,ADDRESS,STATE,PINCODE,"
                                + "CONTACT_NUMBER,CONTACT_ID)" + "VALUES(?,?,?,?,?,?,?,?,?)");
                        st.setString(1, id);
                        st.setString(2, empname);
                        st.setString(3, desig);
                        st.setString(4, sala);
                        st.setString(5, add);
                        st.setString(6, sta);
                        st.setString(7, pin);
                        st.setString(8, phone);
                        st.setString(9, mail);
                        st.executeUpdate();
                        
                        dispose();
                        dispose();
                        AdminHome ah = new AdminHome(name);
                        ah.setTitle("Welcome");
                        ah.setVisible(true);
                        
                        JOptionPane.showMessageDialog(button1, "Kindly also add Login Deatails of Employee");
                    
                } catch (SQLException sqlException) {
                    sqlException.printStackTrace();
                }
            }
        });
                    button1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        button1.setBounds(875, 415, 200, 30);
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
        button2.setBounds(875, 475, 200, 30);
        contentPane.add(button2);   }
}