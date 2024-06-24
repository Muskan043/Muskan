package COLLEGE;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        String college;
        String deParTMenT;

        College cl= new College();
        DBConnection test = new DBConnection();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Student Name ");
        name = scanner.nextLine();
        cl.students = name;
        cl.campusPlacement();

        System.out.println("Enter the college name");
        college = scanner.nextLine();
        cl.collegeName = college;
        cl.setCollegeName();

        System.out.println("Enter the student department");
        deParTMenT = scanner.nextLine();
        cl.department = deParTMenT;
        cl.setDepartment();



        try (Connection connection= test.DB1()){
            String createQuery = "CREATE TABLE College(name VARCHAR(50),department,collegeName VARCHAR(50))";
            Statement statements = connection.createStatement();
            statements.execute(createQuery);
            String query = STR."INSERT INTO College(name,department,collegeName) values('\{cl.students}','\{cl.collegeName}','\{cl.department}')";


            statements.executeUpdate(query);
            System.out.println("Successfully connected to the h2 database.");

            String querySelect = "SELECT * from college";
            ResultSet result = statements.executeQuery(querySelect);
            System.out.println(result.getRow());
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
