/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dto.ContDTO;
import dto.TransactionDTO;
import java.util.List;

/**
 *
 * @author Israel Dago
 */
public interface ConturiServiceRemote {
    public void addAccount(ContDTO contDTO);
    public void removeAccount(ContDTO contDTO);
    public List<ContDTO> allAccounts();
    public void depunereNumar(TransactionDTO transactionDTO);
    public void retragereNumar(TransactionDTO transactionDTO);
    public void transferNumar(TransactionDTO transactionDTO);
}
