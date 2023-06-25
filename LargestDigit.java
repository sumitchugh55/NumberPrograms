class LargestDigit{

    public static void main(String[] args) {
        int n=1274;
        int largest=0;
        while(n>0){
            int rem=n%10;
            if(rem>largest){
                largest=rem;
            }
            n/=10;
        }
        System.out.println(largest);

    }
}