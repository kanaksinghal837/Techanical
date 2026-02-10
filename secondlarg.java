public class secondlarg {
    public static void main(String[] args) {
        int [] arr = { 4 , 5 , 6 , 2, 0};
        int max = arr[0];
        int secondmax = arr[0];
        for(int i = 0 ; i < arr.length ; i++){
            if (arr[i]> max){
                max = arr[i];
            }
        }
        for(int j = 0 ; j<arr.length ; j++){
            if(arr[j] > secondmax &&  max > arr[j] ){
                secondmax = arr[j];
            }

        }
        System.out.println(secondmax);
    }
}
