package com.mycompany.observerpattern.observer;

import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

/**
 * Konkreter Observer
 * markiert, dass sich die Temperatur geändert hat
 */
public class TemperatureDisplayObserver implements Observer {

    private JLabel labelTemperature; //JLabel zum Anzeigen der Temperatur

    /**
     * Fenster mit Label zum Anzeigen der Temperatur erstellen
     */
    public TemperatureDisplayObserver(String name) {
        JFrame frame = new JFrame(name);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        labelTemperature = new JLabel("Temperaturanzeige: in °C");
        frame.add(labelTemperature);
        frame.setVisible(true);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("TemperatureDisplayObserver.update(" + o.getClass().getName() + ", " + arg + ")");
        if (o instanceof CpuObservable) {//ist übergebens Observable ein CpuOservable ist
            try {
                float temperature = (Float) arg; //mitgegebens Objekt zum Float casten
                //Text des Labels mit neuer Temparatur befüllen
                labelTemperature.setText("Temperaturanzeige: " + temperature + "°C");
            }
            catch (ClassCastException e){
                throw e;
            }
        }
    }
}
