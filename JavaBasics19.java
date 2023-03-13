import java.util.*;

public class JavaBasics19 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int No = sc.nextInt();

        if(No % 2 == 0){
            System.out.println("Even No.");
        }
        else{
            System.out.println("Odd No.");
        }
    }
}
