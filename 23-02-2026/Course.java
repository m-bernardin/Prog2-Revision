public class Course {
    private String code;
    private String description;
    private int credits;
    public String getCode() {
        return code;
    }
    public void setCode(String code){
        if(code.matches("[A-Z][A-Z][0-9]"))this.code = code;
        else System.out.println("invalid course code");
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getCredits(){
        return credits;
    }
    public void setCredits(int credits){
        if(credits>=0&&credits<=5)this.credits = credits;
        else System.out.println("invalid nb of credits");
    }
    public Course(String code,String description,int credits){
        setCode(code);
        setCredits(credits);
        setDescription(description);
        toString();
    }
    public String toString(){
        return "Course [code=" + code + ", description=" + description + ", credits=" + credits + "]";
    }
    public boolean equals(Course compare){
        if(compare.toString()==toString())return true;
        return false;
    }
}