package ru.netology.stats.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
    @Test
    public void shouldFindBetweenEnds() {

        StatsService service = new StatsService();
        long[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMonth = 9;
        long actualMonth = service.minSales(arr);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindMaxMonth() {
        StatsService service = new StatsService();

        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMonth = 8;
        long actualMonth = service.maxSales(sale);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void findSumMonth() {
        StatsService service = new StatsService();

        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMonth = 180;
        long actualMonth = service.sumSales(sale);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void findAverageSumMonth() {
        StatsService service = new StatsService();

        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMonth = 15;
        long actualMonth = service.averageSumSales(sale);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void findLowAverageSumMonth() {
        StatsService service = new StatsService();

        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMonth = 5;
        long actualMonth = service.lowAverageSumSales(sale);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void findUpAverageSumMonth() {
        StatsService service = new StatsService();

        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMonth = 5;
        long actualMonth = service.upAverageSumSales(sale);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }
}
