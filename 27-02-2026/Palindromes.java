import java.util.ArrayList;
import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<String> strings=new ArrayList<>();
        boolean adding=true;
        while(adding){
            System.out.print("Would you like to enter a word> (Y/n)\n> ");
            if(input.next().equals("n")){
                adding=false;
                break;
            }
            System.out.print("Please enter a word\n> ");
            strings.add(input.next());
        }
        input.close();
        boolean palindrome=true;
        for(int i=0,j=strings.size()-1;i<j;++i,--j){
            if(!strings.get(i).equals(strings.get(j)))palindrome=false;
        }
        System.out.println("Palindrome?: "+palindrome);
    }
}
