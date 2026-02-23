public class Team{
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if(validateName(name))this.name=name;
    }
    public Team(String name){
        if(validateName(name))this.name=name;
    }
    private boolean validateName(String name){
        char[] characters=name.toLowerCase().toCharArray();
        for(int i=0;i<characters.length;++i){
            if(characters[i]<97||characters[i]>122){
                System.out.println("Invalid name, name not changed...");
                return false;
            }
        }
        return true;
    }
    public String toString(){
        return name;
    }
    public boolean equals(Team compare){
        if(compare.toString()==toString())return true;
        return false;
    }
}