public class XylemOrphloem {
   public static void main(String[] args) {
    int n=1238;
    int Outersum=0;
    int innersum=0;

int remainder=n%10;

    int n1=n/10;
    while(n1>9){
        int rem=n1%10;
        innersum+=rem;
        n1/=10;


    }
    Outersum=n1+remainder;
   if(Outersum==innersum){
    System.out.println("Xylem");
   }
   else{
    System.out.println("phlem");
   }
   } 
}
