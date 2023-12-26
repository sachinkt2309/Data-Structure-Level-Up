public class quickSort {
    public static void main(String[] args) {
        int[] arr={2,4,1,7,5,9,3};
        System.out.println("before:");
        for(int i:arr){
            System.out.print(i+"\t");
        }
        System.out.println();
        
        QuickSort(arr,0,arr.length-1);
        
        System.out.println("after:");
        for(int i:arr){
            System.out.print(i+"\t");
        }
    }

    public static void QuickSort(int[] arr, int low, int high) {
        if(low<high) {
            int pi = Partition(arr, low, high);

            QuickSort(arr, low, pi - 1);
            QuickSort(arr, pi + 1, high);
        }
    }

    private static int Partition(int[] arr, int low, int high) {
        int pivot=arr[high];
        int i=low-1;

        for(int j=low;j<high;j++){
            if(arr[j]< pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;

        return i+1;
    }

}
