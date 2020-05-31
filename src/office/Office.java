/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package office;

import java.awt.EventQueue;

/**
 *
 * @author anshh
 */
public class Office {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Login frame = new Login();
                    frame.setVisible(true);
                    frame.setTitle("OFFICE EASY SYSTEM");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
}
