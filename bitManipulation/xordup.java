package bitManipulation;

public class xordup {
    
    // Function to find the duplicate
    // element in an array
    static int findDuplicate(int[] arr) {
        int n = arr.length;
        int res = 0;

        // XOR all numbers from 1 to n-1 and 
        // elements in the array
        for (int i = 0; i < n - 1; i++) {
            res = res ^ (i + 1) ^ arr[i];
        }
        
        // XOR the last element in the array
        res = res ^ arr[n - 1];
        
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 4};
        System.out.println(findDuplicate(arr));
    }
}
