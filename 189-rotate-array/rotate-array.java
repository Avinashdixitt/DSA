class Solution {
    public void rotate(int[] arr, int d) {
        d=d%arr.length;
        
        int n=arr.length;
        arr = reverse1(arr, 0, n - 1);
    // Reverse first d elements
    arr = reverse1(arr, 0, d - 1);
    // Reverse the remaining n - d elements
    arr = reverse1(arr, d, n - 1);
    }
    static int[] reverse1(int[] arr,int s,int e){
        while(s<=e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
        return arr;
        
    }
}