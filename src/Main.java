public class Main {
    public static void main(String[] args) {

        // Первое задание

        System.out.println("\nTask 1\n");
        int[] spendMoney = {15_000, 16_000, 14_000, 13_000, 15_500};
        int sum = 0;
        for (int i = 0; i < spendMoney.length; i++) {
            sum += spendMoney[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        // Второе задание

        System.out.println("\nTask 2\n");
        int[] spendMoney1 = new int[5];
        spendMoney1[0] = 23_000;
        spendMoney1[1] = 9_000;
        spendMoney1[2] = 21_000;
        spendMoney1[3] = 20_000;
        spendMoney1[4] = 13_000;
        int summax = 0;
        int summin = 0;
        for (int i = 0; i < 5; i++) {
            if (spendMoney1[i] > summax) {
                summax = spendMoney1[i];
            }
        }
        summin = summax;
        for (int i = 0; i < 5; i++) {
            if (spendMoney1[i] < summin) {
                summin = spendMoney1[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + summin + " рублей");
        System.out.println("Максимальная сумма трат за неделю составила " + summax + " рублей");

        // Третье задание

        System.out.println("\nTask 3\n");
        int[] spendMoney2 = new int[5];
        spendMoney2[0] = 17_000;
        spendMoney2[1] = 11_000;
        spendMoney2[2] = 27_000;
        spendMoney2[3] = 22_000;
        spendMoney2[4] = 7_000;
        int sum2 = 0;
        for (int i = 0; i < spendMoney2.length; i++) {
            sum2 += spendMoney2[i];
        }
        System.out.println("Средняя сумма трат за месяц составила " + sum2 / spendMoney2.length + " рублей");

        // Четвертое задание

        System.out.println("\nTask 4\n");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);

        }







    }
}