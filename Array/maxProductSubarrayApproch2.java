package Array;   //smipler code of the same problem 
public class maxProductSubarrayApproch2 {
     int maxProduct(int[] arr) {
        // code here
        int n=arr.length;
        int max=arr[0];
        int min=arr[0];
        int res=arr[0];
        for(int i=1;i<n;i++){
            int x=arr[i];
            if(x<0){
                int temp=max;
                max=min;
                min=temp;
            }
            max=Math.max(x,max*x);
            min=Math.min(x,min*x);
            res=Math.max(res,max);
        }
        return res;
    }
}
