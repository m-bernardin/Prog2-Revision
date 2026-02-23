public class GradeDriver {
    public static void main(String[] args){
        System.out.println("**test valid on create");
        Grade grade1=new Grade("A","Course1");
        System.out.println(grade1.toString());
        System.out.println("**test invalid on create");
        Grade grade2=new Grade("L","Course2");
        System.out.println(grade2.toString());
        System.out.println("**test valid change");
        
    }
}