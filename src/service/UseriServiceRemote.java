/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dto.UserDTO;
import javax.ejb.Remote;


/**
 *
 * @author Israel Dago
 */
@Remote
public interface UseriServiceRemote {
    public boolean registerUser(UserDTO userDTO);
    public UserDTO loginUser(UserDTO userDTO);

   
}
