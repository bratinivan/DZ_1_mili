public class Main {
    public static void main(String[] args) {
        int ticketPrice = 10000; // Стоимость билета
        int bonus = 20; // Стоимость одного бонуса
        int miles = ticketPrice / bonus; // Кол-во бонусов
        System.out.println("Начислено бонусных миль: " + miles);
    }
}
