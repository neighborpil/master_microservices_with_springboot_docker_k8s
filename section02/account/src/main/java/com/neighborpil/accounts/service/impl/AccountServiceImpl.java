package com.neighborpil.accounts.service.impl;

import com.neighborpil.accounts.dto.CustomerDto;
import com.neighborpil.accounts.repository.AccountRepository;
import com.neighborpil.accounts.repository.CustomerRepository;
import com.neighborpil.accounts.service.IAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements IAccountService {

    private final AccountRepository accountRepository;
    private final CustomerRepository customerRepository;

    /**
     * Create account
     *
     * @param customerDto
     */
    @Override
    public void createAccount(CustomerDto customerDto) {

    }
}
