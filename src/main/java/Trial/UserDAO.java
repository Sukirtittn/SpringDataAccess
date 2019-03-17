package Trial;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Service
public class UserDAO {

    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    SessionFactory sessionFactoryBean;


    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    public UserDAO(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public UserDAO() {
    }

    void printUserNames() throws SQLException {
        Connection connection = dataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM user");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getString("name"));
        }
    }

    //Question--5
    void userCount() {
        String sql = "SELECT COUNT(*) FROM user";
        System.out.println(jdbcTemplate.queryForObject(sql, Integer.class));
    }

    //    Question --6
    String getUserName() {
        String sql = "SELECT NAME FROM user WHERE username = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{"sukirti"}, String.class);
    }


    //    Question--7
    void insertUser(User user) {
        String sql = "INSERT INTO user (username,password,name,age,dob)VALUES(?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{
                user.getUsername(), user.getPassword(), user.getName(), user.getAge(), user.getDob()
        });
    }


    //    Question ---8
    void queryForMapDemo() {
        String sql = "SELECT * FROM user WHERE username = ?";
        System.out.println(jdbcTemplate.queryForMap(sql, new Object[]{"sukirti"}));
    }


    //    Question--9
    void queryForListDemo() {
        String sql = "SELECT * FROM user";
        System.out.println(jdbcTemplate.queryForList(sql));
    }

    //    Question--10
    User getUser() {
        String sql = "SELECT * FROM user WHERE username = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{"sukirti"}, new UserMapper());
    }

    //    Question--11
    void sessionFactoryDemo() {
        String sql = "SELECT COUNT(*) FROM User";
        Query query = sessionFactoryBean.openSession().createQuery(sql);
        System.out.println(query.uniqueResult());
    }




}
