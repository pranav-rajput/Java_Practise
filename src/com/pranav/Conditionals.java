package com.pranav;

import java.util.Scanner;

public class Conditionals{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter salary: ");
        int salary = in.nextInt();
        if(salary > 10000 && salary < 15000){
            salary = salary + 2000;
        } else if (salary > 15000) {
            salary += 1500;

        } else{
            salary = salary +1000;
        }
        System.out.println(salary);
    }

}
