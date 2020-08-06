package kriwis.springframework.kriwisbrewery.services;

import kriwis.springframework.kriwisbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Sixt LightMaker")
                .build();
    }
}
