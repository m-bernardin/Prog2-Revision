public class NumberRangeFinder{
    public String oddString(int lowerBound,int upperBound){
        String answer="";
        for(int i=lowerBound;i<=upperBound;++i){
            if(i%2!=0){
                answer+=(i+" ");
            }
        }
        return answer;
    }
    public String evenString(int lowerBound,int upperBound){
        String answer="";
        for(int i=lowerBound;i<=upperBound;++i){
            if(i%2==0){
                answer+=(i+" ");
            }
        }
        return answer;
    }
    public String perfectString(int lowerBound,int upperBound){
        String answer="";
        for(int num=lowerBound;num<=upperBound;++num){
            int sum=0;
            for(int divider=1;divider<num;++divider){
                if(num%divider==0)sum+=divider;
            }
            if(sum==num)answer+=(num+" ");
        }
        return answer;
    }
    public String getOptions(){
        return "0. odd\n1. even\n2. perfect\n";
    }
}