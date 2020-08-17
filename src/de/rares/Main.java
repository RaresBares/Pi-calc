package de.rares;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import de.rares.*;

public class Main {


    public static void main(String[] args) {
        System.out.println("Please Time teh accurancy: NUMBER [ 10 - 100.000.000 recommended ]");
        Scanner sc = new Scanner(System.in);
        long times = sc.nextLong();

        long points = 0;
        long pointsInElemCircle = 0;

        long pointsK = 0;
        long pointsInElemCircleK = 0;



        for (long i = 0; i < times; i++) {
            Point p = new Point(randInt(), randInt());
            if(points <999) {
                points += 1;
            }else if (points == 999){
                points = 0;
                pointsK += 1;
            }

            if (p.distanceToZero() <= 1) {

                if(pointsInElemCircle <999) {
                    pointsInElemCircle += 1;
                }else if (pointsInElemCircle == 999){
                    pointsInElemCircle = 0;
                    pointsInElemCircleK += 1;
                }
            }



        }




        System.out.println("Pi-Approximation is => " + 4.0* (pointsInElemCircle + (pointsInElemCircleK * 1000)) / ( points + (pointsK * 1000)) );

    }

    public static double randInt() {
        return Math.random();
    }

}
