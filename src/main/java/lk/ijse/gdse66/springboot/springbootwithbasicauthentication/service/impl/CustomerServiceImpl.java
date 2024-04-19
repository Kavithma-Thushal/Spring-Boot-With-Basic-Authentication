package lk.ijse.gdse66.springboot.springbootwithbasicauthentication.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.gdse66.springboot.springbootwithbasicauthentication.dto.CustomerDTO;
import lk.ijse.gdse66.springboot.springbootwithbasicauthentication.repository.CustomerRepo;
import lk.ijse.gdse66.springboot.springbootwithbasicauthentication.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : Kavithma Thushal
 * @project : Demo
 * @since : 11:06 AM - 4/19/2024
 **/
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepo customerRepo;
    private ModelMapper modelMapper;

    public CustomerServiceImpl(CustomerRepo customerRepo, ModelMapper modelMapper) {
        this.customerRepo = customerRepo;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<CustomerDTO> geAllCustomers() {
        return customerRepo.findAll().stream().map(customer -> modelMapper.map(customer, CustomerDTO.class)).toList();
    }
}
