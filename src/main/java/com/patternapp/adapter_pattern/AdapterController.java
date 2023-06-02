package com.patternapp.adapter_pattern;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/adapter")
public class AdapterController {

    @GetMapping
    public ResponseEntity getAdapter(HttpServletRequest request){
        AnotherCharacter character = new AnotherCharacter();
        character.use("wand", "mana");
        character.use("sword", "stamina");
        character.use("bow", "stamina");
        character.use("crossbow", "stamina");

        return ResponseEntity.noContent().build();
    }
}
