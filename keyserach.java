import java.util.*;
public class keyserach {
    public static int linearsearch(int numbers[], int key){
        for(int i = 0;i<numbers.length; i++){
            if(numbers[i]==key){
                return i;

            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers [] = {5, 10, 15, 25, 30};
        int key = 40;
        int index = linearsearch(numbers,key);
        if(index== -1){
            System.out.println("NOT FOUND");
        }
        else{
            System.out.println("key is at index:" + index);
        }
    }
    
}
