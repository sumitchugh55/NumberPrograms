public class Neon {
    public static void main(String[] args) {
        int n=10;
        int sum=0;

        int square=n*n;
        while(square!=0){
            int rem=square%10;
            sum+=rem;
            square/=10;
        }

        if(sum==n){
            System.out.println("Neon number");
        }
        else{
            System.out.println("Not a neon number");
        }
    }
}
