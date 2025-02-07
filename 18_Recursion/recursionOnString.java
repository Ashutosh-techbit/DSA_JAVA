public class recursionOnString {
    
    //remove character from string
    private static String Helper(String str, StringBuilder str2, char c, int i) {
        // Base case: if index reaches the end of the string, return the final result
        if (i >= str.length()) {
            return str2.toString();
        }

        // If the current character is not the one to skip, append it to str2
        if (str.charAt(i) != c) {
            str2.append(str.charAt(i));
        }

        // Recursive call with the next index
        return Helper(str, str2, c, i + 1); 
    }
    public static String skipChar(String str, char c) {
        StringBuilder str2 = new StringBuilder();
        return Helper(str, str2, c, 0);
    }



    //remove specific substring from a string
    public static String skipString(String str){
        if(str.isEmpty()){
            return " ";
        }

        if(str.startsWith("low")){
            return skipString(str.substring(3));
        }
        else{
            return str.charAt(0) + skipString(str.substring(1));
        }

    }




    public static void main(String[] args) {
        System.out.println(skipChar("bacbbaa", 'a'));
        System.out.println(skipString("Helloworld"));
    }
}
