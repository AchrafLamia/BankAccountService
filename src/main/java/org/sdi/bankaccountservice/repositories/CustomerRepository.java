package org.sdi.bankaccountservice.repositories;

import org.sdi.bankaccountservice.entities.BankAccount;
import org.sdi.bankaccountservice.entities.Customer;
import org.sdi.bankaccountservice.enums.AccountType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Long > {

}
