public class TechNumber {
    public static void main(String[] args) {
        int firsthalf = 0;
        int secondhalf = 0;
        int n = 2025;
        int sum = 0;
        int digit = 0;

        int num = n;
        while (num > 0) {
            num /= 10;
            digit++;

        }
        if (digit % 2 == 0) {
            num = n;
            firsthalf = num % (int) Math.pow(10, digit / 2);
            secondhalf = num / (int) Math.pow(10, digit / 2);
            int result = (firsthalf + secondhalf) * (firsthalf + secondhalf);
            System.out.println(result);
            if (result == n) {
                System.out.println("tech number");
            } else {
                System.out.println("Not a tech number");
            }
        } else {
            System.out.println("Not a tech number");
        }

    }
}
