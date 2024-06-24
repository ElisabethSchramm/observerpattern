package com.mycompany.observerpattern.antipattern;
import javax.swing.*;

/**
 *
 * @author liz
 */


public class AntipatternGUI {
    private static JLabel temperatureLabel;

    public AntipatternGUI() {
        // Beispiel: GUI erstellen
        JFrame frame = new JFrame("CPU Temperature Display Antipattern");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);

        temperatureLabel = new JLabel("CPU Temperature: ");
        frame.add(temperatureLabel);

        frame.setVisible(true);

        // Beispiel: Temperaturänderung im Code
        CpuControllerAntipattern cpuController = new CpuControllerAntipattern();
        cpuController.setTemperature(70.5f);
    }
    public static JLabel getTemperatureLabel() {
        return temperatureLabel;
    }
}

