package olja.klisho.task06;

import java.util.Objects;

/**
 * Note is the class - the note in Notepad
 * class Note stores fields: title and text of the Note
 */
public class Note {


    private String title;
    private String text;


    /**
     * equals method compares with other note object by title and text values
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Note note = (Note) o;
        return Objects.equals(title, note.title) &&
                Objects.equals(text, note.text);
    }

    /**
     * hashCode method computes hashCode based on title and text values
     */
    @Override
    public int hashCode() {
        return Objects.hash(title, text);
    }

    /**
     * Note constructor creates Note with given title and text
     */
    public Note (String title, String text) {
        this.title = title;
        this.text = text;
    }

    /**
     * getTitle method returns title
     * @return the title of the note
     */
    public String getTitle() {
        return title;
    }

    /**
     * editTitle method sets up the new title value
     * @param title new note title
     */
    public void editTitle(String title) {
        this.title = title;
    }

    /**
     * editText method sets up the new text value
     */
    public void editText(String text) {
        this.text = text;
    }

    /**
     * getText method returns text
     */
    public String getText() {
        return text;
    }

    /**
     * toString method converts note to string representation: title + text
     */
    @Override
    public String toString(){
        return (title + ": " + text);
    }

}
