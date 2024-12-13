public class compress {
    public static void main(String[] args) {
        String s = "aaaabbbccc";
        String result = "";

        if (s.length() <= 3) {
            System.out.println(s);
        }

        for (int i = 0; i < s.length(); i++)
        {
            Integer k = 1;
            while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){
                k++;
                i++;

            }
            result+=s.charAt(i);
            if(k>1){
                result+=k.toString();
            }
        }
        System.out.println(result);
    }
}
