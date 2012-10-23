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
public class Central {
    
protected static Semaphore oFinP1,oFinP3;
public static void main(String[] args) {
oFinP1 = new Semaphore(0,true);
oFinP3 = new Semaphore(0,true);
(new Thread(new Verde(oFinP1))).start();
(new Thread(new Amarillo(oFinP1))).start();
(new Thread(new Rojo(oFinP1))).start();


}
}