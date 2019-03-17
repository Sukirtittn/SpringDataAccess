package Trial;

import org.springframework.stereotype.Repository;

import java.util.Date;

public class User {
    String username;
    String password;
    String name;
    int age;
    Date dob;

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public User(String username, String password, String name, int age, Date dob) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.age = age;
        this.dob = dob;
    }
}
