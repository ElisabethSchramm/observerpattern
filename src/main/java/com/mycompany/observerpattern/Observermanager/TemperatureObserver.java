package com.mycompany.observerpattern.Observermanager;

import com.mycompany.observerpattern.Observermanager.TemperatureChangeEvent;
import java.util.Observable;
import java.util.Observer;

public class TemperatureObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof TemperatureChangeEvent) {
            TemperatureChangeEvent temperatureChangeEvent = (TemperatureChangeEvent) arg;
            System.out.println("Temperature changed from " +
                    temperatureChangeEvent.getOldTemperature() +
                    " to " + temperatureChangeEvent.getNewTemperature());
        }
    }
}

