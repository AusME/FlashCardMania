package name.benshepley.flashcardmania.controllers;


import name.benshepley.flashcardmania.model.entity.FlashCardEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class FlashCardController {
    @GetMapping("/")
    public ResponseEntity<List<FlashCardEntity>> getFlashCards() {
        return ResponseEntity.ok(Collections.emptyList());
    }

}
