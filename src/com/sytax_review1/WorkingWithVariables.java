package com.sytax_review1;

public class WorkingWithVariables {

    public static void main(String[] args) {

        // create a variable and store value into it
        // declared a variable and initialized it
        int number =10;

        // declared a variable
        int num;
        // declaration of a variable happens only once
        num=100; //initialize the variable
        num=200; //reassign the value;
        num=2000;
        num=5000;


        System.out.println(num); //200

        boolean hungry=false;
        hungry=true;

        System.out.println(hungry);

        String myString="Hello";
        String name="Onur";
        String address="123 Test Drive";

        //Hello Onur
        System.out.println(myString+" "+name);
        int age=25;

        //Onur is 25 years old
        System.out.println(name+ " is "+age+" years old");

        /*
        if we want to attach String to anything:
        string to another string
        string to int
        string to boolean
        string to char ...
        we use +  --> acts as concatenation
         */

        //when we have 2 numeric values + acts as addition
        System.out.println(number+num);

        String n1="10";
        System.out.println(n1+num);

        String month="December";
        int day=14;

        //14 December
        System.out.println( day+" "+month);

        char date='1';
        System.out.println( date+month);
        System.out.println(date+day);


    }
}
