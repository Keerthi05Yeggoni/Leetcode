class Solution {
   // boolean 
    public int[] getNoZeroIntegers(int n) {
        int[] ar = new int[2];
        //int a = ar[0];
       // int b = ar[1];
        for(int i=1;i<n;i++){
        int j=n-i;
            //while(a>0 && b>0){
                if(!String.valueOf(i).contains("0") && !String.valueOf(j).contains("0")){
                  return new int[]{i,j};
                }
            }
        
        return new int[0];
    }
}