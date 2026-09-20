import java.util.*;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int arr[] = new int[n+m];
        for(int i = 0; i<n; i++){
            arr[i] = nums1[i];
        }
        for(int i =0; i<m; i++){
            arr[n + i] = nums2[i];
        }
        Arrays.sort(arr);
        int total = arr.length;
        if(total % 2 != 0){ // odd
           return  arr[total/2];
        }
        // even
        int mid1 = arr[total/2-1]; // use BODMAS , fisrt divide
        int mid2 = arr[total/2];

        return (mid1 + mid2)/2.0;
    }
}