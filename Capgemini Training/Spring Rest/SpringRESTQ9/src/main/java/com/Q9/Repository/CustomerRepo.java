package com.Q9.Repository;


import com.Q9.model.customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends CrudRepository<customer,Integer>{}