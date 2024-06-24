package org.example;

public class Substract {

    int number1;
    int number2;
    int substract;

    public void substraction(){
        substract = number1 -number2;
        if (substract<5) {
            System.out.println("The number is less than five");
            System.out.println(substract);
        } else if (substract>5 && substract<20){
            System.out.println("");

        }

    }
}
