public class Main {
    public static void main(String[] args) {
        // Задача 6
        byte bananaWeight = 80;
        byte milk100MlWeight = 105;
        byte iceCreamWeight = 100;
        byte eggWeight = 70;
        double productWeightGram = bananaWeight * 5 + milk100MlWeight * 2 + iceCreamWeight * 2 + eggWeight * 4;
        double productWeightKilo = productWeightGram / 1000;
        System.out.println("Вес спорт-завтрака " + productWeightKilo + " килограмм");
        }
}