import java.util.*;
public class prac_1 {
  public static int getthirdlargest(int numbers []){
    int largest = Integer.MIN_VALUE;
    int secondlargest = Integer.MIN_VALUE;
    int thirdlargest = Integer.MIN_VALUE;
    for(int i=0; i<numbers.length; i++){
        if(numbers [i] > largest){
            thirdlargest = secondlargest;
            secondlargest = largest;
            largest = numbers[i];

        }else if(numbers[i]> secondlargest && numbers[i]!=largest){
            thirdlargest = secondlargest;
            secondlargest = numbers[i];
        }else if (numbers[i]>thirdlargest && numbers[i]!=secondlargest){
            thirdlargest = numbers [i];
        }
    }
      if(thirdlargest == Integer.MIN_VALUE){
        return -1;
      }
      return secondlargest;

  }
    public static void main(String[] args) {
        int numbers [] = {2, 8, 16, 20, 25};
        System.out.println("third largest distinct value is :" + getthirdlargest(numbers));
    }
    
}
