package com.sparta.ms;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.ms.pojos.StudentPojo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class JacksonTests {
    StudentPojo studentPojo;
    ObjectMapper objectMapper = new ObjectMapper();

    @Test
    @DisplayName("usingJacksonTree")
    void usingJacksonTree() {
        try {
            StudentPojo studentPojo = objectMapper.readValue(new File("src/test/resources/newStudent.json"), StudentPojo.class);
            JsonNode jsonNode = objectMapper.valueToTree(studentPojo);
            System.out.println(jsonNode.get("Courses").get(0));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
