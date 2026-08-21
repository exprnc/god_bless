package com.exprnc.traffic_analyzer;

import static java.util.Objects.requireNonNull;

class TrafficAnalyzer {

    int getMaxTraffic(int[] trafficData) {
        requireNonNull(trafficData);
        var maxTraffic = 0;
        for (var traffic : trafficData) {
            maxTraffic = Math.max(maxTraffic, traffic);
        }
        return maxTraffic;
    }

}
