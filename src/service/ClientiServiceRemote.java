/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dto.ClientDTO;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Israel Dago
 */
@Remote
public interface ClientiServiceRemote {
    public void adaugaClient(ClientDTO clientDTO);
    public void removeClient(ClientDTO clientDTO);  
    public List<ClientDTO> allClienti();
}
