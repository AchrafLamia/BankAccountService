package org.sdi.bankaccountservice.Service;

import org.sdi.bankaccountservice.DTO.BankAccountRequestDTO;
import org.sdi.bankaccountservice.DTO.BankAccountResponseDTO;
import org.sdi.bankaccountservice.entities.BankAccount;

public interface AccountService {
    BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO) ;

    BankAccountResponseDTO updateAccount(String id, BankAccountRequestDTO bankAccountDTO);
}
