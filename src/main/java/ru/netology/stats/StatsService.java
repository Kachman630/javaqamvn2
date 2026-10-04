package ru.netology.stats;

public class StatsService {

    // 1. Сумма всех продаж
    public long sumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    // 2. Средняя сумма продаж в месяц
    public long averageSales(long[] sales) {
        if (sales.length == 0) {
            return 0;
        }
        return sumSales(sales) / sales.length;
    }

    // 3. Номер месяца, в котором был пик продаж (последний из максимальных)
    public int maxSalesMonth(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            // Знак >= гарантирует, что мы найдем ПОСЛЕДНИЙ месяц с макс. продажей
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1; // нумерация месяцев с 1
    }

    // 4. Номер месяца, в котором был минимум продаж (последний из минимальных)
    public int minSalesMonth(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            // Знак <= гарантирует, что мы найдем ПОСЛЕДНИЙ месяц с мин. продажей
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1; // нумерация месяцев с 1
    }

    // 5. Количество месяцев, в которых продажи были ниже среднего
    public int countBelowAverage(long[] sales) {
        long avg = averageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < avg) {
                count++;
            }
        }
        return count;
    }

    // 6. Количество месяцев, в которых продажи были выше среднего
    public int countAboveAverage(long[] sales) {
        long avg = averageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > avg) {
                count++;
            }
        }
        return count;
    }
}