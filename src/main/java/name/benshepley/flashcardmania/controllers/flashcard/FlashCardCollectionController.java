package name.benshepley.flashcardmania.controllers.flashcard;


import name.benshepley.flashcardmania.model.entity.FlashCardCollectionEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/flash-card-collection")
public class FlashCardCollectionController {
    @GetMapping("/")
    public ResponseEntity<List<FlashCardCollectionEntity>> getFlashCardCollections() {
        return ResponseEntity.ok(Collections.emptyList());
    }

}
