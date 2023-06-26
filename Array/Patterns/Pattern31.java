public class Pattern31 {
    public static void main(String[] args) {
     int n=9;
     int sp=n-2;
     int star=1;
     for(int i=0;i<n;i++){
        for(int j=0;j<star;j++){
            System.out.print("*");
        }
        for(int j=0;j<sp;j++){
            System.out.print(" ");
        }

        if(i==n/2){
            for(int j=0;j<star-1;j++){
                System.out.print("*");
            }
        }
        else{
            for(int j=0;j<star;j++){
                System.out.print("*");
            }
        }
        if(i<n/2){
            star++;
            sp-=2;
        }
        else{
            star--;
            sp+=2;
        }
        System.out.println();
     }
       
    }
}
