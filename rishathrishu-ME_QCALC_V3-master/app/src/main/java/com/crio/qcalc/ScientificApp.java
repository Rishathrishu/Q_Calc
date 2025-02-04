package com.crio.qcalc;

public class ScientificApp {
    public String getGreeting() {
        return "Hello World!";
    }
    
 public static void main(String[] args) {

    System.out.println(new App().getGreeting());

    ScientificCalculator calc = new ScientificCalculator();

    double result= calc.cubeOf(4.0);

    System.out.println("cube =" + result);

}

}
