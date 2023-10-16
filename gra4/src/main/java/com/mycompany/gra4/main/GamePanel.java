/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gra4.main;

import entity.GameOver;
import entity.Win;
import entity.obiekt1;
import entity.pocisk;
import entity.ship;
import etapy.etap;
import etapy.etap1;
import etapy.etap2;
import etapy.etap3;
import etapy.etap4;
import etapy.etap5;
import etapy.etap6;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author mishi
 */
public class GamePanel extends JPanel implements Runnable{
    KeyHandler KH = new KeyHandler();
    Thread GThread;
    long T0, T1;
    public int k, sk, ek;
    GameOver G;
    Win W;
    ship ship1 = new ship(this,KH);
    /*
    etap6 e6 = new etap6(ship1,this, 1);
    etap5 e5 = new etap5(ship1,this, 1);
    etap4 e4 = new etap4(ship1,this, 1);
    etap3 e3 = new etap3(ship1,this, 1);
    etap2 e2 = new etap2(ship1,this, 1);
    etap1 e1 = new etap1(ship1, this);
*/
    etap [] etapy = new etap[10];
    
    etap e = new etap();
    int FPS = 120;
    
    public GamePanel(int tr, int sk, int ek){
        this.setPreferredSize(new Dimension(1600,900));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.addKeyListener(KH);
        this.setFocusable(true);
        this.k = sk;
        this.sk = sk;
        this.ek = ek;
        this.G = new GameOver(this);
        this.W = new Win(this);
        etap6 e6 = new etap6(ship1,this, tr);
        etap5 e5 = new etap5(ship1,this, tr);
        etap4 e4 = new etap4(ship1,this, tr);
        etap3 e3 = new etap3(ship1,this, tr);
        //etap2 e2 = new etap2(ship1,this, tr);
        etap1 e1 = new etap1(ship1, this, tr);
        etapy[0]=e1;
        //etapy[1]=e2;
        etapy[1]=e3;
        etapy[2]=e4;
        etapy[3]=e5;
        etapy[4]=e6;
    }
    public void startGThread(){
        GThread = new Thread(this);
        GThread.start();
    }
    @Override
    public void run() {
        double Interval = 1000000000/FPS;
        double delta = 0;
        long t0 = System.nanoTime();
        long t1 = System.nanoTime();
        int i = 0;
        long timer = 0;
        long ile = 0;
        k = sk;
        while(GThread != null && k<=this.ek && ship1.hp>=0){
            t1 = System.nanoTime();
            
            delta += (t1-t0)/Interval;
            timer += (t1-t0);
            t0=System.nanoTime();
            if(delta>=1){
                i=i+1;
                update();
                repaint();
                delta--;
                ile++;
            }
            if(timer >=1000000000){
                //System.out.println("FPS: " + ile);
                ile = 0;
                timer = 0;
            }

            
        
           
        }
        repaint();
        
        
    }
    public void update(){
        ship1.update();
        
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        if(ship1.hp<0){
            G.draw(g2);
        }
        if(this.k>this.ek){
            W.draw(g2);
        }
        else{
            ship1.draw(g2);
            etapy[this.k].update(g2);
        }
        g2.dispose();
    }
}
