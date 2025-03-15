public class inttobinary {

    public static String intoBinary(int n ){
         String result = "";
         while(n!=0){
            if(n%2==1){
                result +="1";
            }
            else{
                result+="0";
            }
            n=n/2;
         }
         StringBuffer res = new StringBuffer();

         res.append(result);
         res.reverse();
         return res.toString();
    }

    public static void main(String[] args) {
        String ans = intoBinary(12);
        System.out.println(ans);
    }
}
