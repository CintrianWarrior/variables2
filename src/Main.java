public class Main {
    public static void main(String[] args) {
        // Задача 5
        byte paintCans = 120;
        int classes = paintCans / 6;
        int whitePaintCans = classes * 2;
        int brownPaintCans = classes * 4;
        System.out.println("В школе, где " + classes + " классов, нужно " + whitePaintCans + " банок белой краски и " + brownPaintCans + " банок коричневой краски");
        }
}