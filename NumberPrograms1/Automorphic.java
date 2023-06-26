public class Automorphic {

    public static boolean isAutomorphic(int n){
        int square=n*n;

        while(n>0){
            if(n%10!=square%10)  {     
             return false;}

             n/=10;
             square/=10;


            
        }
        return true;

    }
    public static void main(String[] args) {
       int  n=145;
        System.out.println(isAutomorphic(625)?"Automorphic":"Not Automorphic");
        
    }
}
