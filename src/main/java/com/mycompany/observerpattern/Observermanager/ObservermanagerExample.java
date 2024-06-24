package com.mycompany.observerpattern.Observermanager;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author liz
 */
public class ObservermanagerExample implements Runnable{

    @Override
    public void run() {
        
        CpuWithObservable cpu = new CpuWithObservable();
        TemperatureObserver observer = new TemperatureObserver();
        TemperatureDisplay display = new TemperatureDisplay();

        cpu.addObserver(observer);
        cpu.addObserver(display);

        // Simuliere Temperaturänderungen mit einem Timer
        Timer timer = new Timer(true);
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                float newTemperature = (float) (Math.random() * 100);
                cpu.setTemperature(newTemperature);
            }
        }, 0, 5000); // Temperatur alle 5 Sekunden ändern
    
    }
    
}
