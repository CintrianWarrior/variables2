public class Main {
    public static void main(String[] args) {
        // Задача 8
        int MashaSalaryPerMonth = 67760;
        int DenisSalaryPerMonth = 83690;
        int KristinaSalaryPerMonth = 76230;
        double newMashaSalaryPerMonth = MashaSalaryPerMonth + MashaSalaryPerMonth * 0.1;
        double newDenisSalaryPerMonth = DenisSalaryPerMonth + DenisSalaryPerMonth * 0.1;
        double newKristinaSalaryPerMonth = KristinaSalaryPerMonth + KristinaSalaryPerMonth * 0.1;
        double differenceMashaSalaryPerYear = newMashaSalaryPerMonth * 12 - MashaSalaryPerMonth * 12;
        double differenceDenisSalaryPerYear = newDenisSalaryPerMonth * 12 - DenisSalaryPerMonth * 12;
        double differenceKristinaSalaryPerYear = newKristinaSalaryPerMonth * 12 - KristinaSalaryPerMonth * 12;
        System.out.println("Маша теперь получает " + newMashaSalaryPerMonth + " рублей. Годовой доход вырос на " + differenceMashaSalaryPerYear + " рублей.");
        System.out.println("Денис теперь получает " + newDenisSalaryPerMonth + " рублей. Годовой доход вырос на " + differenceDenisSalaryPerYear + " рублей.");
        System.out.println("Кристина теперь получает " + newKristinaSalaryPerMonth + " рублей. Годовой доход вырос на " + differenceKristinaSalaryPerYear + " рублей.");
        }
}