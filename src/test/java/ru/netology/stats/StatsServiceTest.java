package ru.netology.stats;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatsServiceTest {
    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        // вызываем целевой метод:
        int actual = service.sumSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        // если true - то PASS
        // если false - то FAIL
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAvg() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        // вызываем целевой метод:
        int actual = service.avgSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        // если true - то PASS
        // если false - то FAIL
        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateMax() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        // вызываем целевой метод:
        int actual = service.maxSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        // если true - то PASS
        // если false - то FAIL
        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateMin() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        // вызываем целевой метод:
        int actual = service.minSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        // если true - то PASS
        // если false - то FAIL
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMinAvg() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        // вызываем целевой метод:
        int actual = service.minAvgSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        // если true - то PASS
        // если false - то FAIL
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMaxAvg() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        // вызываем целевой метод:
        int actual = service.maxAvgSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        // если true - то PASS
        // если false - то FAIL
        assertEquals(expected, actual);
    }


}
