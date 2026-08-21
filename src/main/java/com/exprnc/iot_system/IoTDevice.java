package com.exprnc.iot_system;

import lombok.extern.slf4j.Slf4j;

import static java.util.Objects.requireNonNull;

@Slf4j
class IoTDevice {

    protected final long id;
    protected final String name;

    IoTDevice(long id, String name) {
        requireNonNull(name);
        this.id = id;
        this.name = name;
    }

    void performAction() {
        log.info("Performing action for device: {}", name);
    }

}
