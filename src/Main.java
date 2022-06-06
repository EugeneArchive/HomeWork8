import java.time.LocalDate;

public class Main {
    private static int cheakYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    private static String cheakVersionMobile(int clientOS) {
        if (clientOS == 0) {
            return "IOS";
        } else {
            return "Android";
        }
    }

    private static int cheakVersionYear(int yearPhone) {
        if (yearPhone >= 2015) {
            return 0;
        } else {
            return 1;
        }
    }

    private static int cheakDay(int deliveryDistance) {
        int deliveryDay = 1;
        if (deliveryDistance > 20) {
            deliveryDay++;
        }
        if (deliveryDistance > 60) {
            deliveryDay++;
        }
        if (deliveryDistance > 100) {
            deliveryDay++;
        }
        return deliveryDay;
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    private static void task1() {
        int yearNow = 2040;
        if (cheakYear(yearNow) == 0) {
            System.out.println(yearNow + " — високосный год.");
        } else {
            System.out.println(yearNow + " - не високосный год.");
        }
    }

    private static void task2() {
        int phoneSystem = 1;
        int yearNow2 = LocalDate.now().getYear();
        if (cheakVersionMobile(phoneSystem) == "IOS" && cheakVersionYear(yearNow2) == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (cheakVersionMobile(phoneSystem) == "IOS" && cheakVersionYear(yearNow2) != 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (cheakVersionMobile(phoneSystem) == "Android" && cheakVersionYear(yearNow2) == 0) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    private static void task3() {
        int deliveryDistanceUser = 105;
        System.out.println("Потребуется дней на доставку: " + cheakDay(deliveryDistanceUser));
    }
}