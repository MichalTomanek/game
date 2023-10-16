/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package etapy;

import com.mycompany.gra4.main.GamePanel;
import entity.obiekt1;
import entity.ship;
import java.awt.Graphics2D;

/**
 *
 * @author mishi
 */
public class etap1 extends etap{
    ship S;
    obiekt1 o1;
    int i;
    public int a;
    Thread GThread;
    GamePanel GP;
    long T0, T1;
    public etap1(ship S,GamePanel GP, int tr){
        this.S = S;
        this.GP = GP;
        this.i = 0;
        this.a = 0;
        if(tr == 1){
            this.o1 = new obiekt1(GP, this.S, 800, 250, 2, 1, 0.002, 0.0008);
        }
        if(tr == 2){
            this.o1 = new obiekt1(GP, this.S, 800, 250, 3, 1, 0.002, 0.0008);
        }
        if(tr==3){
            this.o1 = new obiekt1(GP, this.S, 800, 250, 4, 3, 0.002, 0.0008);
        }
    }
    
    public void update(Graphics2D g2){
        if(i<120*18){
            o1.update(g2);
        }
        if(i>120*18){
            o1.go(g2);
        }
        if(i<120*8){
            o1.s=o1.s+6/(double)(120*8);
        }
        if(i>120*8 && i<(int)120*15){
            o1.s=o1.s-(double)10/(double)(120*6);
        }
        if(i>120*22){
            GP.k += 1;
        }
        i=i+1;
        
    }
}
    
