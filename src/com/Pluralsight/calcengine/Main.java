package com.Pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {
        double val1 = 100.0d, val2 = 50.0d, result;
        char opcode = 'd';

        if (opcode == 'a')
            result = val1 + val2;
        else if (opcode == 's')
            result = val1 - val2;
        else {
            if (opcode == 'd')
                result = val2 != 0.0d ? val1 / val2 : 0.0d;
            else if (opcode == 'm') {
                result = val1 * val2;
            } else {
                System.out.println("Error - invalid opCode");
                result = 0.0d;
            }
        }

        System.out.println(result);
    }
}
