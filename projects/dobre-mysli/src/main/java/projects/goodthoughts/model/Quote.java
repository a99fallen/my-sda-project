package projects.goodthoughts.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Quote {
    private String content;
    private String translation;
    private String author;
    private String category;
    private LocalDateTime createdOn;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quote quote = (Quote) o;
        return Objects.equals(content, quote.content) &&
                Objects.equals(author, quote.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, author);
    }

    @Override
    public String toString() {
        return "Quote{" +
                "content='" + content + '\'' +
                ", translation='" + translation + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", createdOn=" + createdOn +
                '}';
    }
}
