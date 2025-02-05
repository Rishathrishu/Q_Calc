package com.crio.qcalc;

public class debug {
    public static void main(String[] args){//arrays of strings ["hello","world"]
    int number = 12345;
                        
            // Variable to store the reversed number
        int reversed = 0;

        greet("rishath");

        add(4,5);

            // Loop to reverse the number
        while (number != 0) {
                int digit = number % 10;  // Get the last digit
                reversed = reversed * 10 + digit;  // Add the digit to the reversed number
                number /= 10;  // Remove the last digit from the number
        }

            // Display the reversed number
            System.out.println("Reversed number: " + reversed);
        }

        public static void greet(String name){
            System.out.println("hey how are you!!" + name);
        }

        public static void add(int num1 , int num2){
            System.out.println(num1 + num2);
        }
}
