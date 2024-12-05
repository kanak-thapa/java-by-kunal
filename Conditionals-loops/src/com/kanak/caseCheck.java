package com.kanak;

import java.util.Scanner;

public class caseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.nextLine().trim().charAt(0);
        if(ch>='a' && ch<='z'){
            System.out.println("lowerCase");
        }
        else{
            System.out.println("upperCase");
        }
        //System.out.println(input.nextLine().trim());
    }
}
