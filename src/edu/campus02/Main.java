package edu.campus02;

public class Main {

    public static void main(String[] args) {

        System.out.println("Vor dem Methodenaufruf");
        int resultFromMethodDoSomething = doSomething(30,50);
        System.out.println(resultFromMethodDoSomething);
        System.out.println("Nach dem Methodenaufruf");
    }

    public static int doSomething(int number1, int number2) {



        return number1 + number2;
    }
}
