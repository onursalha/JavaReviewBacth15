package com.sytax_review2;

public class IfElseIf {
    public static void main(String[] args) {

        /* when we have more conditions to test

        if (boolean condition) {
        code A;
        } else if (boolean condition) {
           code B;
        } else if (boolean condition) {
           code C;
        }
        */

        /* Check Homework
          if you completed more than 25 -> great job
          if you completed more than >20 -> good job
          if you completed more than >10 -> ok job
          if you completed more than >5 -> not good job
         */
        int homeWork = 10;
        if (homeWork > 25) {
            System.out.println("Great job!!");
        } else if (homeWork > 20) {
            System.out.println("Good job");
        } else if (homeWork > 10) {
            System.out.println("Ok job");
        } else if (homeWork > 5) {
            System.out.println("Not good job");
        }

        System.out.println(" -----------------------------");

        String browser = "opera";

        if (browser.equals("chrome")) {
            System.out.println("Test cases executed on chrome browser");
        } else if (browser.equals("safari")) {
            System.out.println("Test cases executed on safari browser");
        } else if (browser.equals("firefox")) {
            System.out.println("Test cases executed on firefox browser");
        } else  { // when non of the conditions are true, code comes to else block
            System.out.println("Browser is not supported");

        }
    }
}
