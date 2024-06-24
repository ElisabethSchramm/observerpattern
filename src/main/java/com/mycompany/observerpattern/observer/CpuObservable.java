package com.mycompany.observerpattern.observer;

import java.util.Observable;

/**
 * Konkretes Subjekt
 * markiert, dass sich die Temperatur geändert hat
 * benachrichtigt Observer mit der neuen Temperatur
 */
public class CpuObservable extends Observable {
    private float temperature;

    /**
     * /**
     * Setter für die CPU-Temperatur
     * @param temperature
     */
    public void setTemperature(float temperature) {
        System.out.println("CpuObservable.setTemperature(" + temperature + ")");
        this.temperature = temperature;
        setChanged(); // Markiert, dass sich die Temperatur geändert hat
        notifyObservers(temperature); // Benachrichtigt Observer mit der neuen Temperatur
    }
}