package olja.klisho.task06;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests for Notepad class
 */
public class NotepadTest {

    @Test
    public void testAddNote() throws Exception {
        Notepad notepad = new Notepad();
        Note n1 = notepad.addNote("Olja", "Kli");
        Note n2 = notepad.addNote("Tanja", "Kli");
        Note n3 = notepad.addNote("Masha", "Kli");

        for (Note n : notepad) {

            System.out.println(n);
        }

        notepad.removeNote(n2);

        for (Note n : notepad) {

            System.out.println("after remove: "+n);
        }
    }

    @Test
    public void testRemoveNote() throws Exception {

    }

    @Test
    public void testIterator() throws Exception {

    }
}