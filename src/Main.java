public class Main {
    public static void main(String[] args) {
        // Задача 7
        short necessaryWeightLoss = 7000;
        short firstWeightLossPerDay = 250;
        short secondWeightLossPerDay = 500;
        int daysAtFirstVariant = necessaryWeightLoss / firstWeightLossPerDay;
        System.out.println("Если спортсмен будет терять за день по 250 грамм, то для похудения ему потребуется " + daysAtFirstVariant + " дней");
        int daysAtSecondVariant = necessaryWeightLoss / secondWeightLossPerDay;
        System.out.println("Если спортсмен будет терять за день по 500 грамм, то для похудения ему потребуется " + daysAtSecondVariant + " дней");
        int daysOnAverage = necessaryWeightLoss / ((firstWeightLossPerDay + secondWeightLossPerDay)/2);
        System.out.println("В среднем, чтобы сбросить вес, спортсмену понадобится " + daysOnAverage + " дней");
        }
}