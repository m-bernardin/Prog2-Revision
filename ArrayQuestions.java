import java.util.*;
public class ArrayQuestions{
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        ArrayQuestions thing=new ArrayQuestions();
    }
    public ArrayQuestions(){
        printNameByDigitWithDivideTen();
    }
    //q2
    public void deltaBiggestSmallest(){
        Scanner input=new Scanner(System.in);
        int[] nums=new int[10];
        int biggest,smallest;
        for(int i=0;i<nums.length;++i){
            System.out.print("Please enter a number:\n> ");
            nums[i]=input.nextInt();
        }
        input.close();
        biggest=nums[0];
        smallest=nums[0];
        for(int i=0;i<nums.length;++i){
            if(nums[i]>biggest)biggest=nums[i];
            if(nums[i]<smallest)smallest=nums[i];
        }
        System.out.println("Variation is "+(biggest-smallest));
    }
    //q3
    public void searchArray(){
        Scanner input=new Scanner(System.in);
        int[] nums=new int[10];
        int search;
        boolean found=false;
        for(int i=0;i<nums.length;++i){
            System.out.print("Please enter a number:\n> ");
            nums[i]=input.nextInt();
        }
        System.out.print("Please enter a number to search for\n> ");
        search=input.nextInt();
        input.close();
        for(int i=0;i<nums.length&&!found;++i){
            if(nums[i]==search)found=true;
        }
        if(found)System.out.println(search+" was found");
        else System.out.println(search+" was not found");
    }
    //q4
    public void printAboveAverage(){
        Scanner input=new Scanner(System.in);
        int[] nums=new int[10];
        int average=0;
        for(int i=0;i<nums.length;++i){
            System.out.print("Please enter a number:\n> ");
            nums[i]=input.nextInt();
            average+=nums[i];
        }
        input.close();
        average/=nums.length;
        System.out.print("Numbers above average: ");
        for(int i=0;i<nums.length;++i){
            if(nums[i]>average)System.out.print(nums[i]+" ");
        }
    }
    //q6
    public void simpleSort(){
        Scanner input=new Scanner(System.in);
        int[] nums=new int[10];
        for(int i=0;i<nums.length;++i){
            System.out.print("Please enter a number:\n> ");
            nums[i]=input.nextInt();
        }
        input.close();
        System.out.print("Unsorted array: ");
        for(int i=0;i<nums.length;++i){
            System.out.print(nums[i]+" ");
        }
        System.out.println("");
        for(int i=0;i<nums.length;++i){
            int tempLocation=i;
            for(int j=i;j<nums.length;++j){
                if(nums[j]<nums[tempLocation]){
                    tempLocation=j;
                }
            }
            int temp=nums[tempLocation]; 
            nums[tempLocation]=nums[i];
            nums[i]=temp;
        } 
        System.out.print("Sorted array: ");
        for(int i=0;i<nums.length;++i){
            System.out.print(nums[i]+" ");
        }
    }

    public void bubbleSort(){
        Scanner input=new Scanner(System.in);
        int[] nums=new int[10];
        for(int i=0;i<nums.length;++i){
            System.out.print("Please enter a number:\n> ");
            nums[i]=input.nextInt();
        }
        input.close();
        System.out.print("Unsorted array: ");
        for(int i=0;i<nums.length;++i){
            System.out.print(nums[i]+" ");
        }
        System.out.println("");
    }
    //q7
    public void findPrimesAndPerfects(){
        Scanner input=new Scanner(System.in);
        int[] nums=new int[10];
        for(int i=0;i<nums.length;++i){
            System.out.print("Please enter a number:\n> ");
            nums[i]=input.nextInt();
        }
        input.close();
        String primesAnswers="Primes in this array: ";
        String perfectsAnswers="Perfects in this array: ";
        for(int i=0;i<nums.length;++i){
            int num=nums[i];
            //check prime
            boolean prime=true;
            for(int p=2;p<num&&prime==true;++p){
                if(num%p==0){
                    prime=false;
                    break;
                }
            }
            if(prime)primesAnswers+=num+" ";
            //check perfect
            int sum=0;
            for(int divider=1;divider<num;++divider){
                if(num%divider==0)sum+=divider;
            }
            if(sum==num)perfectsAnswers+=num+" ";
        }
        System.out.println(primesAnswers+"\n"+perfectsAnswers);
    }
    //q9
    public void printNameByDigit(){
        System.out.print("Please enter a number\n> ");
        @SuppressWarnings("resource")
        int num=new Scanner(System.in).nextInt();
        char[] numArray=Integer.toString(num).toCharArray();
        System.out.print("Number as words: ");
        for(int i=0;i<numArray.length;++i){
            System.out.print(NumberManipulator.findWord(Integer.parseInt(numArray[i]+""))+" ");
        }
    }
    //q9.1
    public void printNameByDigitWithDivideTen(){
        System.out.print("Please enter a number\n> ");
        @SuppressWarnings("resource")
        int num=new Scanner(System.in).nextInt(),digitAid=num,digits=0;
        while(digitAid>0){
            ++digits;
            digitAid/=10;
        }
        int[] numArray=new int[digits];
        for(int i=0;i<numArray.length;++i){
            numArray[i]=num%10;
            num/=10;
        }
        for(int i=numArray.length-1;i>=0;--i){
            System.out.print(NumberManipulator.findWord(Integer.parseInt(numArray[i]+""))+" ");
        }
    }
}