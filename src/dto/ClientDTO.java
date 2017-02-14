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
public class ClientDTO implements java.io.Serializable{
    private Integer id;
    private String nume, prenume, cnp, action;

    public ClientDTO() {
    }

    public ClientDTO(Integer id) {
        this.id = id;
    }

    
    public ClientDTO(String nume, String prenume, String cnp) {
        this.nume = nume;
        this.prenume = prenume;
        this.cnp = cnp;
    }

    public ClientDTO(String nume, String prenume, String cnp, String action) {
        this.nume = nume;
        this.prenume = prenume;
        this.cnp = cnp;
        this.action = action;
    }

    public ClientDTO(Integer id, String nume, String prenume, String cnp) {
        this.id = id;
        this.nume = nume;
        this.prenume = prenume;
        this.cnp = cnp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
    
    
    
}
