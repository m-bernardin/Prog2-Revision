public class SortingAlgorithms{
    public static String getOptionsString() {
        String options="";
        options+="1. Simple sort\n";
        options+="2. Bubble sort\n";
        return options;
    }
    public static int getOptionsNum() {
        return 2;
    }
    public static String simpleSort(int[] nums){
        long begin=System.currentTimeMillis();
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
        long totalTime=System.currentTimeMillis()-begin;
        String result="Sorted using simple sort: ";
        for(int i=0;i<nums.length;++i){
            result+=nums[i]+" ";
        }
        result+="(time elapsed: "+totalTime+"ms)";
        return result;
    }
}