package com.sparta.ms.boredapi.withFramework;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.ms.boredapi.withFramework.dto.BoredAPIDTO;

import java.io.IOException;
import java.net.URL;

public class Injector {

    public static BoredAPIDTO injectDTO(String url) {
        BoredAPIDTO boredAPIDTO = new BoredAPIDTO();
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            boredAPIDTO = objectMapper.readValue(new URL(url), BoredAPIDTO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return boredAPIDTO;
    }
}
