public class Main {
    public static void main(String[] args) {

        int amount = 500; //первоначальная сумма счета
        int payment = 1500; //пополнение
        int percent;

        if (payment > 1000) {
            percent = 1;
        } else {
            percent = 0;
        }
        int bonus = payment / 100 * percent;

        System.out.println("Ваш бонус = " + bonus + " рублям, итоговая сумма Вашего счета = " + (amount + payment + bonus) + " рублей.");

    }
}
