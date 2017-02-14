/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author Israel Dago
 */
public class UserDTO implements java.io.Serializable {

    private Integer id;
    private String username, parola;
    private boolean admin;

    public UserDTO() {
    }

    public UserDTO(String username, String parola, boolean admin) {
        this.username = username;
        this.parola = parola;
        this.admin = admin;
    }

    public UserDTO(String username, String parola) {
        this.username = username;
        this.parola = parola;
    }

    
    public UserDTO(Integer id, String username, String parola, boolean admin) {
        this.id = id;
        this.username = username;
        this.parola = parola;
        this.admin = admin;
    }

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

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    
}
