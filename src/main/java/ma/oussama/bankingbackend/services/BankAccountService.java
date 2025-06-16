package ma.oussama.bankingbackend.services;

import ma.oussama.bankingbackend.dtos.*;
import ma.oussama.bankingbackend.entities.BankAccount;
import ma.oussama.bankingbackend.entities.CurrentAccount;
import ma.oussama.bankingbackend.entities.Customer;
import ma.oussama.bankingbackend.entities.SavingAccount;
import ma.oussama.bankingbackend.exceptions.BalanceNotSufficientException;
import ma.oussama.bankingbackend.exceptions.BankAccountNotFoundException;
import ma.oussama.bankingbackend.exceptions.CustomerNotFoundException;

import java.util.List;
public interface BankAccountService {
    CustomerDTO saveCustomer(CustomerDTO customerDTO);
    CurrentBankAccountDTO saveCurrentBankAccount(double initialBalance, double overDraft, Long customerId) throws CustomerNotFoundException;
    SavingBankAccountDTO saveSavingBankAccount(double initialBalance, double interestRate, Long customerId) throws CustomerNotFoundException;
    List<CustomerDTO> listCustomers();
    BankAccountDTO getBankAccount(String accountId) throws BankAccountNotFoundException;
    void debit(String accountId, double amount, String description) throws BankAccountNotFoundException, BalanceNotSufficientException;
    void credit(String accountId, double amount, String description) throws BankAccountNotFoundException;
    void transfer(String accountIdSource, String accountIdDestination, double amount) throws BankAccountNotFoundException, BalanceNotSufficientException;

    List<BankAccountDTO> bankAccountList();

    CustomerDTO getCustomer(Long customerId) throws CustomerNotFoundException;

    CustomerDTO updateCustomer(CustomerDTO customerDTO);

    void deleteCustomer(Long customerId);

    List<AccountOperationDTO> accountHistory(String accountId);

    AccountHistoryDTO getAccountHistory(String accountId, int page, int size) throws BankAccountNotFoundException;

    List<CustomerDTO> searchCustomers(String keyword);
}