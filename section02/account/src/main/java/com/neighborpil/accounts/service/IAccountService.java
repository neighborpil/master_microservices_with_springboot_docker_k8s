package com.neighborpil.accounts.service;

import com.neighborpil.accounts.dto.CustomerDto;

public interface IAccountService {

    /**
     * Create account
     *
     * @param customerDto
     */
    void createAccount(CustomerDto customerDto);
}
