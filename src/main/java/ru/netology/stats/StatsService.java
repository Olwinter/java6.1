package ru.netology.stats;

public class StatsService {
    //сумма всех продаж
    public int sumSales(int[] sales) {
        int sum = 0; //начинаем с нуля
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    //Средняя сумма продаж в месяц
    public int avgSales(int[] sales) {
        return sumSales(sales) / sales.length;
    }

    //номер месяца, в котором был пик продаж
    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    //Номер месяца, в котором был минимум продаж
    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    //кол-во месяцев, в которых продажи были ниже среднего
    public int minAvgSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        int avg = sumSales(sales) / sales.length;
        for (long sale : sales) {
            if (sale < avg) {
                minMonth = minMonth + 1;
            }
        }
        return minMonth;
    }

    //кол-во месяцев, в которых продажи были выше среднего
    public int maxAvgSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        int avg = sumSales(sales) / sales.length;
        for (long sale : sales) {
            if (sale > avg) {
                maxMonth = maxMonth + 1;
            }
        }
        return maxMonth;
    }


}
