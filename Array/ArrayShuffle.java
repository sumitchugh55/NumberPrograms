import java.util.Arrays;
import java.util.Random;

public class ArrayShuffle {
    public static void main(String[] args) {
        int[] arr={1,5,7,8};
        Random rand=new Random();
        for(int i=0;i<arr.length;i++){
            int randomIndexToswap=rand.nextInt(arr.length);
            int temp=arr[randomIndexToswap];
            arr[randomIndexToswap]=arr[i];
            arr[i]=temp;
            
        }
        System.out.println(Arrays.toString(arr));
    }
}
