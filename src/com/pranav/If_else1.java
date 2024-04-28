package com.pranav;

import java.util.Scanner;

public class If_else1 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter no: ");
        int salary = input.nextInt();
        if (salary >10000 && salary< 15000) {
            salary = salary+2000;
        }
        else if(salary>15000)
        {
                salary += 1500;
        }
        else{
            salary = salary+50000;
        }
        System.out.println(salary);
        }

    }

