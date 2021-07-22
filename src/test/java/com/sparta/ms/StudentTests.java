package com.sparta.ms;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.ms.pojos.StudentPojo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;

import java.io.File;
import java.io.IOException;

public class StudentTests {

    private ObjectMapper objectMapper;
    private StudentPojo studentPojo;

    @BeforeEach
    void setUp(){
        objectMapper = new ObjectMapper();
        try {
            studentPojo = objectMapper.readValue(new File("src/test/resources/newStudent.json"), StudentPojo.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    @DisplayName("checkStudentNameIsBryan")
    void checkStudentNameIsBryan() {
        Assertions.assertEquals("Bryan", studentPojo.getName());
    }
}
