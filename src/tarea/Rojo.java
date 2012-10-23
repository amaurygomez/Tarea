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
public class Rojo  extends Thread {
    

    protected Semaphore oFinP1;
    protected Semaphore oFinP3;
    public Rojo(Semaphore oFinP1) {
      
        this.oFinP1 = oFinP1;
    }

   
    public void run()  {
        try {
        this.oFinP1.acquire();
        
        } catch(Exception e) {
            e.printStackTrace();
        }
        try {
            sleep((int) Math.round(500 * Math.random() - 0.5));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Rojo");
    }
}

