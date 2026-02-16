
public class Main {
    public static void main(String[] args) {
        System.out.println("\nЗадача #1");
        int firstFriday = 3;
        for (; firstFriday <= 31; firstFriday += 7) {
            System.out.println("Сегодня пятница," + firstFriday + "-е число. Необходимо подготовить отчет");
        }
        System.out.println("\nЗадача #2 (вариант 1)");
        int distance = 0;
        int start = 0;
        int way = 42195;
        do {
            start++;
            System.out.println(start + " - Держитесь! Осталось " + (way - distance) + " метров");
            distance = distance + 500;
            // way = - distance;
        } while (distance < way);
        System.out.println("\nЗадача #2 (вариант 2)");
        start = 0;
        for (int i = 0; i < way; i += 500) {
            start++;
            System.out.println(start + "_ Держитесь! Осталось " + (way - i) + " метров");
            // distance = distance + 500;
        }
        System.out.println("\nЗадача #3");
    }
}