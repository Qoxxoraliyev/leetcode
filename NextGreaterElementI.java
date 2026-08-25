
public class NextGreaterElementI   {


    public static int[] nextGreaterElement(int[] nums1,int[] nums2){

        int[] result=new int[nums1.length];
        for (int i = 0; i <nums1.length; i++) {

            result[i]=-1;

            for (int j = 0; j <nums2.length-1; j++) {



                if (nums1[i]==nums2[j]){
                    for (int k =j+1; k <nums2.length; k++) {

                          if (nums2[k]>nums1[i]){
                              result[i]=nums2[k];
                              break;
                          }

                    }
                }

            }
        }


        for (int i = 0; i <result.length; i++) {
            System.out.println(result[i]);
        }
        return result;
    }

    public static void main(String[] args) {

        int[] nums1={4,1,2};
        int[] nums2={1,3,4,2};
        nextGreaterElement(nums1,nums2);

    }

}
