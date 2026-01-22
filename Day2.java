import java.util.*;
public class Day2{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a series of ten numbers");
        for(int i=0;i<10;++i){
            int num=input.nextInt();
            if(num%2==0){
                System.out.println("Entry number "+(i+1)+" is even");
            }
            else{
                System.out.println("Entry number "+(i+1)+" is odd");
            }
        }
        input.close();
    }
}