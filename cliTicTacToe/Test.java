//package cliTicTacToe;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Test
 */

public class Test {
     static Scanner sc = new Scanner(System.in);
    static void play() {
        System.out.println("playing");
        char [][] boad = new char [3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                boad[i][j] = 's';
        }
        for (char[] row : boad)
            System.out.println(Arrays.toString(row)); 
        for(int i=1;i<=9;i++){
            if (i%2!=0) {
                System.out.println("player 1 turn ");
                

            }
            else{
                System.out.println("p2");
            }
        }        
    }
    public static void main(String[] args) {
        int run;
        do {
            System.out.println("Press 1 to play\nPress 0 to exit");
            run = sc.nextInt();
            switch (run) {
                case 1:
                    play();
                    break;
                default:
                    break;
            }
        }while (run != 0);
        sc.close();
    }
}