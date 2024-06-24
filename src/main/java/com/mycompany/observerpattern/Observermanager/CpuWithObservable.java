package com.mycompany.observerpattern.Observermanager;

import java.util.Observable;

public class CpuWithObservable extends Observable {
    private float temperature;

    public void setTemperature(float temperature) {
        float oldTemperature = this.temperature;
        this.temperature = temperature;
        setChanged();
        notifyObservers(new TemperatureChangeEvent(this, oldTemperature, temperature));
    }
}