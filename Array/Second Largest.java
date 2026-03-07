class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        Arrays.sort(arr);
        int max=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]>arr[i-1]){
                return arr[i-1];
            }
            
            else if (arr[i]==arr[0]){
                return -1;
                
            }
            
        }
        return -1;
    }
}
