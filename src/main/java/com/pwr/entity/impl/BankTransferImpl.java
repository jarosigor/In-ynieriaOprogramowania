package com.pwr.entity.impl;

import com.pwr.entity.Account;
import com.pwr.entity.BankTransfer;
import com.pwr.enums.BankTransferType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankTransferImpl implements BankTransfer {

    private UUID id;
    private BigDecimal amount;
    private BankTransferType type;
    private Account recepient;
    private Account sender;
}
