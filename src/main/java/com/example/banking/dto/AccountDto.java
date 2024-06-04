package com.example.banking.dto;

import lombok.Data;

@Data
public class AccountDto {

    private Long id;
    private String accountHolderName;
    private double balance;

    public AccountDto(Long id, String accountHolderName, double balance) {
    }
}
