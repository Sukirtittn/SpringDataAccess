package Transactions;

import Trial.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Transactional("t1")
    public void hello() {
        System.out.println("Hello from t1");
    }

    @Transactional("t2")
    public void hi() {
        System.out.println("Hello from t2");
    }

    @Transactional(readOnly = true)
    List<User> getAllUser() {
        String sql = "SELECT * FROM user";
        List list=jdbcTemplate.queryForList(sql);
        return list;
    }

}