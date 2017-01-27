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
public class DigitalLock implements Lock {

    @Override
    public void close() {
         System.out.println ("Digital close method is called");
    }

    @Override
    public void open() {
        System.out.println ("Digital open method is called");
    }
    
}
