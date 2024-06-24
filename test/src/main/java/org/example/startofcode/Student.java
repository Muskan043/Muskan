public class Student
{
    String name;
    int age;
    String studentID;

    public void study(){
        System.out.println("study = java ");
    }
    public void studyHours(){
        System.out.println("studyHours = 2hrs ");
    }

    public static void main(String[] args) {

        Student student = new Student();
        student.study();
        student.studyHours();
        System.out.println(student.age = 18);
        System.out.println(student.name = "MUskAN");
        System.out.println(student.studentID = "ab45");
    }
}


