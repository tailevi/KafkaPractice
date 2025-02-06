package com.example.KafkaPractice.requests;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MessageRequest {
    public String message;

}
