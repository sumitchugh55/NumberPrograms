class SmallestDigitOfNumber {
    public static void main(String[] args) {
        int n=1045;
        int rem,small=n%10;

        while(n>0){
             rem=n%10;
            if(small>rem){
                small=rem;

            }
            n/=10;
        }
        System.out.println(small);
    }
}
