package com.pattern.strategy.controller;

import com.pattern.strategy.enums.EncryptionTypeEnum;
import com.pattern.strategy.factory.EnycrptionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StrategyController {
    @Autowired
    EnycrptionFactory enycrptionFactory;

    @GetMapping("/encrypt")
    public ResponseEntity<String> encryptWithEncoder(@RequestParam EncryptionTypeEnum encryptionType, @RequestParam String key) {
       return new ResponseEntity<>(enycrptionFactory.findEncryptionType(encryptionType).encrypt(key), HttpStatus.OK);
    }

}
