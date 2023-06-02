package com.patternapp.state.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UpdateResponse {
    String message;
    Order order_data;
}
