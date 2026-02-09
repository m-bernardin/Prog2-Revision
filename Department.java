public class Department {
private String name;
private int deptNo;
    public int getDeptNo() {
        return deptNo;
    }
    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Department(String name,int deptNo){
        this.name=name;
        this.deptNo=deptNo;
    }
}