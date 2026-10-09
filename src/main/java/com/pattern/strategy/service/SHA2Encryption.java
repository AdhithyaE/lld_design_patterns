package com.pattern.strategy.service;

import com.pattern.strategy.enums.EncryptionTypeEnum;
import org.springframework.stereotype.Service;

@Service
public class SHA2Encryption implements Encryption{
    @Override
    public String encrypt(String toBeEncrypted) {

        return "SHA2 Encrypted string:"+ toBeEncrypted;
    }

    @Override
    public EncryptionTypeEnum getEncryptionType() {
        return EncryptionTypeEnum.SHA2;
    }
}
