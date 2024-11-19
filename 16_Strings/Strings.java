//Strings are immutable

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {

        //Intialization
        char arr[] = {'a','b','c'};
        String s= "abcd";
        String z=new String("hello world");

        //take input
        Scanner sc = new Scanner(System.in);
        String name = sc.next(); //take string of one word
        String name1 = sc.nextLine(); //take full line

        // System.out.print(name); //ashu
        // System.out.print(name1); //ashu bansal


        //in-built function
        // String str = "ashu";
        // System.out.println(str.length());
      
        //Concatenation
       String firstname = "ashu";
       String Lastname = "bansal";
       String fullname = firstname+" " + Lastname;
       //System.out.println(fullname); //ashu bansal

      System.out.println(fullname.charAt(3));
       



    }    
}
