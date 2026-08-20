package com.exprnc.traffic_analyzer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class Main {

    static void main() {
        var trafficData = new int[]{13, 45, 23, 76, 456, 1432, 57};
        var trafficAnalyzer = new TrafficAnalyzer();
        var maxTraffic = trafficAnalyzer.getMaxTraffic(trafficData);
        log.info("Max traffic: {}", maxTraffic);
    }

}
