package com.pattern.strategy.service;

import com.pattern.strategy.enums.EncryptionTypeEnum;
import org.springframework.stereotype.Service;

@Service
public class SHA1Encryption implements Encryption{
    @Override
    public String  encrypt(String toBeEncrypted) {

        return "SHA1 Encrypted string:"+ toBeEncrypted;
    }

    @Override
    public EncryptionTypeEnum getEncryptionType() {
        return EncryptionTypeEnum.SHA1;
    }
}
