package com.exprnc.auto_test_system;

class Main {

    static void main() {
        var testScenarios = new TestScenario[3];
        testScenarios[0] = new LoginTest();
        testScenarios[1] = new PaymentTest();
        testScenarios[2] = new ProductSearchTest();
        for (var scenario : testScenarios) {
            scenario.runTest();
        }
    }

}
