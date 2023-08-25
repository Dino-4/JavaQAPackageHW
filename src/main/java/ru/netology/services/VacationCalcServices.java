package ru.netology.services;


public class VacationCalcServices {
    public int calcService(int income, int expenses, int trashold) {
        int count = 0; // количество месяцев
        int money = 0; // деньги на счету
        for (int month = 0; month < 12; month++) {
            if (money < trashold) {
                money = money + income - expenses;
            } else {
                count = count + 1;

                money = (money - expenses) / 3;
            }
        }
        return count;

    }

}
