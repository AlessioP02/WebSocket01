package com.example.WebSocket01.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class MessageDTO {

    private String type;
    private String message;
}
