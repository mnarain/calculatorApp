package sr.unasat.calculator.app;

import sr.unasat.calculator.service.CalculateService;

public class Application {

    public static void main(String[] args) {
        CalculateService calculateService = new CalculateService();
        calculateService.multiply(20,30);
        calculateService.divide(20,30);
        calculateService.add(20,30);
        calculateService.subtract(20,30);

    }
}
