package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDTO;

import java.util.UUID;

public interface CustomerService {
   CustomerDTO getCustomerById(UUID customerID);

    CustomerDTO saveNewCustomer(CustomerDTO customerDTO);

    void updateCustomer(UUID customerId);

    void deleteCustomer(UUID customerId);
}
