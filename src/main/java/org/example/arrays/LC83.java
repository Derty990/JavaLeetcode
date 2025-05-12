package org.example.arrays;

public class LC83 {

//    nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int p1 = m - 1;
        int p2 = n - 1;
        int pMerge = m + n - 1;

        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[pMerge] = nums1[p1];
                p1--;
            }else{
                nums1[pMerge] = nums2[p2];
                p2--;
            }
            pMerge--;
        }
//1: p1 = 2, p2 = 2, pmerge = 5; p2-- = 1 [1,2,3,0,0,6] pmerge-- = 4
//2: p1 = 2, p2 = 1, pmerge = 4; p2-- = 0 [1,2,3,0,5,6] pmerge-- = 3
//3: p1 = 2, p2 = 0, pmerge = 3; p1-- = 2 [1,2,3,3,5,6] pmerge-- = 2
//4: p1 = 1, p2 = 0, pmerge = 2; p2-- = -1, [1,2,2,3,5,6] pmerge-- = 1
//5:
        while(p2 >=0){
            nums1[pMerge] = nums2[p2];
            p2--;
            pMerge--;
        }

    }

}
