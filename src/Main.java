
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
        }
        System.out.println("\nЗадача #3 (вариант 1)");
        int payment = 1060;
        int day;
        int counter = 1;
        while (payment >= 0) {
            day = payment / 100;
            System.out.println("День:" + counter + " В бюджете осталось " + payment + " на " + day + " дней парковки");
            if (counter % 5 == 0) {
                counter++;
                System.out.println("5-й день, плата не снимается");
                continue;
            }
            counter++;
            payment = payment - 100;
        }
        System.out.println("\nЗадача #3 (вариант 2)");
        counter = 1;
        int i = 2000;
        for (; i >= 0; ) {
            day = i / 100;
            System.out.println("День:" + counter + " В бюджете осталось " + i + " на " + day + " дней парковки");
            if (counter % 5 == 0) {
                System.out.println("5-й день, плата не снимается");
                counter++;
                continue;
            } else {
                counter++;
                i = i - 100;
            }
        }
        System.out.println("\nЗадача #4");
        int month = 0;
        int total = 0;
        int plan = 12_000_000;
        while (true) {
            month++;
            if (total <= plan) {
                System.out.println("Месяц " + month + "-й, на счету: " + (total = total + 15_000));
            }
            if (month % 6 == 0) {
                System.out.println("Начисление процентов? +" + (total / 100) * 7);
                total = total + ((total / 100) * 7);
            }
            if (total >= plan) {
                System.out.println("На счету : " + total);
                break;
            }
        }
        System.out.println("\nЗадача #5");
        int charge = 20;
        int minute = 0;
        int overheats = 0;
        int endMinute = 0;
        while (charge <= 100) {
            minute = minute + 1;
            if (minute % 10 == 0) {
                overheats++;
                System.out.println("прошло " + minute + " минут, перегрев, заряд: " + charge + "%");
                endMinute = minute;
                minute = minute + 2;
                continue;
            }
            int endCharge = charge;
            charge = charge + 2;
            if (overheats == 3) {
                System.out.println("\n3 перегрева, досрочное завершение зарядки");
                System.out.println("\nВремя зарядаки составило " + endMinute + " минут, на " + endCharge + "%");
                break;
            }
        }
    }
}

