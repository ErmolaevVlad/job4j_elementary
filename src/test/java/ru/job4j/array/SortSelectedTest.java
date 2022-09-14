package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SortSelectedTest {

    @Test
    public void whenSortLengthArray5() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortLengthArray4() {
        int[] data = new int[] {9, 6, 1, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 5, 6, 9};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortLengthArray9() {
        int[] data = new int[] {9, 6, 1, 5, 3, 7, 2, 8, 4};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertThat(result).containsExactly(expected);
    }
}