package com.patternapp.template_pattern;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/template")
public class TemplateController {
    @GetMapping
    public ResponseEntity getTemplate(HttpServletRequest request){
        UserAction user1 = new User1();
        user1.listUserAction();
        System.out.println("#############################333");
        UserAction user2 = new User2();
        user2.listUserAction();
        return ResponseEntity.noContent().build();
    }
}
