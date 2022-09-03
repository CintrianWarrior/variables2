public class Main {
    public static void main(String[] args) {
        // Задача 3
        byte firstClass = 23;
        byte secondClass = 27;
        byte thirdClass = 30;
        int studentsNumber = firstClass + secondClass + thirdClass;
        short paper = 480;
        int papersPerStudent = paper / studentsNumber;
        System.out.println("На каждого ученика рассчитано " + papersPerStudent + " листов бумаги");
        }
}