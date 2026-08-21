package com.exprnc.iot_system;

final class Main {

    static void main() {
        var abstractDevice = new IoTDevice(1, "Abstract Device");
        var smartLight = new SmartLight(2);
        var smartThermostat = new SmartThermostat(3);
        performActions(abstractDevice, smartLight, smartThermostat);
        smartThermostat.setTemperature(23);
        smartThermostat.performAction();
    }

    private static void performActions(IoTDevice... devices) {
        for (var device : devices) {
            device.performAction();
        }
    }

}
