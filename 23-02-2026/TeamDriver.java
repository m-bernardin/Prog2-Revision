import java.util.ArrayList;
import java.util.Scanner;

public class TeamDriver{
    public static void main(String[] args) {
        ArrayList<Team> teams=new ArrayList<>();
        Scanner input=new Scanner(System.in);
        boolean running=true;
        while(running){
            System.out.print("Please select an option\n1.Create new team\n2. Edit a team\n3. Display teams\n4. Quit\n> ");
            switch (input.nextInt()) {
                case 1:
                    System.out.print("Please enter a team name\n> ");
                    teams.add(new Team(input.next()));
                    break;
                case 2:
                    System.out.print("Please select a team to edit\n"+getTeams(teams)+"> ");
                    
            }
        }
    }
    private static String getTeams(ArrayList<Team> teams){
        String answer="Teams:\n"
        for(int i=0;i<teams.size();++i){
            answer+=i+". "+teams.get(i).toString()+"\n";
        }
        return answer;
    }
}