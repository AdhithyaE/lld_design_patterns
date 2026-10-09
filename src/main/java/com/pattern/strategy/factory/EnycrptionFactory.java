package com.pattern.strategy.factory;

import com.pattern.strategy.enums.EncryptionTypeEnum;
import com.pattern.strategy.service.Encryption;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Component
public class EnycrptionFactory {
    Map<EncryptionTypeEnum, Encryption> map;

    public EnycrptionFactory(Set<Encryption> encryptionSet) {
        createStrategy(encryptionSet);
    }

    public void createStrategy(Set<Encryption> encryptionSet) {
        map = new HashMap<>();
        encryptionSet.stream().forEach(encryption ->
                map.put(encryption.getEncryptionType(), encryption));
    }

    public Encryption findEncryptionType(EncryptionTypeEnum encryptionType) {
        return map.get(encryptionType);
    }
}
