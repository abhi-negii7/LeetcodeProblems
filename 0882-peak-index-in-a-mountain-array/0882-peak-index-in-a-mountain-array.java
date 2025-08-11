class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        // length of the array
        int n = arr.length;
        // if array has single element
        if(n==1) return arr[0];

        // first element is peek
        if(arr[0]>arr[1]) return arr[0];
        // last element is peek
        if(arr[n-1]>arr[n-2]) return arr[n-1];

        int low=1;
        int high=n-2;

        while(low<=high){
            
            int mid = low+(high-low)/2;

            // mid is peek
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) return mid;

            // mid on decreasing slop
            else if(arr[mid]<arr[mid-1])
                high=mid-1;

            else
            low=mid+1;
        }

        return -1;

    }
}