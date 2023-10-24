/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package etapy;

import main2.GamePanel;
import entity.obiekt1A;
import entity.obiekt2;
import entity.obiekt3;
import entity.ship;
import java.awt.Graphics2D;

/**
 *
 * @author mishi
 */
public class etap3 extends etap{
    ship S;
    obiekt1A o1;
    int i,a;
    Thread GThread;
    obiekt2 l1;
    obiekt3 o2;
    int tr;
    GamePanel GP;
    public etap3(ship S,GamePanel GP, int tr){
        this.a = 0;
        this.S = S;
        this.GP = GP;
        this.i = 0;
        if(tr==1){
            //this.o1 = new obiekt1A(GP,S,800,200,1,4,0.01,0.001);
            this.o2 = new obiekt3(GP,S,0,0,1600,200,1,0,0,0.15,0.3,0.02);
        }
        if(tr==2){
            //this.o1 = new obiekt1A(GP,S,800,200,0,4,0.01,0.001);
            this.o2 = new obiekt3(GP,S,0,0,1600,200,2,3.5,4.5,-0.05,0.05,0.02);
        }
        if(tr==3){
            //this.o1 = new obiekt1A(GP,S,800,200,2,4,0.1,0.01);
            this.o2 = new obiekt3(GP,S,0,0,1600,200,2,3.5,4.5,-0.08,0.08,0.02);
        }
        if(tr==4){
            //this.o1 = new obiekt1A(GP,S,800,200,2,4,0.1,0.01);
            this.o2 = new obiekt3(GP,S,0,0,1600,200,2,0,0,-0.08,0.08,0.1);
        }
    }

    public void update(Graphics2D g2){
        if(this.i<120*15){
            //o1.update(g2);
            o2.update(g2);
        }
        if(this.i>120*15){
            //o1.go(g2);
            o2.go(g2);
        }
        if(i>120*18){
            GP.k += 1;
        }
        this.i += 1;
    }
}
