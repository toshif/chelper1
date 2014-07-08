package utils;

/**
 * Created by toshif on 7/6/14.
 */
public class Permutation {

    private int[] arr;

    private int N;

    private int[] indexes;

    private int pStack = 0;

    /**
     * init with the given array
     */
    public Permutation(int[] arr){
        init(arr);
    }

    /**
     * Initialize with the size n of natural numbers 0, 1, 2, ... n-1.
     */
    public Permutation(int n){
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        init(arr);
    }

    private void init(int[] arr){
        this.arr = arr;
        N = arr.length;
        indexes = new int[N];
    }

    public int[] nextPermutation(){

        
        return null;
    }

    void next(){
        if (pStack == N) return;

        for (int i = 0; i < N; i++) {

        }
    }

    public static void main(String[] args){

    }
}
