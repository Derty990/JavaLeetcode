package org.example.sorting;

public class LC912 {
    public static void main(String[] args) {
        int[] nums = {110, 100, 0};
        LC912 lc912 = new LC912();
        lc912.sortArray(nums);
        for (int i : nums){
            System.out.println(i);
        }

    }

    public int[] sortArray(int[] nums) {
        //quicksort
//        for (int i = 1; i < nums.length; i++) {
//            int j = i-1;
//            int currVal = nums[i];
//            while(j>= 0 && nums[j] > currVal){
//                nums[j+1] = nums[j];
//                j--;
//            }
//            nums[j+1] = currVal;
//
//        }
//        return nums;

        //mergesort
//        if(nums.length<1){
//            return nums;
//        }
//
//        mergeSortHelper(nums, 0, nums.length-1);
//        return nums;

        dualPivotQuickSort(nums, 0, nums.length-1);
        return nums;

    }

    private void dualPivotQuickSort(int[] nums, int low, int high) {
        // Dla małych tablic używamy sortowania przez wstawianie
        if (high - low < 10) {
            insertionSort(nums, low, high);
            return;
        }

        if (low < high) {
            // Upewniamy się, że pierwszy pivot jest mniejszy od drugiego
            if (nums[low] > nums[high]) {
                swap(nums, low, high);
            }

            // Ustawiamy dwa pivoty
            int pivot1 = nums[low];
            int pivot2 = nums[high];

            // Indeksy do śledzenia partycji
            int lt = low + 1;   // indeks dla elementów mniejszych od pivot1
            int gt = high - 1;  // indeks dla elementów większych od pivot2
            int i = low + 1;    // indeks dla bieżącego elementu

            // Dzielimy tablicę na trzy części
            while (i <= gt) {
                if (nums[i] < pivot1) {
                    // Element mniejszy od pierwszego pivota - przesuwamy go na lewo
                    swap(nums, i++, lt++);
                } else if (nums[i] > pivot2) {
                    // Element większy od drugiego pivota - przesuwamy go na prawo
                    swap(nums, i, gt--);
                } else {
                    // Element między pivotami - pozostawiamy go
                    i++;
                }
            }

            // Przesuwamy pivoty na ich końcowe pozycje
            swap(nums, low, --lt);
            swap(nums, high, ++gt);

            // Rekurencyjnie sortujemy trzy części
            dualPivotQuickSort(nums, low, lt - 1);    // elementy mniejsze od pivot1
            dualPivotQuickSort(nums, lt + 1, gt - 1); // elementy między pivot1 i pivot2
            dualPivotQuickSort(nums, gt + 1, high);   // elementy większe od pivot2
        }
    }

    private void insertionSort(int[] nums, int low, int high) {
        for (int i = low + 1; i <= high; i++) {
            int key = nums[i];
            int j = i - 1;

            while (j >= low && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

   /* private void mergeSortHelper(int[] nums, int left, int right) {

        if (left < right) {
            int mid = left + (right-left)/2;

            mergeSortHelper(nums,left,mid);
            mergeSortHelper(nums, mid+1, right);

            merge(nums, left, mid, right);

        }
    }

    private void merge(int[] nums, int left, int mid, int right) {
        int n1 = mid-left+1;
        int n2 = right-mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = nums[left+i];
        }

        for (int j = 0; j < n2; j++) {
            rightArray[j] = nums[mid+1+j];
        }

        int i=0, j=0;
        int k = left;

        while(i<n1 && j<n2){
            if(leftArray[i] <= rightArray[j]){
                nums[k] = leftArray[i];
                i++;
            }else{
                nums[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i<n1){
            nums[k] = leftArray[i];
            i++;
            k++;
        }

        while(j<n2){
            nums[k] = rightArray[j];
            j++;
            k++;
        }
    }*/
}


