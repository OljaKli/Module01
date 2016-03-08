package olja.klisho.task06;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Collection of Notes
 */
public class Notepad implements Iterable<Note>{
    private final ArrayList<Note> notes = new ArrayList<Note>(); // ArrayList uses array

    /**
     * addNote method creates new note, puts in the collection of Notes and returns it
     */
    public Note addNote(String title, String text) {
        Note newNote = new Note(title, text);
        notes.add(newNote); //add to ArrayList
        return newNote;
    }

    /**
     * removeNote method removes notes from the collection
     */
    public void removeNote(Note note) {
        notes.remove(note);
    }

    /**
     * Returns an iterator over elements of Note
     */
    public Iterator<Note> iterator() {
        return notes.iterator();
    }


}
//
//    Спроектировать и разработать классы Запись в блокноте и Блокнот (записи
//
//    блокнота хранятся в массиве). Реализовать методы: Добавить запись, Удалить
//
//    запись, Редактировать запись, Посмотреть все записи. Написать для данного
//
//    кода javadoc-документацию.