import java.util.Scanner;

/**
This program:
Will estimate a childs height based on the height of the parents.
Will ask for both parents heights using a foot and inch method
Will ask for the childs gender and accept both upper and lower case inputs.
Will convert height into all inches.
Will utilize formulas to calculate the childs height.
Will display the output in a nicely formatted message in feet and inches.
  
The formulas used are: 
Hmale_child = ((Hmother * 13/12) + Hfather)/2
Hfemale_child = ((Hfather * 13/12) + Hmother)/2

@author Timothy McWatters
@version 1.0

COP2253    Workshop 6
File Name: Height.java
*/

public class Height {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      
      // Variable Declarations  
      String gender = "";    
      int HmotherFeet = 0;
      int HmotherInches = 0;
      int Hmother = 0;
      int HfatherFeet = 0;
      int HfatherInches = 0;
      int Hfather = 0;
      int Hmale_child = 0;
      int Hmale_childFeet = 0;
      int Hmale_childInches = 0;
      int Hfemale_child = 0;
      int Hfemale_childFeet = 0;
      int Hfemale_childInches = 0;
      
      
      // Introduction and gather childs gender
      System.out.println("This program will calculate a childs height based on their parents heights.");
      System.out.println("To perform these calculations we need to gather a little information.");
      System.out.println();
      System.out.println("What is the childs gender M or F ?");
      gender = keyboard.next();
      
      // Gather the mothers height info   
      System.out.println("Using a Foot and Inches model, type your mothers height starting with feet: ");
      HmotherFeet = keyboard.nextInt();
      System.out.println("Now type your mothers remaining inches: ");
      HmotherInches = keyboard.nextInt();
      Hmother = (HmotherFeet * 12) + HmotherInches;
      
      // Gather the fathers height info
      System.out.println();
      System.out.println("Using a Foot and Inches model, type your fathers height starting with feet: ");
      HfatherFeet = keyboard.nextInt();
      System.out.println("Now type your fathers remaining inches: ");
      HfatherInches = keyboard.nextInt();
      Hfather = (HfatherFeet * 12) + HfatherInches;
      
      // Perform calculations and give formatted output depending on gender selected in step 1
      if ((gender.equals("m")) || (gender.equals("M"))) {
         Hmale_child = ((Hmother * 13/12) + Hfather)/2;
         Hmale_childFeet = Hmale_child / 12;
         Hmale_childInches = Hmale_child % 12;
         System.out.printf("The estimated child height is %d' %d\"", Hmale_childFeet, Hmale_childInches);
      }
      else if ((gender.equals("f")) || (gender.equals("F"))) {
         System.out.println("Female");
         Hfemale_child = ((Hfather * 13/12) + Hmother)/2;
         Hfemale_childFeet = Hfemale_child / 12;
         Hfemale_childInches = Hfemale_child % 12;
         System.out.printf("The estimated child height is %d' %d\"", Hfemale_childFeet, Hfemale_childInches);
      }
      else { 
         System.out.println("That was not a proper gender, please start the program over again and select M/F or m/f for gender.");
      } 
   }
}
