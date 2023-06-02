package com.patternapp.observer.controllers;


import com.patternapp.observer.observer.BinaryObserver;
import com.patternapp.observer.observer.HexaObserver;
import com.patternapp.observer.observer.Observer;
import com.patternapp.observer.observer.OctalObserver;
import com.patternapp.observer.subject.Subject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/v1/observers")
public class ObserverController {
    private final Subject subject;

    public ObserverController() {
        subject = new Subject();
        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexaObserver(subject);
    }

    @GetMapping("/update")
    public ResponseEntity<String> getUpdate(@RequestParam int state) {
        subject.setState(state);
        StringBuilder builder = new StringBuilder();
        builder.append(String.format(">>> State change: %s\n", state));
        for (Observer observer : subject.getObservers()) {
            builder.append(observer.getString()).append("\n");
        }
        return ResponseEntity.ok(builder.toString());
    }

    // private String constructResponse() {
    // StringBuilder builder = new StringBuilder();
    // for (Observer observer : subject.getObservers()) {
    // builder.append(observer.getString()).append("\n");
    // }
    // builder.append("Second state change: 10");
    // return builder.toString();
    // }
}
