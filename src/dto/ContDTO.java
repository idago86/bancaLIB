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
public class ContDTO implements java.io.Serializable{
    private Integer id;
    private String iban, descriere;
    private Double sold; 
    private String creationDate, action;
    private boolean active;
    private ClientDTO client;
    private TransactionDTO transactionDTO;
  

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public Double getSold() {
        return sold;
    }

    public void setSold(Double sold) {
        this.sold = sold;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public ClientDTO getClient() {
        return client;
    }

    public void setClient(ClientDTO client) {
        this.client = client;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public TransactionDTO getTransactionDTO() {
        return transactionDTO;
    }

    public void setTransactionDTO(TransactionDTO transactionDTO) {
        this.transactionDTO = transactionDTO;
    }

   

    
    
    public ContDTO() {
    }

    public ContDTO(Integer id, String iban, String descriere, Double sold, String creationDate, boolean active, ClientDTO client) {
        this.id = id;
        this.iban = iban;
        this.descriere = descriere;
        this.sold = sold;
        this.creationDate = creationDate;
        this.active = active;
        this.client = client;
    }

    public ContDTO(Integer id, String iban, String descriere, Double sold, String creationDate, boolean active) {
        this.id = id;
        this.iban = iban;
        this.descriere = descriere;
        this.sold = sold;
        this.creationDate = creationDate;
        this.active = active;
    }
    
    
    
    
}
