package user.bean;

/**
 * Created by jiaming on 2017/2/11.
 */
public class UserInfo {

    private String userName;
    private Integer id;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userName='" + userName + '\'' +
                ", id=" + id +
                ", password='" + password + '\'' +
                '}';
    }
}
