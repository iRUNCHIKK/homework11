public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("Task 1");
        isLeapYear(1879);

        //task 2
        System.out.println("Task 2");
        checkOS(1,2024);

        //task 3
        System.out.println("Task 3");
        int deliveryDistance = 95;
        countDeliveryDays(deliveryDistance);
    }

    public static void isLeapYear(int year) {
        if ((year >= 1584) && (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))) {
            System.out.println(year + " год - високосный год");
        } else {
            System.out.println(year + " год - невисокосный год");
        }
    }
    public static void checkOS(int os, int clientDeviceYear) {
        int currentYear = 1900;
        //int currentYear = LocalDate.now().getYear(); - у меня данный способ не работает

        if (os == 0) {
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            }
        } else if (os == 1) {
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите обычную версию приложения для Android по ссылке");
            }
        }
    }

    public static int countDeliveryDays(int distance) {
        int days = 0;
        if (distance <= 20) {
            days = 1;
        } else if (distance <= 60) {
            days = 2;
        } else if (distance <= 100) {
            days = 3;
        } else {
            System.out.println("Доставки нет");
        }
        System.out.println("Потребуется дней: " + days);
        return days;
    }
    }