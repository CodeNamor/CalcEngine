package com.Pluralsight.myapp;


import com.Pluralsight.calcengine.Adder;
import com.Pluralsight.calcengine.CalculateBase;
import com.Pluralsight.calcengine.CalculateHelper;
import com.Pluralsight.calcengine.Divider;
import com.Pluralsight.calcengine.DynamicHelper;
import com.Pluralsight.calcengine.InvalidStatementException;
import com.Pluralsight.calcengine.MathEquation;
import com.Pluralsight.calcengine.MathProcessing;
import com.Pluralsight.calcengine.Multiplier;
import com.Pluralsight.calcengine.PowerOf;
import com.Pluralsight.calcengine.Subtractor;

public class Main {

    public static void main(String[] args) {
//        MathEquation testEquation = new MathEquation();
//        testEquation.execute();
//        System.out.println("tests");
//        System.out.println(testEquation.getResult());

      // MathEquation[] equations = new MathEquation[4];
       // equations[0] = new MathEquation('d',100.0d, 50.0d);
       // equations[1] = new MathEquation('a',25.0d, 92.0d);
       // equations[2] = new MathEquation('s',225.0d, 17.0d);
       // equations[3] = new MathEquation('m', 11.0d, 3.0d);

        String[] statements = {
                "add 25.0 92.0",
                "power 5.0 2.0" //5.0 ^

        };


        //for (MathEquation equation : equations) {
        //    equation.execute();
        //    System.out.println("result = " + equation.getResult());
        //}

       // CalculateHelper helper = new CalculateHelper();
       // for(String statement:statements) {
       //     try {
       //         helper.process(statement);
       //         System.out.println(helper);
       //     } catch (InvalidStatementException e) {
       //         System.out.println(e.getMessage());
       //         if(e.getCause() != null)
       //             System.out.println("   Original exception: " + e.getCause().getMessage());
       //     }
       // }

        DynamicHelper helper = new DynamicHelper(new MathProcessing[] {
                new Adder(),
                new PowerOf()
        });

        for(String statement:statements){
            String output = helper.process(statement);
            System.out.println(output);
        }


        System.out.println();
        System.out.println("Using Overloads");
        System.out.println();

        double leftDouble = 9.0d;
        double rightDouble = 4.0d;
        int leftInt = 9;
        int rightInt = 4;

        MathEquation equationOverload = new MathEquation('d');

        equationOverload.execute(leftDouble,rightDouble);
        System.out.println("result = " + equationOverload.getResult());

        equationOverload.execute(leftInt,rightInt);
        System.out.println("result = " + equationOverload.getResult());

        equationOverload.execute(leftInt,rightInt);
        System.out.println("result = " + equationOverload.getResult());


        System.out.println();
        System.out.println("Using Inheritance");
        System.out.println();

        CalculateBase[] calculators = {
                new Divider(100.0d, 50.0d),
                new Adder(25.0d, 92.0d),
                new Subtractor(225.0d, 17.0d ),
                new Multiplier(11.0d, 3.0d)
        };


        for(CalculateBase calculator:calculators) {
            calculator.calculate();
            System.out.print("result=");
            System.out.println(calculator.getResult());
        }
    }

}
