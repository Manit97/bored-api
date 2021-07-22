package com.sparta.ms.boredapi.withFramework;

import com.sparta.ms.boredapi.withFramework.dto.BoredAPIDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BoredAPIFramework {
    BoredAPIDTO boredAPIDTO;

    @BeforeEach
    void setUp(){
        boredAPIDTO = Injector.injectDTO(ConnectionManager.getConnection());
    }

    @Test
    @DisplayName("testStatusCode")
    void testStatusCode() {
        Assertions.assertEquals(200,ConnectionManager.getStatusCode());
    }

    @Test
    @DisplayName("checkThatTheKeyHas7Digits")
    void checkThatTheKeyHas7Digits() {
        Assertions.assertTrue(boredAPIDTO.keyHasSevenDigits());
    }
}
