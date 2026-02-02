import java.util.ArrayList;
import java.util.Scanner;

public class SortingDriver{
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        boolean running=true;
        Scanner input=new Scanner(System.in);
        while(running){
            System.out.print("Please select a type of algorithm:\n"+SortingAlgorithms.getOptionsString()+"\nType 'quit' to exit\n> ");
            String choice=input.next();
            if(choice.equals("quit")){
                running=false;
                break;
            }
            if(invalidChoice(choice)){
                System.out.println("Please select a choice from the list");
                break;
            }
            System.out.print("Please enter a space-seperated list of numbers to be sorted\n> ");
            String toSortString=input.nextLine();
            int[] toSort=parseInput(toSortString);
            switch(choice){
                case "1":
                    System.out.println(SortingAlgorithms.simpleSort(toSort));
                    break;
            }
        }
        input.close();
    }
    private static boolean invalidChoice(String choice){
        int toValidate;
        try {
            toValidate=Integer.parseInt(choice);
        } catch (Exception e) {
            return true;
        }
        if(toValidate<=0||toValidate>SortingAlgorithms.getOptionsNum()){
            return true;
        }
        return false;

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