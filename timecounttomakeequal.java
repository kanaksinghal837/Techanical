public class timecounttomakeequal {
    public static void main(String[] args) {
        int [] arr = { 0, -1, -2 , 0};
        int time = 0 ;
        int max = arr[0];
        for(int i = 1 ; i<arr.length ; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        for(int i = 0 ; i<arr.length ; i++){
            time +=max-arr[i];
        }
        System.out.println(time);
    }
}
