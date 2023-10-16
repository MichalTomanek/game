/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gra4.main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author mishi
 */
public class KeyHandler implements KeyListener {
    public boolean up, down, left, right;
    @Override
    public void keyTyped(KeyEvent e) {
   
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if(code == KeyEvent.VK_UP){
            up=true;
        }
        if(code == KeyEvent.VK_DOWN){
            down=true;
        }
        if(code == KeyEvent.VK_LEFT){
            left=true;
        }
        if(code == KeyEvent.VK_RIGHT){
            right=true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
                int code = e.getKeyCode();
        if(code == KeyEvent.VK_UP){
            up=false;
        }
        if(code == KeyEvent.VK_DOWN){
            down=false;
        }
        if(code == KeyEvent.VK_LEFT){
            left=false;
        }
        if(code == KeyEvent.VK_RIGHT){
            right=false;
        }
    }
    
}
 