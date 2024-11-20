public class subString {

    //prints substring of a given string
    public static String substring(String str,int start,int end){
        String result="";
        for(int i=0;i<str.length();i++){
           if(i==start & i<end){
            result+=str.charAt(i);
            start++;
           }

        }
        return result;
    }
    public static void main(String[] args) {
       
       String result = substring("Hello world", 3, 6);
       System.out.println(result);

       String fruits[] = {"grapes","kiwi","mango","apple","zebra"};

       String largest = fruits[0];
       for(int i=0;i<fruits.length;i++){

        //return in lexical order
        //return smallest element when greater than 0 , return largest element when less than 0
        if(largest.compareTo(fruits[i])>0){
            largest=fruits[i];
        }
       }

       System.out.println(largest);
    }
}
