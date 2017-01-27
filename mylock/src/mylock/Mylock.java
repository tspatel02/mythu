/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylock;

/**
 *
 * @author 212066255
 */
public class Mylock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lock l = new DigitalLock();
        l.open();
        l.close();
        
        l = new KeyLock();
        l.open();
        l.close();
    }
    
}
