public class compare {
    public static void main(String[] args) {

        //here s1 and s2 are of same location as after s1 when s2 is created , the s2 is overwrite on s1 place
        String s1  =  "ashu";
        String s2  =  "ashu";

        //using new keyword a new string is created
        String s3  =  new String("ashu");

        if(s1==s2){
            System.out.println("print equals");
        }
        else{
            System.out.println("not equals");
        }

        if(s1==s3){
            System.out.println("print equals");
        }
        else{
            System.out.println("not equals");
        }

        //to compare only values use equals
        if(s1.equals(s3)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
