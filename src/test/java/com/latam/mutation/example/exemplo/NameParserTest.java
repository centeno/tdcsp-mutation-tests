package com.latam.mutation.example.exemplo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NameParserTest {

    private NameParser nameParser;
    private String[] names;

    @Before
    public void setUp() {
        nameParser = new NameParser();
        names = new String[] {"Neymar Junior", "Renato Augusto"};
    }

    @Test
    public void shouldFindPersonByLastName() {
        Person person = nameParser.findPersonWithLastName(names,"Augusto");
        String firsName = person.getFirstName();
        String lastName = person.getLastName();
        assertEquals("Renato",firsName);
    }

    /*
    @Test
    public void shouldFindPersonByLastNameTwo() {
        Person person = nameParser.findPersonWithLastName(names,"Gaetes");
        assertEquals(null,person);
    }
    */
}