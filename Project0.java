/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project0;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lampr
 */
public class Project0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner sc = new Scanner ( System.in );
//        Ask from the user the following questions and store the answers to appropriate variables:
//        1. What is the name of the user?
          System.out.println("What is your name? ");
          // store the name in a variable
          String a = sc.next();
          //System.out.println(a);
//        2. What year you were born?
          System.out.println("What year you were born? ");
          // store the year in a variable
          Integer b = sc.nextInt();
          int f = 2020 - b;
          //System.out.println(b);
//        3. What is the name of the city you were born?
          System.out.println("What is the name of the city you were born? ");
          // store the year in a variable
          String c = sc.next();
          //System.out.println(c);
          int h = 0;
          int i = 0; 
          int p = 0;
          String q = "";
          String r = "";
          ArrayList<String> Names = new ArrayList<String>();
          ArrayList<Integer> Ages = new ArrayList<Integer>();
          
//        4. Are you married?
          System.out.println("Are you married? ");
          String d = sc.next();
          q = d;
//            (if the answer is Yes ask)
              if ("yes".equals(d)) {
//            4a. How many years have you been married?
              System.out.println("How many years have you been married? ");
              // store the year in a variable
              h = sc.nextInt();
              //System.out.println(h);
//            4b. What year did you get married?
              System.out.println("What year did you get married? ");
              // store the year in a variable
              i = sc.nextInt();
              //System.out.println(i);
//            4c. Do you have any children?
              System.out.println("Do you have any children? ");
              
              
                  // store the answer in a variable
                  String g = sc.next();
                  r = g;
//                (if the answer is Yes ask)
                  if ("yes".equals(g)) {
                   
                  
//                4d. How many children do you have?
                  System.out.println("How many children do you have? ");
                  // store the year in a variable
                  
                  int j = sc.nextInt();
                  p = j;
                  
                  //System.out.println(j);
                  int[] arrayNumChildren = new int[j];
                  
                  
//                    (if the answer is more than 0 ask)
                      
//                    4e. What is the name of your i child?
                      
//                    4f. What is the age of your i child?
                      
//                    4g. What is the name of your j child
//                    4h. What is the age of your j child?
                      for(int k = 0; k < j; k++){
                          System.out.println("What is the name of your " + ( k + 1 ) + " child? ");
                          // store the name in the arraylist
                          Names.add(sc.next());
                          System.out.println("What is the age of your " + ( k + 1 ) + " child? ");
                          // store the name in the arraylist
                          Ages.add(sc.nextInt());
                      }
                      
                      //System.out.println(Names);
                      //System.out.println(Ages);
                  }
              }
          
//        5. What is your favourite color?
          System.out.println("What is your favourite color? ");
          // store the year in a variable
          String e = sc.next();
          //System.out.println(e);
//        
// 
//
//
//        The output of the program should be:
//
//
//
//        Dear {name}, your were born in {year} so you are {age} and born in the city of {city}.
//        You are not married and your favourite color is {color}.
          
          
          
          if ("yes".equals(r)) {System.out.print("Dear " + a + ", your were born in " + b + " so you are " + f + " years old and born in the city of " + c + ".You have been married for " + h + " years and you got married in " + i + " and you have " + p + " children.");} //+ ( for (int n = 0; n <j ; n++) { System.out.print("The name of your " + ( n + 1 ) + " child is: " + (arrayNamesChildren[n]) + "and was born in the year of " + (arrayAgeChildren[n]) + ".");}) + "Your favourite color is " + e + ".");
          else if ("yes".equals(q)) {System.out.println("Dear " + a + ", your were born in " + b + " so you are " + f + " years old and born in the city of " + c + ".You have been married for " + h + " years and you got married in " + i + " and you don't have any children.Your favourite color is " + e + ".");}
          else {System.out.println("Dear " + a + ", your were born in " + b + " so you are " + f + " years old and born in the city of " + c + ".You are not married and your favourite color is " + e + ".");}


//        

          for(int m = 0; m < p; m++){
                          System.out.print("The name of your " + ( m + 1 ) + " child is: " + Names.get(m) + ".");                 
                          System.out.print("The age of your " + ( m + 1 ) + " child is: " + Ages.get(m) + " years old.");                
          }
          
          if ("yes".equals(r)) {System.out.println("Your favourite color is " + e + ".");}
//                           OR
//
//        Dear {name}, your were born in {year} so you are {age} and born in the city of {city}.
//        You have been married for {marriedYears} and you got married in {yearOfMarriage} and you don't have any children.
//        Your favourite color is {color}.
//
//
//
//                            OR
//
//        Dear {name}, your were born in {year} so you are {age} and born in the city of {city}.
//        You have been married for {marriedYears} and you got married in {yearOfMarriage} and you have X children.
//        The name of your i child is {nameOfChild_i} and was born in the year of {bornYearChild_i}.
//        The name of your j child is {nameOfChild_j} and was born in the year of {bornYearChild_j}.
//        Your favourite color is {color}.

    }
          
          public static void method1 () {
          
          }

}
