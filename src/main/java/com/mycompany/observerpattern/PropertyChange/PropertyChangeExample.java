package com.mycompany.observerpattern.PropertyChange;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author liz
 */
public class PropertyChangeExample implements Runnable {

    @Override
    public void run() {
        
        CPU cpu = new CPU();

        TemperatureDisplay display1 = new TemperatureDisplay(cpu, "CPU Temperatur Anzeige 1");;
        TemperatureDisplay display2 = new TemperatureDisplay(cpu, "CPU Temperatur Anzeige 2");;

        // listener hinzufügen
        cpu.addTemperatureChangeListener(display1);
        cpu.addTemperatureChangeListener(display2);

        // Simuliere periodische Aktualisierungen der CPU-Temperatur
        Timer timer = new Timer(9000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("timer.actionPerformed()");
                // Simuliere eine Änderung der CPU-Temperatur
                float newTemperature = (float) (Math.random() * 50 + 50);
                //Temperatur der CPU setzen
                cpu.setTemperature(newTemperature);
            }
        });
        timer.start();
    }
}
    

