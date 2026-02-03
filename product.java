public class product {
    public static void main(String[] args) {
        int[] arr = { 1 , 2, 3 ,4 , 5};
        int pro  = 1 ;
        int[] nums = new int[arr.length];
        for(int i = 0 ; i<arr.length ; i++){
            pro*=arr[i];
        }
        for (int i = 0 ; i<arr.length ; i++){
            nums[i] = pro/arr[i];
        }
        for (int i = 0 ; i<arr.length ; i++){
            System.out.println(nums[i]);
        }
        
    }

}
