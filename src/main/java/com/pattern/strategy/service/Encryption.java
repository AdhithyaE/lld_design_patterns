package com.pattern.strategy.service;

import com.pattern.strategy.enums.EncryptionTypeEnum;

public interface Encryption {
    public String encrypt(String toBeEncrypted);
    public EncryptionTypeEnum getEncryptionType();
}
