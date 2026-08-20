package com.exprnc.traffic_analyzer;

class TrafficAnalyzer {

    int getMaxTraffic(int[] trafficData) {
        var maxTraffic = 0;
        for (var traffic : trafficData) {
            maxTraffic = Math.max(maxTraffic, traffic);
        }
        return maxTraffic;
    }

}
