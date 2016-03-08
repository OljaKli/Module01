package olja.klisho.task06;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Ola-Mola on 07/03/16.
 */
public class Notepad implements Iterable<Note>{
    private final ArrayList<Note> notes = new ArrayList<Note>(); // ArrayList uses array

    public Note addNote(String title, String text) {
        Note newNote = new Note(title, text);
        notes.add(newNote); //add to ArrayList
        return newNote;
    }

    public void removeNote(Note note) {
        notes.remove(note);
    }

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