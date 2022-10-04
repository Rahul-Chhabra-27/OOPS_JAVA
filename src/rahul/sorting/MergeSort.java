package rahul.sorting;
import java.util.*;

public class MergeSort {
    public static void merge(ArrayList<Integer> nums,int low,int mid,int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int lb = low;
        int ub = mid+1;
        while(lb <= mid && ub <= high) {
            if(nums.get(lb) < nums.get(ub)) {
                temp.add(nums.get(lb++));
            }
            else {
                temp.add(nums.get(ub++));
            }
        }
        while(lb <= mid) temp.add(nums.get(lb++));
        while(ub <= high) temp.add(nums.get(ub++));
        for(int idx = low;idx<=high;idx++) {
            nums.set(idx,temp.get(idx-low));
        }
    }
    public static void mergeSort(ArrayList<Integer> nums,int low,int high) {
        // Base Case...
        if(low >= high) return;
        int mid = (low + (high-low)/2);
        // Sort the left part of the array...
        mergeSort(nums,low,mid);
        // Sort the right part of the array...
        mergeSort(nums,mid+1,high);
        // Now merge both the sorted parts...
        merge(nums,low,mid,high);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int n = sc.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i = 0;i<n;i++) {
            nums.add(sc.nextInt());
        }
        mergeSort(nums,0,n-1);
        nums.forEach(a -> System.out.print(a + " "));
    }
}
