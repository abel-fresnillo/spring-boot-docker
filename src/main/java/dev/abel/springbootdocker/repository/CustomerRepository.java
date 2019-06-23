package dev.abel.springbootdocker.repository;

import dev.abel.springbootdocker.domain.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {

}
