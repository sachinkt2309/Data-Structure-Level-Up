public class SelectionSort {
    public static void main(String[] args) {
        int nums[]={2,6,5,3,8,7,1,4};
        int temp=0, size=nums.length;
        int min=0;

        System.out.println("before sort:");
        for(int num:nums){
            System.out.print(num+"\t");
        }
        System.out.println("\n");
        for(int i=0;i<size-1;i++){
            min=i;
            for(int j=i+1;j<size;j++){
                if(nums[min]>nums[j]) {
                    min = j;
                }
            }
            temp=nums[min];
            nums[min]=nums[i];
            nums[i]=temp;
        }
        System.out.println("After Sorting: ");
        for (int num:nums) {
            System.out.print(num+"\t");
        }
    }
}
