package com.mycompany.observerpattern.antipattern;

/**
 *
 * @author liz
 */
public class AntipatternExample implements Runnable{

    @Override
    public void run() {
       new AntipatternGUI();
    }
}
