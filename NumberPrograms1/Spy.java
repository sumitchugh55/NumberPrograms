public class Spy {
    public static void main(String[] args) {
        int n=1241;
        int sum=0;
        int prod=1;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            prod*=rem;
n/=10;
        }
        

        if(sum==prod){
            System.out.println("Spy number");
        }
        else{
            System.out.println("Not a spy number");
        }
    }
}
