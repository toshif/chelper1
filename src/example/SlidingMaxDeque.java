package example;

import java.util.ArrayDeque;

/**
 * O(n) to manage the max value for a sliding window
 *
 * <p>
 * http://www.geeksforgeeks.org/maximum-of-all-subarrays-of-size-k/
 * <p>
 * http://articles.leetcode.com/sliding-window-maximum/
 * <p>
 * Created by chelsea on 19/02/2017.
 */
public class SlidingMaxDeque {

    int A[] = {1, 3, -1, -3, 5, 3, 6, 7};

    int n = A.length;

    int k = 3;

    void slide() {
        // deque holds indexes of array elements
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n - k + 1; i++) {

            if (i == 0) {
                // Process first k (or first window) elements
                for (int j = 0; j < k; j++) {

                    // the previous smaller elements are useless
                    while (!deque.isEmpty() && A[j] >= A[deque.getLast()]) {
                        deque.removeLast();
                    }
                    deque.addLast(j);
                }
            } else {
                // Window [i, i + k - 1]

                // Remove the elements which are out of this window
                while ((!deque.isEmpty()) && deque.getFirst() < i) {
                    deque.removeFirst();
                }

                // Remove all elements smaller than the current element
                while ((!deque.isEmpty()) && A[deque.getLast()] < A[i + k - 1]) {
                    deque.removeLast();
                }

                deque.addLast(i + k - 1);
            }

            System.out.println(A[deque.getFirst()]);
        }
    }

    public static void main(String[] args) {
        new SlidingMaxDeque().slide();
    }

}
