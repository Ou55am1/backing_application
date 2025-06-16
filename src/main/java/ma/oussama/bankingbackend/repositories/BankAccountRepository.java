package ma.oussama.bankingbackend.repositories;

import ma.oussama.bankingbackend.entities.BankAccount;
import ma.oussama.bankingbackend.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}