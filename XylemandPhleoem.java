public class XylemandPhleoem {
    public static void main(String[] args) {
        int n=1234;
        int Innersum=0;
        int n1=n%10;
        n/=10;
        while(n>9){
            int rem=n%10;
            Innersum+=rem;
            n/=10;
         }
         System.out.println(Innersum);
         int outersum=n1+n;
         System.out.println(outersum);



         if(outersum==Innersum){
            System.out.println("xylem");
         }
         else{
            System.out.println("phlem");
         }

    }
}
