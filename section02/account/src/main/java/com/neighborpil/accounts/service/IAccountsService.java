package com.neighborpil.accounts.service;

import com.neighborpil.accounts.dto.CustomerDto;

public interface IAccountsService {

    /**
     * Create account
     *
     * @param customerDto
     */
    void createAccount(CustomerDto customerDto);

    CustomerDto fetchAccount(String mobileNumber);

    boolean updateAccount(CustomerDto customerDto);

    boolean deleteAccount(String mobileNumber);
}
