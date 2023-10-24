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

import entity.ship;
import java.awt.Graphics2D;

/**
 *
 * @author mishi
 */
public class etap5 extends etap{
    ship S;
    int i,a;
    Thread GThread;
    obiekt1B o1, o2, o3, o4, o5;
    int tr;
    GamePanel GP;
    public etap5(ship S,GamePanel GP, int tr){
        this.a = 0;
        this.S = S;
        this.GP = GP;
        this.i = 0;
        
        if(tr==1){
            this.o1 = new obiekt1B(GP,S,800,200,1,5,0.01,0.001,0,0);
            this.o2 = new obiekt1B(GP,S,800,200,1,5,-0.01,-0.001,1,0);
            this.o3 = new obiekt1B(GP,S,800,200,0,5,-0.01,-0.001,2,0);
            this.o4 = new obiekt1B(GP,S,800,200,0,5,-0.01,-0.001,3,0);
            this.o5 = new obiekt1B(GP,S,800,200,0,5,-0.01,-0.001,4,0);

        }
        if(tr==2){
            this.o1 = new obiekt1B(GP,S,800,200,1,6,0.01,0.001,0,0.1);
            this.o2 = new obiekt1B(GP,S,800,200,1,6,-0.01,-0.001,1,0.1);
            this.o3 = new obiekt1B(GP,S,800,200,0,5,-0.01,-0.001,2,0);
            this.o4 = new obiekt1B(GP,S,800,200,0,5,-0.01,-0.001,3,0);
            this.o5 = new obiekt1B(GP,S,800,200,0,5,-0.01,-0.001,4,0);

        }
        if(tr==3){
            this.o1 = new obiekt1B(GP,S,800,200,1,6,0.01,0.001,0,0.1);
            this.o2 = new obiekt1B(GP,S,800,200,1,6,-0.01,-0.001,1,0.1);
            this.o3 = new obiekt1B(GP,S,800,200,1,5,0.01,-0.001,2,0);
            this.o4 = new obiekt1B(GP,S,800,200,1,5,-0.01,-0.001,3,0);
            this.o5 = new obiekt1B(GP,S,800,200,0,5,-0.01,-0.001,4,0);

        }
        if(tr==4){
            this.o1 = new obiekt1B(GP,S,800,200,1,6,0.01,0.001,0,0.1);
            this.o2 = new obiekt1B(GP,S,800,200,1,6,-0.01,-0.001,1,0.1);
            this.o3 = new obiekt1B(GP,S,800,200,1,5,0.01,-0.001,2,0);
            this.o4 = new obiekt1B(GP,S,800,200,1,5,-0.01,-0.001,3,0);
            this.o5 = new obiekt1B(GP,S,800,200,2,5,-0.01,-0.001,4,10);

        }
    }

    public void update(Graphics2D g2){
        if(i<120*40){
            o1.update(g2);
            o2.update(g2);
            o3.update(g2);
            o4.update(g2);
            o5.update(g2);
        }
        if(i>120*40){
            o1.go(g2);
            o2.go(g2);
            o3.go(g2);
            o4.go(g2);
            o5.go(g2);
        }
        if(i>120*42){
            GP.k += 1;
        }
        this.i += 1;
    }
}
