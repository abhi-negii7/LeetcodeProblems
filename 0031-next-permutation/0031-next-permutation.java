class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot = -1;
        // To find the pivot
        for (int i = n - 2; i >= 0; i--) {
            if(nums[i]<nums[i+1]){
                pivot = i;
                break;
            }
        }

        // The nums array is in descending order
        // Ex-> [3,2,1] -> [1,2,3]
        if(pivot==-1){
            reverse(nums,0,n-1);
            return;
        }

        for(int i=n-1;i>=pivot;i--){
            // got the number greater and closest to pivot number
            // swap the pivot and this number
            if(nums[i]>nums[pivot]){
                int temp = nums[i];
                nums[i] = nums[pivot];
                nums[pivot] = temp;
                break;
            }
        }
        // to get the smallest possible number of starting from a number which is closest and greater than pivot number
        reverse(nums,pivot+1,n-1);
    }

    // Method to reverse the array
    public void reverse(int[] nums, int i, int j) {

        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}