package com.SURAJ;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int house_rent = 0;
        String Student_hostel;

        System.out.println("MEDI LUCK HOSTEL ");
        System.out.println("NUMBER OF ROOMS");
        System.out.println("enter 1 for downstair, 2 for second floor, 3 for first floor1");
        Scanner RN = new Scanner(System.in);
        int hostel = RN.nextInt();

        if (hostel == 1) {
            Student_hostel = "down stair";
            house_rent += 110000;
            System.out.println(house_rent);
        } else if (hostel == 2) {
            Student_hostel = "second floor";
            house_rent += 115000;
            System.out.println(house_rent);
        } else if (hostel == 3) {
            Student_hostel = "first floor";
            house_rent += 105000;
            System.out.println(house_rent);
        } else {
            System.out.println("  room not available");
        }
    }
}