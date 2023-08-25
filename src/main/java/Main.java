import ru.netology.services.VacationCalcServices;

public class Main {

    public static void main(String[] args) {
        VacationCalcServices service = new VacationCalcServices();
        System.out.println("Vacation month: " + service.calcService(10_000, 3_000, 20_000));


    }
}
