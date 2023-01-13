package com.sytax_review2;

public class ifStatement {
    public static void main(String[] args) {
        /* if statement - conditional statetment

        if(boolean condition) {
              code;
        }
        */
        //>, >=, <, <=, !=, ==
        int day = 2;

        if (day == 1) {
            System.out.println("It's the first day of month");
        }

        String month = "December";

        if (month.equals("December")) {
            System.out.println("It's Chrismas time");
        }

        boolean evening = true;

        if (evening) {
            System.out.println(("I might have a class at Sytax"));
        }
    }
}
