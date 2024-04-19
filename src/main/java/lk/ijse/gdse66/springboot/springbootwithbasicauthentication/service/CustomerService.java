package lk.ijse.gdse66.springboot.springbootwithbasicauthentication.service;

import lk.ijse.gdse66.springboot.springbootwithbasicauthentication.dto.CustomerDTO;

import java.util.List;

/**
 * @author : Kavithma Thushal
 * @project : Demo
 * @since : 11:06 AM - 4/19/2024
 **/
public interface CustomerService {
    List<CustomerDTO> geAllCustomers();
}
