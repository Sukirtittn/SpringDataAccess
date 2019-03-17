package Trial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.*;

public class Application {

    @Autowired
    UserDAO userDAO;

    public static void main(String[] args) throws Exception {
//        ------------------------------------------------------------------------------------------------------------------------
//        jdbc template way














// =-----------------------------------------------------------------------------------------------------
// DataSource wa---
//        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Sprinng-config.xml");
//        UserDAO userDAO=applicationContext.getBean("userDao",Trial.UserDAO.class);
//        userDAO.printUserNames();
//--------------------------------------------------------------------------------------------------------
//        jdbc way
//        try {
//
//            String driverName = "com.mysql.jdbc.Driver";
//            Class.forName(driverName).newInstance();
//            String connectionString = "jdbc:mysql://localhost:3306/springDemo";
//            String username = "sukirti";
//            String password = "Sukirti24@";
////
////create user 'sukirti'@'localhost' identified by 'ttn';
////       grant all privileges on springDemo.* to 'sukirti'@'localhost' ;
//
//
//            Connection connection = DriverManager.getConnection(connectionString,
//                    username, password);
//            PreparedStatement preparedStatement =
//                    connection.prepareStatement("SELECT * FROM user");
//            ResultSet resultSet = preparedStatement.executeQuery();
//            while (resultSet.next()) {
//                System.out.println(resultSet.getString("name"));
//            }
//        }catch(Exception e){
//            System.out.println(e);
//        }
    }
}
