package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDTO getCustomerById(UUID customerID) {
        return CustomerDTO.builder()
                .id(UUID.randomUUID())
                .name("Henni")
                .build();
    }

    @Override
    public CustomerDTO saveNewCustomer(CustomerDTO customerDTO) {
        return customerDTO.builder().build();
    }

    @Override
    public void updateCustomer(UUID customerId) {
        // To do -- impl smthing that updates customer infos
        log.debug("updating");
    }

    @Override
    public void deleteCustomer(UUID customerId) {
        log.debug("deletting customer ... ");
    }
}
