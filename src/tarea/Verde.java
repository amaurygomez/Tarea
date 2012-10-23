/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;
import java.util.concurrent.Semaphore;
/**
 *
 * @author Amaury
 */
public class Verde extends Thread{


    protected Semaphore oFinP3;
    public Verde(Semaphore oFinP3) {
        this.oFinP3 = oFinP3;
    }
    public void run()  {
        try {
            sleep((int) Math.round(500 * Math.random() - 0.5));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Verde");
        this.oFinP3.release(2);
    }
}

