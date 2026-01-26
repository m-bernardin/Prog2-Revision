public class NumberManipulator{
    public String reverse(int num){
        String answer="";
        int newNum=0;
        while(num>0){
            int leftmostDigit=num%10;
            newNum=newNum*10+leftmostDigit;
            num/=10;
        }
        answer=newNum+"";
        return answer;
    }
    public String word(int num){
        String answer="";
        int operableNum=Integer.parseInt(reverse(num));
        while(operableNum>0){
            int rightmostDigit=operableNum%10;
            answer+=findWord(rightmostDigit)+" ";
            operableNum/=10;
        }
        return answer;
    }
    public String findWord(int digit){
        switch (digit) {
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
        }
        return null;
    }
    public String getOptions(){
        return "0. reverse\n1. to-word\n";
    }
}