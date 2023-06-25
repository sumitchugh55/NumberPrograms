public class SunnyNumber {
    public static void main(String[] args) {
        int n=8;
        int n1=n+1;
        boolean flag=false;
        for(int i=1;i<=n1;i++){
            if(i*i==n1){
                flag=true;
            }

        }
        if(flag){
            System.out.println("sunny number");
        }
        else{
            System.out.println("Not a sunny number");
        }

    }
}
