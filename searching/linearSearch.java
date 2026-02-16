package searching;
public class linearSearch {
    
    static int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            // Check each element one by one
            if (arr[i] == key)
                return i;
        }
        // Key not found
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int key = 3;

        int index = search(arr, key);
        System.out.println(index); 
    }
}
