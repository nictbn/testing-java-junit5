package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.ModelTests;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest implements ModelTests {
    @Test
    void groupedAssertions() {
        // given
        Person person = new Person(1L, "Joe", "Buck");

        // then
        assertAll("Assert Props Set",
                () -> assertEquals("Joe", person.getFirstName()),
                () -> assertEquals("Buck", person.getLastName()));
    }

    @Test
    void groupedAssertionMessages() {
        // given
        Person person = new Person(1L, "Joe", "Buck");

        // then
        assertAll("Assert Props Set",
                () -> assertEquals("Joe", person.getFirstName() , "First Name Failed"),
                () -> assertEquals("Buck", person.getLastName(),  "Last Name Failed"));
    }
}