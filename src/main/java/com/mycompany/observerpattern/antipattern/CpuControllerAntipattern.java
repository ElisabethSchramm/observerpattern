package com.mycompany.observerpattern.antipattern;

import javax.swing.*;

public class CpuControllerAntipattern {
    private float temperature;

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        updateTemperatureDisplay();
    }

    private void updateTemperatureDisplay() {
        // Beispiel: Direkte Referenz auf eine GUI-Komponente
        JLabel temperatureLabel = AntipatternGUI.getTemperatureLabel();
        temperatureLabel.setText("CPU Temperature: " + temperature + "°C");
    }
}