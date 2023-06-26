public class LargestDigitOfNumber {
    public static void main(String[] args) {
        int n=12304;
        int large=0;
        while(n>0){
            int rem=n%10;
            if(rem>large){
                large=rem;

            }
            n/=10;
        }
        System.out.println(large);
    }
}
