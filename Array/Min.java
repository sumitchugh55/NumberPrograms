public class Min {
     public static void main(String[] args) {
        int [] arr={1,5,0,2,6};
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
