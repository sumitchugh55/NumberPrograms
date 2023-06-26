public class Sunny {
    public static void main(String[] args) {
        int n=8;
        boolean flag =false;
        int num=n+1;
        for(int i=1;i<=num;i++){
            if(i*i==num){
               flag=true;

            }
        }

        if(flag){
            System.out.println("Sunny Number");
        }
        else{
            System.out.println("Not a sunnu number");
        }
    }
}
