import java.util.*;
public class input {
    public static void main(String[] args) {
        int marks [] = new int [100];

        Scanner sc = new Scanner (System.in);

        marks[0] = sc.nextInt();//phy
        marks[1] = sc.nextInt();//chem
        marks[2] = sc.nextInt();//maths
        
        System.out.println("phy :" + marks[0]);
        System.out.println("chem:" + marks[1]);
        System.out.println("maths:" + marks[2]);
        
        marks [2] = 100; //update marks
        System.err.println("maths:" + marks[2]);

        //calculate percentage
        int percentage = (marks[0] + marks [1] + marks [2])/3;
        System.out.println("percentage=" + percentage + "%"); 

    }
    
}
