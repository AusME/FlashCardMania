package name.benshepley.flashcardmania.controllers.flashcard;


import name.benshepley.flashcardmania.model.entity.FlashCardEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/flash-card")
public class FlashCardController {
    @GetMapping("/")
    public ResponseEntity<List<FlashCardEntity>> getFlashCards() {
        FlashCardEntity flashCard_1 = new FlashCardEntity();
        flashCard_1.setId(1L);
        flashCard_1.setFrontText("Elvis");
        flashCard_1.setBackText("Is Alive");

        FlashCardEntity flashCard_2 = new FlashCardEntity();
        flashCard_2.setId(2L);
        flashCard_2.setFrontText("Hitler's");
        flashCard_2.setBackText("Brain is in a jar, alive.");

        FlashCardEntity flashCard_3 = new FlashCardEntity();
        flashCard_3.setId(3L);
        flashCard_3.setFrontText("Michael Griggs");
        flashCard_3.setBackText("Is a networking guru. Let him meditate on the deeper meaning of Tron legacy.");

        return ResponseEntity.ok(List.of(flashCard_1, flashCard_2, flashCard_3));
    }

}
