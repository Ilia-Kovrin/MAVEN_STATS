package ru.netology.stats;

import java.util.Arrays;

public class StatsService {

    // Номер месяца минимальных продаж
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }
// Номер месяца максимальных продаж

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    // Сумма всех продаж

    public long sumSales(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;

        }
        return totalSale;
    }

    // Средняя сумма продаж в месяц

    public long averageSumSales(long[] sales) {
        return sumSales(sales) / sales.length;
    }

    // Количество месяцев, в которых продажи были ниже среднего (см. п.2)

    public int lowAverageSumSales(long[] sales) {
        int counter = 0;
        long average = averageSumSales(sales);
        for (long sale : sales) {
            if (sale < average) {
                counter++;
            }
        }
        return counter;

    }


    // Количество месяцев, в которых продажи были выше среднего

    public int upAverageSumSales(long[] sales) {
        int counter = 0;
        long average = averageSumSales(sales);
        for (long sale : sales) {
            if (sale > average) {
                counter++;
            }
        }
        return counter;

    }

}
