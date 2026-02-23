public class Grade{
    private String mark;
    private String courseName;
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public String getMark() {
        return mark;
    }
    public void setMark(String mark) {
        if(validateMark(mark))this.mark = mark;
    }
    public Grade(String mark,String courseName){
        if(validateMark(mark))this.mark=mark;
        this.courseName=courseName;
    }
    private boolean validateMark(String mark){
        if(mark.matches("[A-F]+"))return true;
        return false;
    }
    public String toString(){
        return courseName+": "+mark;
    }
    public boolean equals(Grade compare){
        if(compare.toString()==toString())return true;
        return false;
    }
}