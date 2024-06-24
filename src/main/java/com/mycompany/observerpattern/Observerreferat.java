package com.mycompany.observerpattern;

import com.mycompany.observerpattern.Observermanager.ObservermanagerExample;
import com.mycompany.observerpattern.PropertyChange.PropertyChangeExample;
import com.mycompany.observerpattern.antipattern.AntipatternExample;
import com.mycompany.observerpattern.observer.ObserverpatternExample;

/**
 *
 * @author liz
 */
public class Observerreferat {

    public static void main(String[] args) {
        // immer nur eines einkommentieren
        new Thread( new AntipatternExample()).start();
        //new Thread( new ObserverpatternExample()).start();
        //new Thread( new ObservermanagerExample()).start();
        //new Thread( new PropertyChangeExample()).start();
    }
}
