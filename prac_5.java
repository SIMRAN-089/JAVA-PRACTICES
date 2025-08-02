import java.util.*;
public class prac_5 {
    public static boolean containsduplicate ( int numbers []){
        for( int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                if( numbers[i] == numbers[j] ) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int numbers [] = {1, 2, 3, 4};
        System.out.println(containsduplicate(numbers));
    }
    
}
