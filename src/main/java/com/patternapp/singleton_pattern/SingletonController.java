package com.patternapp.singleton_pattern;


import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/singleton")
public class SingletonController {
    @GetMapping
    public ResponseEntity getSingleton(HttpServletRequest request){
        LazyInitializedSingleton singleton1 = LazyInitializedSingleton.getInstance();
        System.out.println("#################################");
        LazyInitializedSingleton singleton2 = LazyInitializedSingleton.getInstance();
        return ResponseEntity.noContent().build();
    }

}
