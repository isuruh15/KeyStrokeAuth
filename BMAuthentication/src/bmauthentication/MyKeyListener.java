/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmauthentication;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

/**
 *
 * @author isuru
 */
public class MyKeyListener implements KeyListener {
    
    private Instant start;
    private Instant end;
    public Duration timeElapsed;
    public ArrayList aList;
    
    public MyKeyListener(ArrayList al){
        this.aList = al;
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Key Pressed="+KeyEvent.getKeyText(e.getKeyCode()));
        start = Instant.now();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Key Released="+KeyEvent.getKeyText(e.getKeyCode()));
        end = Instant.now();
        timeElapsed = Duration.between(start,end);
        aList.add(timeElapsed);
        System.out.println("Time taken: "+ timeElapsed.toMillis() +" milliseconds");
    }
    
    public double getDuration(){
        return timeElapsed.toMillis(); //duration to double conversion
    }
    
    
}
