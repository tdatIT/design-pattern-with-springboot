package com.patternapp.state.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int no;
    private String id;
    private Date createDate;
    private String email;
    private float amount;
    private String delivery;
    private Date completedDate;
    @Transient
    @JsonIgnore
    private OrderState state;
}
