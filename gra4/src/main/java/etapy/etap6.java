/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package etapy;

/**
 *
 * @author mishi
 */
import main2.GamePanel;

import entity.obiekt1B;

import entity.obiekt7;
import entity.ship;
import java.awt.Graphics2D;

/**
 *
 * @author mishi
 */
public class etap6 extends etap{
    ship S;
    int i,a;
    int c;
    Thread GThread;
    obiekt7 o1;
    obiekt1B o2, o3, o4;
    int tr;
    GamePanel GP;
    public etap6(ship S,GamePanel GP, int tr){
        this.a = 0;
        this.S = S;
        this.GP = GP;
        this.i = 0;
        
        if(tr==1){
            this.o1 = new obiekt7(GP,S,800,200,8,6,1,4);
            this.o2 = new obiekt1B(GP,S,800,200,1,6,0.01,0.001,0,0.1);
            this.o3 = new obiekt1B(GP,S,800,200,0,6,-0.01,-0.001,1,0.1);
            this.o4 = new obiekt1B(GP,S,800,200,0,5,0.01,-0.001,2,0);
            this.c = 60;
        }
        if(tr==2){
            this.c = 60;
            this.o1 = new obiekt7(GP,S,800,200,8,8,1.2,4);
            this.o2 = new obiekt1B(GP,S,800,200,1,6,0.01,0.001,0,0.5);
            this.o3 = new obiekt1B(GP,S,800,200,1,6,-0.01,-0.001,1,0.5);
            this.o4 = new obiekt1B(GP,S,800,200,0,5,0.01,-0.001,2,0);
        }
        if(tr==3){
            this.c = 120;
            this.o1 = new obiekt7(GP,S,800,200,12,12,2,4);
            this.o2 = new obiekt1B(GP,S,800,200,1,6,0.01,0.001,0,0.5);
            this.o3 = new obiekt1B(GP,S,800,200,1,6,-0.01,-0.001,1,0.5);
            this.o4 = new obiekt1B(GP,S,800,200,2,2,0.01,-0.001,2,10);
        }
        if(tr==4){
            this.c = 60;
            this.o1 = new obiekt7(GP,S,800,200,12,12,2,4);
            this.o2 = new obiekt1B(GP,S,800,200,1,6,0.01,0.001,0,0.5);
            this.o3 = new obiekt1B(GP,S,800,200,1,6,-0.01,-0.001,1,0.5);
            this.o4 = new obiekt1B(GP,S,800,200,2,4,0.01,-0.001,2,10);
        }
    }
    public void update(Graphics2D g2){
        if(this.i < 120 * 15 && this.i % this.c == 0){
            o1.shoot(S);
        }
        if(this.i<120 * 15){
            o2.shoot();
            o3.shoot();
            o4.shoot();
        }
        if(i>120*17){
            GP.k += 1;
        }
        o1.go(g2);
        o2.go(g2);
        o3.go(g2);
        o4.go(g2);
        this.i += 1;
    }
}
