/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author mishi
 */
import main2.GamePanel;
import javax.swing.JFrame;

/**
 *
 * @author mishi
 */
public class gra4 {
    public static void main(String[] args){
                                                                                                                                   
                                                                                                                                        
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("gra4");
        
        GamePanel GP = new GamePanel(1,0,4);
        window.add(GP);
        window.pack();
        
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        GP.startGThread();
    }
}
