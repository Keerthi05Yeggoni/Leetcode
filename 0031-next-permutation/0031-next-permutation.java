class Solution {
    public void nextPermutation(int[] arr) {
        int n = arr.length;
        int p = -1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                p=i;
                break;
            }
        }
        if(p==-1){
            reverse(arr,0,n-1);
            return;
        }
        for(int i=n-1;i>p;i--){
            if(arr[i]>arr[p]){
                swap(arr,i,p);
                break;
            }
        }
            reverse(arr,p+1,n-1);
        }
        public static  void reverse(int[] arr, int s, int e){
            while(s<e){
                swap(arr,s++,e--);
            }
        }
        public static void swap(int[] arr, int i, int j){
      int temp = arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
        

    }
}