public class MaxinArray {
    public static void main(String[] args) {
        int [] arr={1,5,2,6};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
