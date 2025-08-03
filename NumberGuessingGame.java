// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
   public NumberGuessingGame() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      Random var2 = new Random();

      boolean var3;
      do {
         int var4 = var2.nextInt(100) + 1;
         int var5 = 0;
         byte var6 = 10;
         boolean var7 = false;
         System.out.println("Welcome to the Number Guessing Game!");
         System.out.println("I have selected a number between 1 and 100. You have " + var6 + " attempts to guess it.");

         while(var5 < var6 && !var7) {
            System.out.print("Enter your guess: ");
            int var8 = var1.nextInt();
            ++var5;
            if (var8 < var4) {
               System.out.println("Too low! Try again.");
            } else if (var8 > var4) {
               System.out.println("Too high! Try again.");
            } else {
               var7 = true;
               System.out.println("Congratulations! You've guessed the number in " + var5 + " attempts.");
            }
         }

         if (!var7) {
            System.out.println("Sorry, you've used all your attempts. The number was: " + var4);
         }

         System.out.print("Do you want to play again? (yes/no): ");
         String var9 = var1.next();
         var3 = var9.equalsIgnoreCase("yes");
      } while(var3);

      System.out.println("Thank you for playing!");
      var1.close();
   }
}