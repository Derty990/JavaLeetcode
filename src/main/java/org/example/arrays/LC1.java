package org.example.arrays;

import java.util.*;

public class LC1 {
    //[2,15,8,7,11,15]    9
    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        List<int[]> result1 = twoSumAllPairs(nums1, target1);
        System.out.println("Przykład 1:");
        for (int[] pair : result1) {
            System.out.println("[" + pair[0] + ", " + pair[1] + "]"); // Oczekiwane: [0, 1]
        }

        int[] nums2 = {3, 2, 4, 3};
        int target2 = 6;
        List<int[]> result2 = twoSumAllPairs(nums2, target2);
        System.out.println("\nPrzykład 2 (duplikaty wartości, różne indeksy):");
        for (int[] pair : result2) {
            System.out.println("[" + pair[0] + ", " + pair[1] + "]"); // Oczekiwane: [0, 3], [1, 2] (lub w innej kolejności dodawania)
            // W tym przypadku: [1,2] (para 2,4), [0,3] (para 3,3)
        }
        // Kolejność par w liście zależy od kolejności przetwarzania elementów:
        // i=0 (nums[0]=3), comp=3. Map empty. map.put(3,0).
        // i=1 (nums[1]=2), comp=4. Map empty. map.put(2,1).
        // i=2 (nums[2]=4), comp=2. Map has 2 at index 1. Add [1,2]. map.put(4,2).
        // i=3 (nums[3]=3), comp=3. Map has 3 at index 0. Add [0,3]. map.put(3,3).

        int[] nums3 = {1, 2, 3, 4, 5};
        int target3 = 7;
        List<int[]> result3 = twoSumAllPairs(nums3, target3);
        System.out.println("\nPrzykład 3 (wiele par):");
        for (int[] pair : result3) {
            System.out.println("[" + pair[0] + ", " + pair[1] + "]"); // Oczekiwane: [1, 4] (2+5), [2, 3] (3+4)
        }
        // i=0 (1), comp=6. map.put(1,0).
        // i=1 (2), comp=5. map.put(2,1).
        // i=2 (3), comp=4. map.put(3,2).
        // i=3 (4), comp=3. Map has 3 at index 2. Add [2,3]. map.put(4,3).
        // i=4 (5), comp=2. Map has 2 at index 1. Add [1,4]. map.put(5,4).

        int[] nums4 = {3, 3};
        int target4 = 6;
        List<int[]> result4 = twoSumAllPairs(nums4, target4);
        System.out.println("\nPrzykład 4 (dwie takie same liczby):");
        for (int[] pair : result4) {
            System.out.println("[" + pair[0] + ", " + pair[1] + "]"); // Oczekiwane: [0, 1]
        }

        int[] nums5 = {1,1,1,1};
        int target5 = 2;
        List<int[]> result5 = twoSumAllPairs(nums5, target5);
        System.out.println("\nPrzykład 5 (wiele identycznych liczb tworzących pary):");
        for (int[] pair : result5) {
            System.out.println("[" + pair[0] + ", " + pair[1] + "]");
            // Oczekiwane: [0,1], [0,2], [0,3], [1,2], [1,3], [2,3] - NIE, to byłoby O(N^2)
            // Ten algorytm da:
            // i=0 (1), comp=1. map.put(1,0)
            // i=1 (1), comp=1. map has 1 at 0. result.add([0,1]). map.put(1,1)
            // i=2 (1), comp=1. map has 1 at 1. result.add([1,2]). map.put(1,2)
            // i=3 (1), comp=1. map has 1 at 2. result.add([2,3]). map.put(1,3)
            // Wynik: [0,1], [1,2], [2,3]
        }
    }

    public static List<int[]> twoSumAllPairs(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        List<int[]> results = new ArrayList<>();

        for (int i = 0; i < nums.length  ; i++) {
            int complement = target-nums[i];
            int currNum = nums[i];

            if(numMap.containsKey(complement)){
                results.add(new int[]{complement, nums[i]});
                // return new int[]{numMap.get(complement), i};
            }
            numMap.put(currNum, i);
        }
        return results;
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length  ; i++) {
            int complement = target-nums[i];

            if(numMap.containsKey(complement)){
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }
        return new int[] {};
    }
}
