package lk.ijse.gdse66.springboot.springbootwithbasicauthentication.repository;

import lk.ijse.gdse66.springboot.springbootwithbasicauthentication.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Kavithma Thushal
 * @project : Demo
 * @since : 11:09 AM - 4/19/2024
 **/
public interface CustomerRepo extends JpaRepository<CustomerEntity, String> {
}
