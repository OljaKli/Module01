package olja.klisho.task06;

import java.util.Objects;

/**
 * Created by Ola-Mola on 08/03/16.
 */
public class Note {


    private String title;
    private String text;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Note note = (Note) o;
        return Objects.equals(title, note.title) &&
                Objects.equals(text, note.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, text);
    }


    public Note (String title, String text) {
        this.title = title;
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void editTitle(String title) {
        this.title = title;
    }

    public void editText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString(){
        return (title + ": " + text);
    }

}
