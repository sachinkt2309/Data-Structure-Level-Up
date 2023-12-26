import java.util.ArrayList;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add(i);

        }
        int j=8;
        int left=0;
        int result=0;
        int right=arr.size();
        while(left<=right){
            int mid=(left+right)/2;
            if(mid==j){
                result=arr.indexOf(mid);
                break;
            } else if (mid<=j) {
                left=mid+1;
            }
            else
                right=mid-1;
        }
        System.out.println(result);
    }
}
