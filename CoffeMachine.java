/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffemachine;

/**
 *
 * @author paony
 */
import java.util.Scanner;
public class CoffeMachine {
    static Scanner scanner = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here
        
        //StepsToMakeCoffee();
        //CoffeeIngridentsEstimate();
        // CheckCoffeeCapacityInmachine();
        Status();
        Action();
        //...
        end();
        
    }
    
        static void Status() {
        int w = 400;
        int m = 540;
        int b = 120; 
        int c = 9;
        int mo = 550;
        System.out.println("The coffee machine has:");
        System.out.println(w + " " + "of water");
        System.out.println(m + " " + "of milk");
        System.out.println(b + " " + "of coffee beans");
        System.out.println(c + " " + "of disposable cups");
        System.out.println(mo + " " + "of money");
    }    
       
    static void Action() {
        int w = 400;
        int m = 540;
        int b = 120; 
        int c = 9;
        int mo = 550;
        int cost;
        String option = null;
        
       /*
         String choice = null;
        Scanner scan = new Scanner(System.in);
        do {
            choice = scan.nextLine();
            switch (choice) {
            case "a":
        .........
            } // end of switch
        } while (!choice.equals("q")); // end of loop
        
        */ 
        
        
        do {  
        
        System.out.println("Write action (buy, fill, take, remaining, exit):");
      
        option = scanner.nextLine();
        System.out.println();
        
        switch (option) { 
            case "buy":
          
            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
            String type = scanner.nextLine();
            switch (type) {
                case "1":
                if (w - 250 < 0) {
            System.out.println("Sorry, not enough water!");
            } else if (b - 16 < 0) {
                System.out.println("Sorry, not enough coffee!");

            }else {
                System.out.println("I have enough resources, making you a coffee!");

                w = w - 250;
                b = b - 16;
                cost = 4;
                mo = mo + cost;
                c = c - 1;

            }
                break;
                case "2":
                if (w - 350 < 0) {
            System.out.println("Sorry, not enough water!");
            } else if (b - 16 < 0) {
                System.out.println("Sorry, not enough coffee!");
            } else if (m - 75 < 0) {
                System.out.println("Sorry, not enough milk!");
   
            } else {
                System.out.println("I have enough resources, making you a coffee!");

                w = w - 350;
                b = b - 20;
                m = m - 75;
                cost = 7;
                mo = mo + cost;
                c = c - 1;

                }            
                break;
                case "3":
                if (w - 200 < 0) {
                System.out.println("Can't make coffee, not enough water");
                } else if (b - 12 < 0) {
                System.out.println("Can't make coffee, not enough coffee");
                } else if (m - 100 < 0) {
                System.out.println("Can't make coffee, not enough milk");
                } else {
                System.out.println("I have enough resources, making you a coffee!");
                w = w - 200;
                b = b - 12;
                m = m - 100;
                cost = 6;
                mo = mo + cost;
                c = c - 1;

                }
                break;
                case "back":
                
            }

                break;
                case "fill":
                System.out.println("Write how many ml of water do you want to add:"); 
                int waterAdded = scanner.nextInt();
                System.out.println("Write how many ml of milk do you want to add:"); 
                int milkAdded = scanner.nextInt();
                System.out.println("Write how many grams of coffee beans do you want to add:"); 
                int coffeeBeanAdded = scanner.nextInt();
                System.out.println("Write how many disposable cups of coffee do you want to add:"); 
                int cupsAdded = scanner.nextInt();
                w = w + waterAdded;
                b = b + coffeeBeanAdded;
                m = m + milkAdded;
                c = c + cupsAdded;
                scanner.nextLine();

                break;
                case "take":
                System.out.println("I gave you $" + mo);
                mo = mo - mo;
                break;
                case "remaining":
                System.out.println("The coffee machine has:");
                System.out.println(w + " " + "of water");
                System.out.println(m + " " + "of milk");
                System.out.println(b + " " + "of coffee beans");
                System.out.println(c + " " + "of disposable cups");
                System.out.println(mo + " " + "of money");
                break;
                case "exit":
                System.exit(0);
            }
           
                   System.out.println();

        
        }   while (!option.equals("exit"));
          
       
    } 
    static void end() {
    }
     
}  

/*

run:
The coffee machine has:
400 of water
540 of milk
120 of coffee beans
9 of disposable cups
550 of money
Write action (buy, fill, take, remaining, exit):
remaining

The coffee machine has:
400 of water
540 of milk
120 of coffee beans
9 of disposable cups
550 of money

Write action (buy, fill, take, remaining, exit):
buy

What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:
2
I have enough resources, making you a coffee!

Write action (buy, fill, take, remaining, exit):
remaining

The coffee machine has:
50 of water
465 of milk
100 of coffee beans
8 of disposable cups
557 of money

Write action (buy, fill, take, remaining, exit):
buy

What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:
2
Sorry, not enough water!

Write action (buy, fill, take, remaining, exit):
fill

Write how many ml of water do you want to add:
1000
Write how many ml of milk do you want to add:
0
Write how many grams of coffee beans do you want to add:
0
Write how many disposable cups of coffee do you want to add:
0

Write action (buy, fill, take, remaining, exit):
buy

What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:
2
I have enough resources, making you a coffee!

Write action (buy, fill, take, remaining, exit):
take

I gave you $564

Write action (buy, fill, take, remaining, exit):
buy

What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:
back

Write action (buy, fill, take, remaining, exit):
remaining

The coffee machine has:
700 of water
390 of milk
80 of coffee beans
7 of disposable cups
0 of money

Write action (buy, fill, take, remaining, exit):
exit

BUILD SUCCESSFUL (total time: 2 minutes 6 seconds)

*/