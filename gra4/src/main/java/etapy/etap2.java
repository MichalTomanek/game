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
import entity.laser1;
import entity.obiekt1;
import entity.obiekt2;
import entity.pocisk2;
import entity.ship;
import java.awt.Graphics2D;

/**
 *
 * @author mishi
 */
public class etap2 extends etap{
    ship S;
    obiekt1 o1;
    int i, a;
    Thread GThread;
    obiekt2 p2;
    int tr;
    GamePanel GP;
    long T0, T1;
    public etap2(ship S,GamePanel GP, int tr){
        this.S = S;
        this.GP = GP;
        this.i = 0;
        this.a = 0;
        if(tr == 2){
            this.p2 = new obiekt2(GP, S, 800, 200, 1, 11, 0.5, 0.1 , 0, 0.001,15);
            this.o1 = new obiekt1(GP, this.S, 800, 250, 1, 4, 0.008, 0.002);
        }
        if(tr == 3){
            this.p2 = new obiekt2(GP, S, 800, 200, 1, 14, 0.5, 0.12 , 0, 0.0015,15);
            this.o1 = new obiekt1(GP, this.S, 800, 250, 2, 4, 0.012, 0.003);
        }
    }

    public void update(Graphics2D g2){
       
        if(i<120*25){
        if(this.i%15 == 0){
            p2.shoot();
        }
        p2.go(g2);
        if(i>120*10){
                o1.update(g2);
            }
        }
        if(i>120*25 && i<120*30){
            p2.go(g2);
            o1.go(g2);
            
        }
        if(i>120*30){
            GP.k += 1;
        }
        this.i = this.i + 1;
    }
}

