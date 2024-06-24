package com.mycompany.observerpattern.Observermanager;

public class TemperatureChangeEvent {
    private final Object source;
    private final float oldTemperature;
    private final float newTemperature;

    public TemperatureChangeEvent(Object source, float oldTemperature, float newTemperature) {
        this.source = source;
        this.oldTemperature = oldTemperature;
        this.newTemperature = newTemperature;
    }

    public Object getSource() {
        return source;
    }

    public float getOldTemperature() {
        return oldTemperature;
    }

    public float getNewTemperature() {
        return newTemperature;
    }
}