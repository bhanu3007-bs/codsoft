// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class MainATM {
   public MainATM() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      BankAccount var2 = new BankAccount(1000.0);
      ATM var3 = new ATM(var2);

      int var4;
      do {
         System.out.println("\n===== Welcome to the ATM =====");
         System.out.println("1. Check Balance");
         System.out.println("2. Deposit");
         System.out.println("3. Withdraw");
         System.out.println("4. Exit");
         System.out.print("Enter your choice (1-4): ");

         while(!var1.hasNextInt()) {
            System.out.print("Invalid input. Please enter a number between 1-4: ");
            var1.next();
         }

         var4 = var1.nextInt();
         switch (var4) {
            case 1:
               var3.checkBalance();
               break;
            case 2:
               System.out.print("Enter amount to deposit: ₹");
               double var5 = var1.nextDouble();
               var3.deposit(var5);
               break;
            case 3:
               System.out.print("Enter amount to withdraw: ₹");
               double var7 = var1.nextDouble();
               var3.withdraw(var7);
               break;
            case 4:
               System.out.println("Thank you for using the ATM. Goodbye!");
               break;
            default:
               System.out.println("Invalid choice. Please try again.");
         }
      } while(var4 != 4);

      var1.close();
   }
}