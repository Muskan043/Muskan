public class Student
{
    String name;
    int age;
    String studentID;

    public void study(){
System.out.println("study = java ");
    }
    public void studyhours(){
System.out.println("studyhours = 2hrs ");
    }

    public static void main(String[] args) {

        Student student = new Student();
        student.study();
        student.studyhours();;
        student.age = 18;
        student.name = john;
    }
}
