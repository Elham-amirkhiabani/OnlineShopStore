package OnlineShop.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class AbstractPerson {
    private Long id;
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String telephone;
    private String password;

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "PersonSequenceGenerator")
    @Column(name = "ID", unique = true, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "FIRST_NAME", unique = false, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "LAST_NAME", unique = false, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "EMAIL", unique = true, nullable = true, insertable = true, updatable = true, precision = 10, scale = 0)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "TELEPHONE", unique = false, nullable = true, insertable = true, updatable = true, precision = 10, scale = 0)
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Column(name = "USERNAME", unique = false, nullable = true, insertable = true, updatable = true, precision = 10, scale = 0)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Column(name = "PASSWORD", unique = false, nullable = true, insertable = true, updatable = true, precision = 10, scale = 0)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
