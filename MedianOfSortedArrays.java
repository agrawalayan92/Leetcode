import java.util.ArrayList;
import java.util.List;

public class MedianOfSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int m = nums1.length;
        int n = nums2.length;
        List<Integer> emptyMutableList = new ArrayList<>();
        while(i < m && j < n){
            if(nums1[i] <= nums2[j]){
                emptyMutableList.add(nums1[i]);
                i = i+1;
                continue;
            }
            if(nums2[j] < nums1[i]){
                emptyMutableList.add(nums2[j]);
                j = j+1;
                continue;
            }
        }
        while(i < m){
            emptyMutableList.add(nums1[i]);
            i = i+1;
        }
        while(j < n){
            emptyMutableList.add(nums2[j]);
            j = j+1;
        }
        int tl = m+n;
        if(tl %2 == 0){
            return (emptyMutableList.get(tl/2 -1) + emptyMutableList.get(tl/2))/2.0 ;
        }
        else return emptyMutableList.get(tl/2);
    }
}
