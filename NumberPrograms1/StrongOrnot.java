import java.util.Scanner;

class StrongOrnot{

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();


        int temp=n;
        int sum=0;
        while(n>0){
            int rem=n%10;
            int fact=1;
            for(int i=1;i<=rem;i++){
                fact=fact*i;

            }
            sum+=fact;

            n/=10;
        }

        if(temp==sum){
            System.out.println("Strong number");
        }
        else{
            System.out.println("Not strong number");
        }
    }
}