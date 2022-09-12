package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SwitchWeekTest {

    @Test
    void whenNameOfDay1() {
        int in = 1;
        String result = SwitchWeek.nameOfDay(in);
        String expected = "Понедельник";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenNameOfDay2() {
        int in = 2;
        String result = SwitchWeek.nameOfDay(in);
        String expected = "Вторник";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenNameOfDay3() {
        int in = 3;
        String result = SwitchWeek.nameOfDay(in);
        String expected = "Среда";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenNameOfDay4() {
        int in = 4;
        String result = SwitchWeek.nameOfDay(in);
        String expected = "Четверг";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenNameOfDay5() {
        int in = 5;
        String result = SwitchWeek.nameOfDay(in);
        String expected = "Пятница";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenNameOfDay6() {
        int in = 6;
        String result = SwitchWeek.nameOfDay(in);
        String expected = "Суббота";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenNameOfDay7() {
        int in = 7;
        String result = SwitchWeek.nameOfDay(in);
        String expected = "Воскресенье";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenNameOfDayOutOfRange() {
        int in = 10;
        String result = SwitchWeek.nameOfDay(in);
        String expected = "Ошибка";
        assertThat(result).isEqualTo(expected);
    }
}