public class smalldigitinnumber {
    public static void main(String[] args) {
        int n=1290356;
        int smallest=n%10;
        int rem=n%10;
        while(n>0){
            rem=n%10;
            if(smallest>rem){
                smallest=rem;
            }
            n/=10;
        }
        System.out.println(smallest);
    }
}
