class Solution { 
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0; // pointer for nums1
        int j = 0; // pointer for nums2
        int k = 0; // pointer for merged array
        int[] a = new int[m + n];

        // Merge elements from nums1 and nums2 in sorted order
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                a[k++] = nums1[i++];
            } else {
                a[k++] = nums2[j++];
            }
        }

        // Copy remaining elements from nums1, if any
        while (i < m) {
            a[k++] = nums1[i++];
        }

        // Copy remaining elements from nums2, if any
        while (j < n) {
            a[k++] = nums2[j++];
        }

        // Optionally, copy the merged array back to nums1 if needed
        for (int x = 0; x < m + n; x++) {
            nums1[x] = a[x];
        }
    }
}
