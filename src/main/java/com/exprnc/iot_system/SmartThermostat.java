package com.exprnc.iot_system;

import lombok.extern.slf4j.Slf4j;

@Slf4j
final class SmartThermostat extends IoTDevice {

    private static final String DEFAULT_NAME = "Smart Thermostat";
    private static final double DEFAULT_TEMPERATURE = 10.0;
    private double temperature;

    SmartThermostat(long id, String name, double temperature) {
        super(id, name);
        this.temperature = temperature;
    }

    SmartThermostat(long id, String name) {
        this(id, name, DEFAULT_TEMPERATURE);
    }

    SmartThermostat(long id) {
        this(id, DEFAULT_NAME);
    }

    @Override
    void performAction() {
        log.info("The current temperature at the {} is {} degrees", name, temperature);
    }

    void setTemperature(double temperature) {
        this.temperature = temperature;
    }

}
