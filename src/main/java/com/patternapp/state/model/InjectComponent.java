package com.patternapp.state.model;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class InjectComponent {
    @Bean
    public ModelMapper getModelMapper() {
        return new ModelMapper();
    }
}
