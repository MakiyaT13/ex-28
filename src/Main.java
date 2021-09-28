/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Makiya Thomas
 */

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int i = 0;
    int sum = 0;
   for ( i = 0; i <= 4; i++){
     System.out.print("Enter a number: ");
     int number = input.nextInt();

     sum += number;
   }
    
    System.out.printf("The total is %d", sum);
  }
}