

class array1 {
    public static void main(String[] args) {
        int[]arr = { -3 , 0 , 2 ,8 , 4 , 6 , 8};
        int count = 0 ;
        int max = arr[0] ;
        for (int i = 1 ; i < arr.length ; i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        for (int j = 0 ; j< arr.length ; j++){
            if(arr[j]!= max){
                count++;
            }
        }
        System.out.println(count);
        
    }
}
