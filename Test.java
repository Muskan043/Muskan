public class Test{

        public Connection getConnection() throws SQLException {
            String url = "jdbc:h2:mem:Test";// H2 Database URL----> loclhpst:9090
            String user = "sa";            // Database username
            String password = "";          // Database password


            String url1 = "test";


            return DriverManager.getConnection(url, user, password);
        }
    }
    import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


    public class MainClass {


        public static void main(String[] args) {


            Test test = new Test();


            try(Connection connection=test.getConnection()) {
                Statement statement = connection.createStatement();
                // Create the table if it does not exist
                String createTableQuery = "CREATE TABLE IF NOT EXISTS testdb ("
                        + "id INT PRIMARY KEY, "
                        + "NAME VARCHAR(255), "
                        + "TYPEOFEMPLOYEE VARCHAR(255), "
                        + "SALARY DECIMAL, "
                        + "ADDRESS VARCHAR(255))";
                statement.execute(createTableQuery);
                System.out.println("Table created successfully.");
                String query = "INSERT INTO testdb (id, NAME,TYPEOFEMPLOYEE,SALARY,ADDRESS)"
                        + "values('" + 12 + "','" + "Test" + "','" + "partTime" + "','" + 123 + "','" + "new"
                        + "')";


                statement.executeUpdate(query);


                String querySelect = "SELECT * from testdb where id = 13";
                ResultSet rs = statement.executeQuery(querySelect);
                if (rs.next()) {
                    System.out.println("ID: " + rs.getInt("id"));
                    System.out.println("Name: " + rs.getString("name"));
                } else {
                    System.out.println("No data found for id = 13");
                }


            } catch(SQLException e) {
                e.printStackTrace();
            }


            System.out.println("I am testing");


        }
    }

