package COLLEGE;

public class College {
    public String students ;
    public int teacherID;
    public String department;
    public String collegeName;
    public String collegeLocation;

    public void campusPlacement(){
        System.out.println("The student got placed in NIT Technologies" +students);
    }
    public void setCollegeName() {
        System.out.println("The college name is " + collegeName);
    }
     public void setDepartment(){
         System.out.println("The department of student who selected is " +department);
    }
}
