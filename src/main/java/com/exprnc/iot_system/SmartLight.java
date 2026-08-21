package com.exprnc.iot_system;

import lombok.extern.slf4j.Slf4j;

@Slf4j
final class SmartLight extends IoTDevice {

    private static final String DEFAULT_NAME = "Smart Light";
    private boolean isOn;

    SmartLight(long id, String name, boolean isOn) {
        super(id, name);
        this.isOn = isOn;
    }

    SmartLight(long id, String name) {
        this(id, name, false);
    }

    SmartLight(long id) {
        this(id, DEFAULT_NAME);
    }

    @Override
    void performAction() {
        var mess = isOn ? "The {} is off" : "The {} is on";
        isOn = !isOn;
        log.info(mess, name);
    }

}
