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
public class Amarillo extends Thread {
    

    protected Semaphore oFinP1;
    public Amarillo(Semaphore oFinP1) {
        this.oFinP1 = oFinP1;
    }

    Amarillo(Semaphore oFinP1, Semaphore oFinP3) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    public void run()  {
        try {
            sleep((int) Math.round(500 * Math.random() - 0.5));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Amarrillo");
        this.oFinP1.release(2);
    }
}

