public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        short mounth = 0;
        short deposit = 15_000;
        int accumulation = 0;
        while (accumulation < 2_459_000) {
            accumulation += deposit;
            mounth++;
            System.out.println("Месяц " + mounth + ", сумма накоплений равна " + accumulation + " рублей");
        }

    }

    public static void task2() {
        System.out.println("Задача 2");
        byte i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (i = 10; i > 0; i--)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        byte Year = 0;
        byte natality = 17;
        byte mortality = 8;
        int natalitYear = population / 1000 * natality;
        int mortalityYear = population / 1000 * mortality;
        do {
            population += natalitYear - mortalityYear;
            Year++;
            System.out.println("Год " + Year + " , численность населения составляет " + population);
        } while (Year < 10);
    }

    public static void task4() {
        System.out.println("Задача 4");
        int cashOut = 12_000_000;
        float persent = 0.07f;
        short deposit = 15_000;
        short month = 0;
        int accumulation = 0;
        accumulation += deposit + deposit * persent;
        do {
            accumulation += accumulation * persent;
            month++;
            System.out.println("Месяц" + month + " , сумма " + accumulation);
        } while (accumulation < cashOut);
    }

    public static void task5() {
        System.out.println("Задача 5");
        int cashOut = 12_000_000;
        float persent = 0.07f;
        short deposit = 15_000;
        short month = 0;
        int accumulation = 0;
        accumulation += deposit + deposit * persent;
        do {
            accumulation += accumulation * persent;
            month++;
            if (month % 6 == 0)
                System.out.println("Месяц" + month + " , сумма " + accumulation);
        } while (accumulation < cashOut);
    }

    public static void task6() {
        System.out.println("Задача 6");
        int year = 12 * 9;
        float persent = 0.07f;
        short deposit = 15_000;
        short month = 0;
        int accumulation = 0;
        accumulation += deposit + deposit * persent;
        do {
            accumulation += accumulation * persent;
            month++;
            if (month % 6 == 0)
                System.out.println("Месяц" + month + " , сумма " + accumulation);
        } while (month <= year);
    }

    public static void task7() {
        System.out.println("Задача 7");
        short month = 31;
        short day = 4;
        do {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
            day += 7;
        }while (day < month );
    }
    public static void task8() {
        System.out.println("Задача 8");
        int startYear = 2000;
        int earlierYear = startYear - 200;
        int  laterYear =startYear + 100;
        byte cycle = 79;
       do{
           if (startYear % cycle ==0)
               System.out.println(startYear);
           startYear--;

       } while (startYear>earlierYear);
       startYear=2000;
        do{
            if (startYear % cycle ==0)
                System.out.println(startYear);
            startYear++;
        } while (startYear<laterYear);

    }
}