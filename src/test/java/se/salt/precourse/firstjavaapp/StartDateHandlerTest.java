package se.salt.precourse.firstjavaapp;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
class StartDateHandlerTest {
    @Test
    void returns2ForDateTwoDaysInTheFuture() {
        LocalDate twoDaysInTheFuture = LocalDate.now().plusDays(2);
        long two = new StartDateHandler().daysToCourseStart(twoDaysInTheFuture.toString());

        assertEquals(2, two);
    }
    @Test
    void shouldContainOnlyDigits() {
        StartDateHandler dateHandler = new StartDateHandler();
        assertEquals(false, dateHandler.dateHasOnlyNumbers("qwe"));
        assertEquals(false, dateHandler.dateHasOnlyNumbers("2023/08-04"));
        assertEquals(true, dateHandler.dateHasOnlyNumbers("2023-09-04"));
    }
}