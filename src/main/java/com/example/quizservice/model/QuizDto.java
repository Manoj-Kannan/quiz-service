package com.example.quizservice.model;

import lombok.Data;

@Data
public class QuizDto {
    /**
     * A simple Data Transfer Object for API Payload construction
     */
    String categoryName;
    Integer numQuestions;
    String title;
}
