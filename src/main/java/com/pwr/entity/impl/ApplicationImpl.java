package com.pwr.entity.impl;


import com.pwr.entity.Account;
import com.pwr.entity.Application;
import com.pwr.entity.BankTransfer;
import lombok.*;

import java.util.ArrayList;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationImpl implements Application {

    private ArrayList<Account> accounts;
    private ArrayList<BankTransfer> bankTransfers;

    @Override
    public Account findAccountByPesel(Integer pesel) {
        return null;
    }

    @Override
    public BankTransfer executeBankTransfer(BankTransfer bankTransfer) {
        return null;
    }
}
