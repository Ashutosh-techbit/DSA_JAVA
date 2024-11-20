//Strings are immutable

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {

        // Intialization
        char arr[] = { 'a', 'b', 'c' };
        String s = "abcd";
        String z = new String("hello world");

        // take input
        Scanner sc = new Scanner(System.in);
        String name = sc.next(); // take string of one word
        String name1 = sc.nextLine(); // take full line

        // System.out.print(name); //ashu
        // System.out.print(name1); //ashu bansal

        // =================in-built function=================
        // String str = "ashu";
        // System.out.println(str.length());

        // ==============Concatenation===================
        String firstname = "ashu";
        String Lastname = "bansal";
        String fullname = firstname + " " + Lastname;
        // System.out.println(fullname); //ashu bansal
        // System.out.println(fullname.charAt(3));



        // =============String Builder=========\
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        // O(26)
        // System.out.println(sb);




        // =======function to capitalize first character of every word if it is not
        StringBuilder result = new StringBuilder("");
        String str = "heelo world how R u";

        char ch = Character.toUpperCase(str.charAt(0));
        result.append(ch);

        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == ' ' && i < str.length())
             {
                result.append(str.charAt(i));
                i++;
                char w = Character.toUpperCase(str.charAt(i));
                result.append(w);
            } 
            else
            {
                result.append(str.charAt(i));
            }
        }

        System.out.println(result);

    }
}
