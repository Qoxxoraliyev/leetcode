import java.util.*;

public class IntersectionOfTwoArrays {


    public static boolean helper(int[] nums2,int digit){

        for (int i = 0; i <nums2.length; i++) {
            if (digit==nums2[i]){
                return true;
            }
        }
        return false;
    }


    public static int[] intersection(int[] nums1,int[] nums2){


        Set<Integer> set=new HashSet<>();
        List<Integer> list=new ArrayList<>();
        list.add(4);
        int left=0;
        int right=nums1.length-1;
        while (left<right){

            if (helper(nums2,nums1[left])){
                set.add(nums1[left]);
            }
            left++;
        }
        int[] result=new int[set.size()];
        int[] result1;
        int j=0;
        for (int i:set){
            result[j]=i;
            j++;
        }
        return result;
    }

    public static void main(String[] args) {

        int[] nums1={1,2,2,1};
        int[] nums2={2,2};

        intersection(nums1,nums2);
    }
}
