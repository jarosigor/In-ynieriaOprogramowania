package com.pwr.entity.impl;

import com.pwr.entity.Account;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountImpl implements Account {

    private String firstname;
    private String lastname;
    private Integer pesel;
    private String email;
    private BigDecimal balance;

    @Override
    public void increaseBalance(BigDecimal amount) {

    }

    @Override
    public void decreaseBalance(BigDecimal amount) {

    }
}
