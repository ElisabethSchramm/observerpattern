package com.mycompany.observerpattern.Observermanager;

import com.mycompany.observerpattern.Observermanager.TemperatureChangeEvent;
import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

public class TemperatureDisplay extends JFrame implements Observer {
    private JLabel temperatureLabel;

    public TemperatureDisplay() {
        setTitle("Temperature Display");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        temperatureLabel = new JLabel("Current Temperature: N/A");
        add(temperatureLabel);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof TemperatureChangeEvent) {
            TemperatureChangeEvent temperatureChangeEvent = (TemperatureChangeEvent) arg;
            temperatureLabel.setText("Current Temperature: " + temperatureChangeEvent.getNewTemperature());
        }
    }
}