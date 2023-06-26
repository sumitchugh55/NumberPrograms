public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 156;
        int count = 0;
        int t1 = n;
        int t2 = n;
        int arm = 0;
        while (t1 > 0) {
            count++;
            t1 /= 10;

        }
        while (t2 > 0) {
            int rem = t2 % 10;
            int mul = 1;
            for (int i = 1; i <= count; i++) {
                mul *= rem;
            }
            arm += mul;
            t2 /= 10;
        }

        if (n == arm) {
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not an Armstorng number");
        }
    }
}
