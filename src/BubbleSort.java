public class BubbleSort {
    public static void main(String[] args) {
        int nums[]={2,6,5,3,8,7,1};
        int temp=0, size=nums.length;

        System.out.println("before sort:");
        for(int i=0;i<size;i++){
            System.out.print(nums[i]+"\t");
        }
        System.out.println("\n");
        for(int i=0;i<size;i++){
            for(int j=0;j<size-i-1;j++){
                if(nums[j]>nums[j+1]){
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        System.out.println("After sorting:");
        for(int i=0;i<size;i++){
            System.out.print(nums[i]+"\t");
        }
    }
}
