package ru.netology.stats;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    @Test
    public void shouldCalculateSumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.sumSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = service.averageSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMaxSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        // Максимум 20 достигается в 6-м и 8-м месяце. Должен вернуться 8-й.
        int expected = 8;

        int actual = service.maxSalesMonth(sales);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMinSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        // Минимум 7 достигается в 9-м месяце.
        int expected = 9;

        int actual = service.minSalesMonth(sales);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCountMonthsBelowAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        // Ниже среднего (15): 8, 13, 7, 14, 14 (всего 5)
        int expected = 5;

        int actual = service.countBelowAverage(sales);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCountMonthsAboveAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        // Выше среднего (15): 17, 20, 19, 20, 18 (всего 5)
        int expected = 5;

        int actual = service.countAboveAverage(sales);

        assertEquals(expected, actual);
    }
}
