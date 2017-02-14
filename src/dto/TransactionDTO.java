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
public class TransactionDTO implements java.io.Serializable{
    private Integer contDeCreditatID;
    private Integer contDeDebitatID;
    private Double suma;

    public Integer getContDeCreditatID() {
        return contDeCreditatID;
    }

    public void setContDeCreditatID(Integer contDeCreditatID) {
        this.contDeCreditatID = contDeCreditatID;
    }

    public Integer getContDeDebitatID() {
        return contDeDebitatID;
    }

    public void setContDeDebitatID(Integer contDeDebitatID) {
        this.contDeDebitatID = contDeDebitatID;
    }

    public Double getSuma() {
        return suma;
    }

    public void setSuma(Double suma) {
        this.suma = suma;
    }
    
    
    
    
}
