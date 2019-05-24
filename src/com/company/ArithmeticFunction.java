package com.company;

class ArithmeticFunction {  // Калькулятор
    public static int arithmetic(int a, String operator, int b) {
       if (operator.equals("+")) return a+b;
       if (operator.equals("-")) return a-b;
       if (operator.equals("*")) return a*b;
       if (operator.equals("/")) return a/b;
       else return 0;
    }
}