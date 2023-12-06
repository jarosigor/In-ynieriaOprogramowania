package com.pwr.entity;

import com.pwr.entity.Account;

public interface Application {
    Account findAccountByPesel(Integer pesel);
    BankTransfer executeBankTransfer(BankTransfer bankTransfer);
}
