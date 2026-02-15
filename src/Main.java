
public class Main {
    public static void main(String[] args) {
        System.out.println("\nЗадача #1");
        int firstFriday = 6;
        for (; firstFriday <= 31; firstFriday += 7) {
            System.out.println("Сегодня пятница," + firstFriday + "-е число. Необходимо подготовить отчет");
        }
        System.out.println("\nЗадача #2 (вариант 1)");
        int distance = 42195;
        int start = 0;
        do {
            start++;
            System.out.println(start + " - Держитесь! Осталось " + distance + " метров");
            distance = distance - 500;
        } while (distance > 0);
        System.out.println("\nЗадача #2 (вариант 2)");
        int start2 = 0;
        for (int i = 42195; i > 0; ) {
            start2++;
            System.out.println(start2 + "_ Держитесь! Осталось " + i + " метров");
            i = i - 500;
        }
    }
}