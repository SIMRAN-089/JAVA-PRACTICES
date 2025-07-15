import java.util.*;
public class binary {
    public static int binarysearch(int numbers[],int key){
        int start = 0 , end = numbers.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            //comparisons
            if(numbers[mid]==key){
                return mid;
            }
                if(numbers[mid] < key) {
                    start=mid+1;//start
                }else{
                    end = mid-1;//end
                }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers [] = {5,15,20,10,20,25,30};
        int key=45;
        System.out.println("index for key is :"+ binarysearch(numbers,key));
    }
    
}
