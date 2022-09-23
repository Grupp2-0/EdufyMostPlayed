package com.edufy.mostplayed.edufymostplayed.model;
import javax.persistence.*;
/*
 * Klassen User har blivit autogenererad från databasen edufydatabase och är annoterad med @Entity.
 * @author Matilda Wintence, Jesper Johansson.
 */
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userid", nullable = false)
    private Integer id;

    @Column(name = "username", nullable = false, length = 50)
    private String username;
    @Lob
    @Column(name = "role", nullable = false, length = 45)
    private String role;

    @Column(name = "password", nullable = false, length = 45)
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}