package com.leetcode.code75;

import org.junit.jupiter.api.*;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Reverse_Word_In_A_StringTest {

    private ExecutorService executorService;

    @BeforeEach
    public void init(){
        try{
            System.err.println("Resource Opened --> ");
            executorService = Executors.newFixedThreadPool(10);
            executorService.execute(this::reverseWordsTest);
        }
        catch (Exception ignored){}
    }

    @AfterEach
    public void cleanUp(){
        System.err.println("Cleanup --> ");
        this.executorService.shutdown();
    }

    @Test
    public void reverseWordsTest(){

        System.err.println("Thread name :: " + Thread.currentThread().getName());
        System.err.println("Time Stamp :: " + LocalDateTime.now());

        String actual = Reverse_Word_In_A_String.reverseWords("the sky is blue");
        String expected = "blue is sky the";

        System.out.println("Actual " + actual);
        System.out.println("Expected " + expected);

        Assertions.assertEquals(expected, actual);
    }

}
