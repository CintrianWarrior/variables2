public class Main {
    public static void main(String[] args) {
        // Задача 4
        byte productivityIn2Minutes = 16;
        int productivityPerHour = productivityIn2Minutes * 30;
        int productivityIn20Minutes = productivityIn2Minutes * 10;
        System.out.println("За 20 минут машина произвела бутылок " + productivityIn20Minutes + " штук");
        int productivityPerDay = productivityPerHour * 24;
        System.out.println("За сутки машина произвела бутылок " + productivityPerDay + " штук");
        int productivityIn3Days = productivityPerDay * 3;
        System.out.println("За 3 дня машина произвела бутылок " + productivityIn3Days + " штук");
        int productivityPerMonth = productivityPerDay * 30;
        System.out.println("За месяц машина произвела бутылок " + productivityPerMonth + " штук");
        }
}