package com.pattern.strategy.service;

import com.pattern.strategy.enums.EncryptionTypeEnum;
import org.springframework.stereotype.Service;

@Service
public class MD5Encryption implements Encryption{
    @Override
    public String encrypt(String toBeEncrypted) {
        return "MD5 Encrypted string:"+ toBeEncrypted;
    }

    @Override
    public EncryptionTypeEnum getEncryptionType() {
        return EncryptionTypeEnum.MD5;
    }
}
