package kriwis.springframework.kriwisbrewery.services;

import kriwis.springframework.kriwisbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
