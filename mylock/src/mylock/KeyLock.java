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
public class KeyLock implements Lock {

    @Override
    public void close() {
        System.out.println ("KeyLock close method is called");
    }

    @Override
    public void open() {
        System.out.println ("KeyLock open method is called");
    }
    
}
