class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m - 1;
        int g = n - 1;
        int p = m+n - 1 ;
        while (g>=0){
            if (k>=0 && nums1[k] > nums2[g]){
                nums1[p--] = nums1[k--];
            }
            else{
                nums1[p--] = nums2[g--];
            }
    }
        }
    }
