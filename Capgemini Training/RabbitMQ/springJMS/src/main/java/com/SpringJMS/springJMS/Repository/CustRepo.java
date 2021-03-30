package com.SpringJMS.springJMS.Repository;

import com.SpringJMS.springJMS.Model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustRepo extends MongoRepository<Customer,String> {
}
