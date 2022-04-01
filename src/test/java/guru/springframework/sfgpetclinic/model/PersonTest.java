package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.ModelTests;
import org.junit.jupiter.api.*;

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

    @RepeatedTest(value = 10, name = "{displayName} : {currentRepetition} - {totalRepetitions}")
    @DisplayName("My Repeated Test")
    void myRepeatedTest() {
        // TODO
    }

    @RepeatedTest(5)
    void myRepeatedTestWithDependencyInjection(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        System.out.println(testInfo.getDisplayName() + " : " + repetitionInfo.getCurrentRepetition());
    }
}