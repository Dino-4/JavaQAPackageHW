package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class VacationCalcServicesTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/bonus.csv")
    public void vacationMonthTest(int income, int expenses, int treshold, int expected) {
        VacationCalcServices service = new VacationCalcServices();

        //int expected
        int actual = service.calcService(income, expenses, treshold);

        //Использование метода Assertion для сравнения ожидаемого результата и фактического
        Assertions.assertEquals(expected, actual);
    }


}
