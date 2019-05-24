package com.company;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input n1 ");
        String name1 = in.next();
        System.out.print("Input n2 ");
        String name2 = in.next();
        System.out.print("Input operator: ");
        String name = in.next();

        Pattern patternRome = Pattern.compile("[IVXLCDM]");
        Pattern patternArab = Pattern.compile("[0-9]");
        if (patternRome.matcher(name1).find()){
            int num1 = RomeNumbers.convertRA(name1);
            int num2 = RomeNumbers.convertRA(name2);
            int sum=ArithmeticFunction.arithmetic(num1,name,num2);
            System.out.println("Result=" + sum);
        }
        else if (patternArab.matcher(name1).find()){
            int num1=Integer.parseInt(name1);
            int num2=Integer.parseInt(name2);
            System.out.println("Result=" + ArithmeticFunction.arithmetic(num1,name,num2));
        }
    }
}
