import java.util.ArrayList;
import java.util.Scanner;

public class Lab1Practice{
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.print("Please select an option\n0. convert number to binary\n1. convert number to hexadecimal\n2. find commons in two arrays\n> ");
        int option=new Scanner(System.in).nextInt();
        
        switch (option) {
            case 0:
                System.out.print("Please enter a number\n> ");
                convertToBinary(new Scanner(System.in).nextInt());
                break;
            case 1:
                System.out.print("Please enter a number\n> ");
                convertToHexadecimal(new Scanner(System.in).nextInt());
                break;
            case 2:
                findRepeats();
        }
    }
    public static void convertToBinary(int num){
        int digits=0,digitsAid=num,arrayPointer=0;
        while(digitsAid>0){
            ++digits;
            digitsAid/=2;
        }
        int[] reversedBinary=new int[digits];
        for(;arrayPointer<reversedBinary.length;++arrayPointer){
            reversedBinary[arrayPointer]=num%2;
            num/=2;
        }
        System.out.print("Number in binary: ");
        for(--arrayPointer;arrayPointer>=0;--arrayPointer){
            System.out.print(reversedBinary[arrayPointer]+"");
        }
    }
    public static void convertToHexadecimal(int num){
        int digits=0,digitsAid=num,arrayPointer=0;
        while(digitsAid>0){
            ++digits;
            digitsAid/=16;
        }
        char[] reversedHexadecimal=new char[digits];
        for(;arrayPointer<reversedHexadecimal.length;++arrayPointer){
            reversedHexadecimal[arrayPointer]=findHexadecimalDigit(num%16);
            num/=16;
        }
        System.out.print("Number in hexadecimal: ");
        for(--arrayPointer;arrayPointer>=0;--arrayPointer){
            System.out.print(reversedHexadecimal[arrayPointer]+"");
        }
    }
    public static char findHexadecimalDigit(int digit){
        switch (digit) {
            case 0:
                return '0';
            case 1:
                return '1';
            case 2:
                return '2';
            case 3:
                return '3';
            case 4:
                return '4';
            case 5:
                return '5';
            case 6:
                return '6';
            case 7:
                return '7';
            case 8:
                return '8';
            case 9:
                return '9';
            case 10:
                return 'a';
            case 11:
                return 'b';
            case 12:
                return 'c';
            case 13:
                return 'd';
            case 14:
                return 'e';
            case 15:
                return 'f';
        }
        return 'X';
    }
    @SuppressWarnings("resource")
    public static void findRepeats(){
        System.out.print("Please enter the first array, space-seperated\n> ");
        int[] firstArray=parseInput(new Scanner(System.in).nextLine());
        System.out.print("Please enter the second array, space-seperated\n> ");
        int[] secondArray=parseInput(new Scanner(System.in).nextLine());
        String results="Common numbers: ";
        for(int firstArrayPointer=0;firstArrayPointer<firstArray.length;++firstArrayPointer){
            for(int secondArrayPointer=0;secondArrayPointer<secondArray.length;++secondArrayPointer){
                if(firstArray[firstArrayPointer]==secondArray[secondArrayPointer]&&(!results.contains(" "+firstArray[firstArrayPointer]+" "))){
                    results+=firstArray[firstArrayPointer]+" ";
                }
            }
        }
        System.out.println(results);
    }
    private static int[] parseInput(String unSortedString) {
        Scanner sorter=new Scanner(unSortedString);
        ArrayList<Integer> tempArray=new ArrayList<>();
        sorter.useDelimiter(" ");
        while(sorter.hasNext()){
            tempArray.add(sorter.nextInt());
        }
        sorter.close();
        int[] result=new int[tempArray.size()];
        for(int i=0;i<result.length;++i){
            result[i]=tempArray.get(i);
        }
        return result;
    }
}