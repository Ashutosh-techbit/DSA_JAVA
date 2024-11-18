// Displacment = √((x2 – x1)² + (y2 – y1)²)
// intials points are given or (0,0)
// to calculate other two points use 
// ===== north = y+1 , south = y-1 , east = x+1 , west = x-1


public class shortestpath {
    public static float Displacment(String str){
        int x=0,y=0;
        for(int i=0;i<str.length();i++){

            //North
            if(str.charAt(i)=='N'){
                y++;
            }

            //south
            else if(str.charAt(i)=='S'){
                y--;
            }

            //east
            else if(str.charAt(i)=='E'){
                x++;
            }

            //west
            else{
                x--;
            }
        }

        int X=x*x;
        int Y=y*y;

        //gave error bcz math.sqrt() gives value in float
        float ans = (float)Math.sqrt(X+Y);


         return ans;
    }

    public static void main(String[] args) {
        String str = "NS";
        float result = Displacment(str);
        System.out.println(result);

    }
}
