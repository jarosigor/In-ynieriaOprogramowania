package com.pwr.entity;

import java.math.BigDecimal;

public interface Account {
    void increaseBalance(BigDecimal amount);

    void decreaseBalance(BigDecimal amount);
}
