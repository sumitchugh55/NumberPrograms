public class HappyOrNot {

    static int ishappy(int n) {
        int sum = 0;
        while (n > 0) {
            int remainder = n % 10;
            sum += (remainder * remainder);
            n /= 10;

        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 81;
        int result = n;
        while (result != 1 && result != 4) {
           result= ishappy(result);

        }

        if (result == 1) {
            System.out.println("happy  umber");
        } else if (result == 4) {
            System.out.println("Sad number");
        }

    }

}
