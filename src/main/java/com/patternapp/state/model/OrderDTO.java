package com.patternapp.state.model;

import lombok.Data;

import java.util.Date;

@Data
public class OrderDTO {
    private String email;
    private Date createDate;
    private float amount;
}
