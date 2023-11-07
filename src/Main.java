public class Main {

    public static void main(String[] args) {
        int amount = 1100; //Начальный счёт
        int rechargeAmount = 1099; //Сумма пополнения
        int bonusRub;

        if (rechargeAmount > 1000) {
            bonusRub = rechargeAmount / 100;
            System.out.println("Бонусных рублей: " + bonusRub);
            System.out.println("Итоговая сумма на счету : " + (bonusRub + rechargeAmount + amount));
        } else {
            bonusRub = 0;
            System.out.println("Бонусных рублей: " + bonusRub);
            System.out.println("Итоговая сумма на счету : " + (bonusRub + rechargeAmount + amount));
        }

    }
}
