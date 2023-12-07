package com.design_patterns.structural.proxy;

import java.util.Scanner;

public class Client {
    public static void main(DroneProxy proxy) {
        // perpetual loop that received pilot actions
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String action = scanner.nextLine();

            switch (action) {
                case "left": {
                    proxy.turnLeft();
                    break;
                }

                case "right": {
                    proxy.turnRight();
                    break;
                }

                case "fire": {
                    proxy.firstMissile();
                    break;
                }

                default:
                    System.out.println("Invalid Action");
            }
        }
    }
}
