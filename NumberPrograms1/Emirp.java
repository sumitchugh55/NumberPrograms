public class Emirp {
    public static void main(String[] args) {
        int n=14;
        int t1=n;
        int counter=0;
        int count=0;
        for(int i=2;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }

        if(count==1){
           
            int reverse=0;
            while(t1>0){
                int rem=t1%10;
                reverse=reverse*10+rem;
                t1/=10;

            }
            int rev=reverse;
           
            for(int i=2;i<=rev;i++){
                if(rev%i==0){
                    counter++;

                }
            }
            if(counter==1){
                System.out.println("Emirp number");
            }
            else{
                System.out.println("Not an emirp number");
            }
        }
        else{
            System.out.println("Not an emirp number");
        }
    }
}
