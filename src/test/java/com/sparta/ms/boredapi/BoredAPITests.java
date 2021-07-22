package com.sparta.ms.boredapi;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.ms.boredapi.withFramework.dto.BoredAPIDTO;
import org.junit.jupiter.api.*;

import java.io.IOException;
import java.net.URL;

public class BoredAPITests {

    ObjectMapper objectMapper;
    BoredAPIDTO boredAPIDTO;

    @BeforeEach
    void setUp(){
        try {
            boredAPIDTO = objectMapper.readValue(new URL("http://www.boredapi.com/api/activity"), BoredAPIDTO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Nested
    @DisplayName("checkValueForTypes")
    class checkValueForTypes {
        @Test
        @DisplayName("activityShouldBeString")
        void  activityShouldBeString() {
            Assertions.assertEquals(String.class, boredAPIDTO.getActivity().getClass());
        }
    }


}
