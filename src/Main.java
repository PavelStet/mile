public class Main {
    public static void main(String[] args) {

        int amount = 20;   //стоимость билета
        int task = 20; // количество рублей в стоимости билета для получения одной бонусной мили
        int mile = amount / task;  // полученые бонусные мили
        System.out.print(mile);

    }
}
