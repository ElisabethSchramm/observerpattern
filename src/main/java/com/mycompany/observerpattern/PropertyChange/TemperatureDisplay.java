package com.mycompany.observerpattern.PropertyChange;

import javax.swing.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * GUI der CPU-Temperatur
 */
public class TemperatureDisplay implements PropertyChangeListener {

    private JLabel label; // JLabel zum Anzeigen der Temperatur

    public TemperatureDisplay(final CPU cpu, String name) {
        JFrame frame = new JFrame(name);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        label = new JLabel("CPU Temperatur: ");
        frame.add(label);
        frame.setVisible(true);
    }

    /**
     * Anzeige der Temperatur ändern
     * @param temperature
     */
    private void updateDisplay(float temperature) {
        System.out.println("temperatureDisplay.updateDisplay(" + temperature + ")");
        label.setText("CPU Temperature: " + temperature + "°C");
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("temperatureDisplay.propertyChange(Event von " + (Float) evt.getNewValue() + ")");
        if ("temperature".equals(evt.getPropertyName())) {
            float newTemperature = (Float) evt.getNewValue();
            updateDisplay(newTemperature);
        }
    }
}