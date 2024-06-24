package com.mycompany.observerpattern.observer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author liz
 */
public class ObserverpatternExample implements Runnable{
    
    @Override
    public void run()
    {
    
        // neues konkretes Subjekt zum Beobachten erstellen
        CpuObservable cpuObservable = new CpuObservable();

        //neue GUIFenster, die das konkrete Subjekt beobachten, erstellen
        TemperatureDisplayObserver observer1 = new TemperatureDisplayObserver("CPU Temperatur Anzeige 1");
        TemperatureDisplayObserver observer2 = new TemperatureDisplayObserver("CPU Temperatur Anzeige 2");

        // Observer registrieren sich beim Subjekt, können viel mehr sein
        cpuObservable.addObserver(observer1);
        cpuObservable.addObserver(observer2);

        // Simuliere periodische Aktualisierungen der CPU-Temperatur mit einem Timer
        Timer timer = new Timer(10000, new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             System.out.println("Timer.actionPerformed()");
             // Simuliere eine Änderung der CPU-Temperatur
             float newTemperature = (float) (Math.random() * 50 + 50);
             //Temperatur des cpuObservable setzen
             cpuObservable.setTemperature(newTemperature);
         }
        });
        timer.start();
    } 
}
