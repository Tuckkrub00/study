public class CountEven {
    public static int countEven(int[] a){
        int crout = 0;
        for(int i =0;i<a.length;i++){
            if(a[i]%2 == 0){
                crout++;
            }
        }
        return crout;
    }
}
