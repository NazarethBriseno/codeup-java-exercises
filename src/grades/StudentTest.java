package grades;

public class StudentTest {
    public static void main (String[] args){
        Student josh = new Student("Josh");
        josh.addGrade(70);
        josh.addGrade(90);
        josh.addGrade(80, 40);


        Student amy = new Student("Amy");
        amy.addGrade(70);
        amy.addGrade(59);
        amy.addGrade(80);
        System.out.println(josh.getGrades());
        System.out.println(amy.getGrades());

    }
}
