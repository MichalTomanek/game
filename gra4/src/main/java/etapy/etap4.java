/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package etapy;

/**
 *
 * @author mishi
 */
import com.mycompany.gra4.main.GamePanel;
import entity.obiekt1A;
import entity.obiekt2;
import entity.obiekt3;
import entity.ship;
import java.awt.Graphics2D;

/**
 *
 * @author mishi
 */
public class etap4 extends etap{
    ship S;
    obiekt1A o1;
    int i,a;
    Thread GThread;
    obiekt2 l1;
    obiekt3 o2, o3, o4;
    int tr;
    GamePanel GP;
    public etap4(ship S,GamePanel GP, int tr){
        this.a = 0;
        this.S = S;
        this.GP = GP;
        this.i = 0;
        if(tr==1){
            this.o1 = new obiekt1A(GP,S,800,200,0,5,0.01,0.001);
            this.o2 = new obiekt3(GP,S,0,0,1600,200,1,2,2.3,-0.05,0.05,0.003);
            this.o3 = new obiekt3(GP,S,0,0,1600,200,1,2,2.3,-0.05,0.05,0.003);
            this.o4 = new obiekt3(GP,S,0,0,1600,200,0,2,2.3,-0.05,0.05,0.003);
        }
        if(tr==2){
            this.o1 = new obiekt1A(GP,S,800,200,0,5,0.01,0.001);
            this.o2 = new obiekt3(GP,S,0,0,1600,200,2,2,2.3,-0.05,0.05,0.003);
            this.o3 = new obiekt3(GP,S,0,0,1600,200,1,2,2.3,-0.05,0.05,0.003);
            this.o4 = new obiekt3(GP,S,0,0,1600,200,1,2,2.3,-0.05,0.05,0.003);
        }
        if(tr==3){
            this.o1 = new obiekt1A(GP,S,800,200,1,5,0.01,0.001);
            this.o2 = new obiekt3(GP,S,0,0,1600,200,1,1.5,1.7,-0.05,0.05,0.003);
            this.o3 = new obiekt3(GP,S,0,0,1600,200,1,1.5,1.7,-0.05,0.05,0.003);
            this.o4 = new obiekt3(GP,S,0,0,1600,200,1,2,2.3,-0.05,0.05,0.003);
        }
        if(tr==4){
            this.o1 = new obiekt1A(GP,S,800,200,2,6,0.01,0.001);
            this.o2 = new obiekt3(GP,S,0,0,1600,200,2,1.5,1.7,-0.05,0.05,0.003);
            this.o3 = new obiekt3(GP,S,0,0,1600,200,1,1.5,1.7,-0.05,0.05,0.003);
            this.o4 = new obiekt3(GP,S,0,0,1600,200,1,2,2.3,-0.05,0.05,0.003);
        }
        if(tr==5){
            this.o1 = new obiekt1A(GP,S,800,200,4,6,0.01,0.001);
            this.o2 = new obiekt3(GP,S,0,0,1600,200,3,1.5,1.7,-0.05,0.05,0.003);
            this.o3 = new obiekt3(GP,S,0,0,1600,200,3,1.5,1.7,-0.05,0.05,0.003);
            this.o4 = new obiekt3(GP,S,0,0,1600,200,3,2,2.3,-0.05,0.05,0.003);
        }

    }

    public void update(Graphics2D g2){
        if(this.i<120*15){
            if(i%4 == 0){
                o1.shoot();
            }
            o1.go(g2);
            o2.update(g2);
            o3.update(g2);
            o4.update(g2);
        }
        if(this.i < 120*20 && this.i>120*15){
            o1.shoot();
        }
        if(this.i>120*15){
            o1.go(g2);
            o2.go(g2);
            o3.go(g2);
            o4.go(g2);
        }
        if(i>120*22){
            GP.k += 1;
        }
        this.i += 1;
    }
}
