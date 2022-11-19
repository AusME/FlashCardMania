package name.benshepley.flashcardmania.model.entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "flash_card")
public class FlashCardEntity {
    @Id
    private Long id;

    @Basic
    private String frontText;

    @Basic
    private String backText;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getFrontText() {
        return frontText;
    }
    public void setFrontText(String frontText) {
        this.frontText = frontText;
    }

    public String getBackText() {
        return backText;
    }
    public void setBackText(String backText) {
        this.backText = backText;
    }
}
