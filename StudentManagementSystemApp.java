// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class StudentManagementSystemApp {
   public StudentManagementSystemApp() {
   }

   public static void main(String[] var0) {
      StudentManagementSystemApp$StudentManagementSystem var1 = new StudentManagementSystemApp$StudentManagementSystem();
      Scanner var2 = new Scanner(System.in);

      int var3;
      do {
         System.out.println("\n--- Student Management System ---");
         System.out.println("1. Add Student");
         System.out.println("2. Edit Student");
         System.out.println("3. Search Student");
         System.out.println("4. Display All Students");
         System.out.println("5. Remove Student");
         System.out.println("6. Exit");
         System.out.print("Enter your choice: ");

         while(!var2.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            var2.next();
         }

         var3 = var2.nextInt();
         var2.nextLine();
         String var4;
         String var6;
         String var7;
         switch (var3) {
            case 1:
               System.out.print("Enter name: ");
               var4 = var2.nextLine();
               System.out.print("Enter roll number: ");
               String var5 = var2.nextLine();
               System.out.print("Enter grade: ");
               var6 = var2.nextLine();
               System.out.print("Enter email: ");
               var7 = var2.nextLine();
               if (!var4.isEmpty() && !var5.isEmpty() && !var6.isEmpty() && !var7.isEmpty()) {
                  var1.addStudent(new StudentManagementSystemApp$Student(var4, var5, var6, var7));
                  System.out.println("Student added successfully.");
                  break;
               }

               System.out.println("All fields are required!");
               break;
            case 2:
               System.out.print("Enter roll number of student to edit: ");
               String var8 = var2.nextLine();
               StudentManagementSystemApp$Student var9 = var1.searchStudent(var8);
               if (var9 != null) {
                  System.out.print("Enter new name: ");
                  var4 = var2.nextLine();
                  System.out.print("Enter new grade: ");
                  var6 = var2.nextLine();
                  System.out.print("Enter new email: ");
                  var7 = var2.nextLine();
                  var1.editStudent(var8, var4, var6, var7);
                  System.out.println("Student updated.");
               } else {
                  System.out.println("Student not found.");
               }
               break;
            case 3:
               System.out.print("Enter roll number to search: ");
               String var10 = var2.nextLine();
               StudentManagementSystemApp$Student var11 = var1.searchStudent(var10);
               System.out.println(var11 != null ? var11 : "Student not found.");
               break;
            case 4:
               var1.displayAllStudents();
               break;
            case 5:
               System.out.print("Enter roll number to remove: ");
               String var12 = var2.nextLine();
               boolean var13 = var1.removeStudent(var12);
               System.out.println(var13 ? "Student removed." : "Student not found.");
               break;
            case 6:
               System.out.println("Exiting...");
               break;
            default:
               System.out.println("Invalid choice.");
         }
      } while(var3 != 6);

      var2.close();
   }
}
