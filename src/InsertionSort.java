public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={3,6,2,5,1};
        System.out.println("before:");
        for(int i:arr){
            System.out.print(i+"\t");
        }
        System.out.println();
        int key=0, j=0;
        for(int i=0;i< arr.length;i++){
            key=arr[i];
            j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
        System.out.println("after:");
        for(int i:arr){
            System.out.print(i+"\t");
        }
    }
}
