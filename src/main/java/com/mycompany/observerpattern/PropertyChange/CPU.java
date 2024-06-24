package com.mycompany.observerpattern.PropertyChange;

import java.beans.PropertyChangeEvent;
import java.util.ArrayList;
import java.util.List;
import java.beans.PropertyChangeListener;

public class CPU {
    //Liste mit PropertyChangeListener
    private List<PropertyChangeListener> temperatureChangeListeners = new ArrayList<>();

    private float temperature;  //CPU-Temperatur

    /**
     * ActionListener zur Liste hinzufügen
     * @param listener
     */
    public void addTemperatureChangeListener(PropertyChangeListener listener) {
        System.out.println("cpu.addTemperatureChangeListener(PropertyChangeListener listener)");
        temperatureChangeListeners.add(listener);
    }

    /**
     * CPU-Temperatur der CPU setzen
     * @param temperature
     */
    public void setTemperature(float temperature) {
        System.out.println("cpu.setTemperature(" + temperature + ")");
        float oldTemperature = this.temperature;
        this.temperature = temperature;
        notifyTemperatureChangeListeners(oldTemperature, temperature);
    }

    /**
     * bei allen PropertyChangeListener der Liste temperatureChangeListeners propertyChange() auslösen
     * @param oldTemperature
     * @param newTemperature
     */
    public void notifyTemperatureChangeListeners(float oldTemperature, float newTemperature) {
        System.out.println("cpu.notifyTemperatureChangeListeners()");
        for (PropertyChangeListener listener : temperatureChangeListeners) {
            listener.propertyChange(new PropertyChangeEvent(this, "temperature", oldTemperature, newTemperature));
        }
    }
}
