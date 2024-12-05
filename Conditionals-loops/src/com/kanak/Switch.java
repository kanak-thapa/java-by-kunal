package com.kanak;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();//nextInt() method leaves the newline (\n) character in the input buffer.
        // Consume the leftover newline character
        String department = in.nextLine();

        switch (empID) {
            case 1:
                System.out.println("Kunal Kushwaha");
                break;
            case 2:
                System.out.println("Rahul Rana");
                break;
            case 3:
                System.out.println("Emp Number 3");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No department entered");
                        break;
                }
                break;
            case 4:
                System.out.println("kanak thapa");
                break;
            default:
                System.out.println("Enter correct EmpID");
                break;
        }
    }
}
