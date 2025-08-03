 // Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.HashMap;
import java.util.Scanner;

public class Main {
   public Main() {
   }

   public static void main(String[] var0) {
      HashMap var1 = new HashMap();
      var1.put("USD", 1.0);
      var1.put("INR", 83.5);
      var1.put("EUR", 0.91);
      var1.put("GBP", 0.78);
      var1.put("JPY", 157.3);
      var1.put("AUD", 1.48);
      Scanner var2 = new Scanner(System.in);
      System.out.print("Enter base currency (e.g. USD): ");
      String var3 = var2.next().toUpperCase();
      System.out.print("Enter target currency (e.g. INR): ");
      String var4 = var2.next().toUpperCase();
      System.out.print("Enter amount to convert: ");
      double var5 = var2.nextDouble();
      if (var1.containsKey(var3) && var1.containsKey(var4)) {
         double var7 = var5 / (Double)var1.get(var3);
         double var9 = var7 * (Double)var1.get(var4);
         System.out.printf("%.2f %s = %.2f %s\n", var5, var3, var9, var4);
      } else {
         System.out.println("Unsupported currency. Supported: USD, INR, EUR, GBP, JPY, AUD");
      }

      var2.close();
   }
}