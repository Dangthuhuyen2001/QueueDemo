/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuedemo;

/**
 *
 * @author ASUS
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        ArrayQueue q = new ArrayQueue(4);
        q.enqueue(10);
        q.enqueue(11);
        q.enqueue(12);
        q.enqueue(15);
        System.out.println("front: "+q.dequeue()); 
       System.out.println("front: "+q.front()); 
    }
}
