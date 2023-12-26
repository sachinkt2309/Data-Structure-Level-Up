public class MergeSort {
    private static void Divide(int[] arr, int si, int ei) {
        if(si>=ei){
            return;
        }
            int mid=si+(ei-si)/2;
            Divide(arr,si,mid);
            Divide(arr,mid+1,ei);
            Conquer(arr,si,mid,ei);

    }

    private static void Conquer(int[] arr, int si, int mid, int ei) {
       int mergeArr[]=new int[ei-si+1];
       int i=si, j=mid+1, x=0;

       while(i<=mid && j<=ei){
           if(arr[i]<=arr[j])
               mergeArr[x++]=arr[i++];
           else
               mergeArr[x++]=arr[j++];
       }
       while(i<=mid){
           mergeArr[x++]=arr[i++];
       }
       while (j<=ei){
           mergeArr[x++]=arr[j++];
       }
       for(int i1 = 0,j1=si;i1< mergeArr.length;i1++,j1++){
           arr[j1]=mergeArr[i1];
       }

    }

    public static void main(String[] args) {
        int arr[]={6,2,5,3,1,4};
        System.out.println("before sort");
        for (int i : arr) {
            System.out.print(i+"\t");
        }
        System.out.println();
        Divide(arr,0,arr.length-1);

        System.out.println("after Sorting");
        for (int i : arr) {
            System.out.print(i+"\t");
        }
    }

}
