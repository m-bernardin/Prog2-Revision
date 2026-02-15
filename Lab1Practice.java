import java.util.ArrayList;
import java.util.Scanner;

public class Lab1Practice{
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.print("Please select an option\n0. convert number to binary\n1. convert number to hexadecimal\n2. find commons in two arrays\n3. check if an table is symmetrical\n4. sort table in descending order\n> ");
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
            case 3:
                checkTableSymmetrical();
            case 4:
                sortTableDesc();
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
    @SuppressWarnings("resource")
    private static void checkTableSymmetrical(){
        int[][] table;
        System.out.println("Check true (0) or false (1)?");
        if(new Scanner(System.in).nextInt()==1){
            int[][] temp={{9,13,5,2},{1,11,7,6,},{3,7,4,1},{6,0,7,10}};
            table=temp;
        }
        else{
            int[][] temp={{9,13,3,6},{13,11,7,6},{3,7,4,7},{6,6,7,10}};
            table=temp;
        }
        boolean symmetrical=true;
        for(int x=1;x<table.length;++x){
            for(int y=1;y<table.length;++y){
                if(table[x][y]!=table[y][x])symmetrical=false;
            }
        }
        if(symmetrical)System.out.println("Table is symmetrical");
        else System.out.println("Table is not symmetrical");
    }
    private static void sortTableDesc(){
        int[][] table={{9,13,5,2},{1,11,7,6,},{3,7,4,1},{6,0,7,10}};
        System.out.println(printTable(table, 4, 4));
        for(int iteration=0;iteration<16;++iteration){
            for(int y=0;y<table.length;++y){
                for(int x=0;x<table.length-1;++x){
                    if(table[y][x]<table[y][x+1]){
                        int temp=table[y][x];
                        table[y][x]=table[y][x+1];
                        table[y][x+1]=temp;
                    }
                }
                try{
                    if(table[y][3]<table[y+1][0]){
                        int temp=table[y][3];
                        table[y][3]=table[y+1][0];
                        table[y+1][0]=temp;
                    }
                }catch(Exception e){
                    System.out.println("**fell off");
                    break;
                }
                System.out.println("current state(y="+y+"): "+printTable(table, 4, 4));
            }
            if(x==3||x==4)break;
            if(table[x][table.length-1]>table[x+1][0]){
                int tempLocation=table.length-1;
                int temp=table[x][tempLocation]; 
                table[x][tempLocation]=table[x][0];
                table[x][0]=temp;
            }
        }
        System.out.println(printTable(table, 4, 4));
    
    }
    private static String printTable(int[][] table,int nbColumns, int nbRows){
        String tableString="Visualisation of table:\n";
        for(int x=0;x<nbColumns;++x){
            for(int y=0;y<nbRows;++y){
                tableString+=table[x][y]+" ";
            }
            tableString+="\n";
        }
        return tableString;
    }
}