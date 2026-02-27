public class Developper extends Employee{
    private String programmingLanguage;
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
    public Developper(String name,double salary,String programmingLanguage){
        super(name, salary);
        this.programmingLanguage=programmingLanguage;
    }
    public String toString(){
        return super.toString()+" (proficient in "+programmingLanguage+")";
    }
}