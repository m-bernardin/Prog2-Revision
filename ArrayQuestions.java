import java.util.*;
public class ArrayQuestions{
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        ArrayQuestions thing=new ArrayQuestions();
    }
    public ArrayQuestions(){
        sort();
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
    public void sort(){
        Scanner input=new Scanner(System.in);
        int[] nums=new int[10];
        int lowest;
        boolean sorted=false;
        for(int i=0;i<nums.length;++i){
            System.out.print("Please enter a number:\n> ");
            nums[i]=input.nextInt();
        }
        for(int i=0;i<nums.length;++i){
            int tempLocation=0;
            for(int j=0;j<nums.length;++j){
                if(nums[j]<nums[i]){
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
}