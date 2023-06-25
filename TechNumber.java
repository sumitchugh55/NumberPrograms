public class TechNumber {
    public static void main(String[] args) {
        int n=9801;
        int num=n;
        int digit=0;
        while(num>0){
            digit++;
            num/=10;

        }

        if(digit%2==0){

            int firsthalf=n%(int)Math.pow(10,digit/2);
            int secondhalf=n/(int)Math.pow(10, digit/2);

            int result=(firsthalf+secondhalf)*(firsthalf+secondhalf);


            if(result==n){
                System.out.println("technumber");
            }
            else{
                System.out.println("Not a tech number");
            }
        }
             else{
            System.out.println("Not a tech number");
        }
    }
}
