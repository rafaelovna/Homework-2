public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int apple = 1002320008;
        System.out.println("Значение переменной apple с типом int равно "+apple);
        byte finance = 98;
        System.out.println("Значение переменной finance с типом byte равно "+finance);
        short cat = 11231;
        System.out.println("Значение переменной cat с типом short равно "+cat);
        long people = 325489756;
        System.out.println("Значение переменной people с типом long равно "+people);
        float seed = 3.1222222f;
        System.out.println("Значение переменной seed с типом float равно "+seed);
        double weight = 7.2222222222;
        System.out.println("Значение переменной weight с типом double равно "+weight);

        System.out.println("Задание 2");
        float a = 27.12f;
        System.out.println("Значение переменной a с типом float равно "+a);
        long t = 987678965549L;
        System.out.println("Значение переменной t с типом long равно "+t);
        double g = 2;
        System.out.println("Значение переменной g с типом double равно "+g);
        short r = 786;
        System.out.println("Значение переменной r с типом short равно "+r);
        boolean f = false ;
        System.out.println("Значение переменной f с типом boolean равно "+f);
        char h = 569;
        System.out.println("Значение переменной h с типом char равно "+h);
        short b = -159;
        System.out.println("Значение переменной b с типом short равно "+b);
        int l = 27897;
        System.out.println("Значение переменной l с типом int равно "+l);
        byte n = 67;
        System.out.println("Значение переменной n с типом byte равно "+n);

        System.out.println("Задание 3");
        byte teacherOne = 23;
        byte teacherTwo = 27;
        byte teacherThree = 30;
        short totalPaper = 480;
        int children = teacherOne + teacherTwo + teacherThree;
        int oneChild = totalPaper / children;
        System.out.println("На каждого ученика расчитано " +oneChild+ " листов бумаги!");

        System.out.println("Задание 4");
        int twoMin = 16;
        int oneMin = twoMin / 2;
        int twentyMin = oneMin * 20;
        System.out.println("За 20 минут машина произвела бутылок "+twentyMin+" штук!");
        int day = oneMin * 1440;
        System.out.println("За сутки машина произвела бутылок "+day+" штук!");
        int threeDays = day * 3;
        System.out.println("За 3 дня машина произвела бутылок "+threeDays+" штук!");
        int oneMonth = day * 30;
        System.out.println("За месяц машина произвела бутылок "+oneMonth+" штук!");

        System.out.println("Задание 5");
        int totalPaints = 120;
        byte oneRoomWhite = 2;
        byte oneRoomBrown = 4;
        int oneRoom = oneRoomWhite + oneRoomBrown;
        int totalRoom = totalPaints / oneRoom;
        int whitePaints = oneRoomWhite * totalRoom;
        int brownPaints = oneRoomBrown * totalRoom;
        System.out.println("В школе где "+totalRoom+ " классов, нужно "+whitePaints+" банок белой краски и "+brownPaints+" банок коричневой краски.");

        System.out.println("Задание 6");
        int bananas = 5 * 80;
        int milk = 2 * 105;
        int iceCream = 2 * 100;
        int rawEgg = 4 * 70;
        int blenderMix = bananas+ milk + iceCream + rawEgg;
        float mixGram = blenderMix / 1000f;
        System.out.println("Вес спорт-завтрака " + blenderMix+ " грамм, или "+mixGram+" килограмм!");

        System.out.println("Задание 7");
        byte loseWeightKg = 7;
        int ifPerDay = 250;
        int ifPerDayTwo = 500;
        int loseWeightGr = loseWeightKg * 1000;
        int daysIfPerDay = loseWeightGr / ifPerDay;
        int daysIfPerDayTwo = loseWeightGr / ifPerDayTwo;
        System.out.println(daysIfPerDay+" дней уйдет на похудение, если спортсмен будет терять каждый день "+ifPerDay+" грамм.");
        System.out.println(daysIfPerDayTwo+" дней уйдет на похудение, если спортсмен будет терять каждый день "+ifPerDayTwo+" грамм.");



        System.out.println("Задание 8");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int upgradeSalaryMasha = (salaryMasha * 10)/100 +salaryMasha;
        int upgradeSalaryDenis = (salaryDenis * 10)/100+salaryDenis;
        int upgradeSalaryKristina = (salaryKristina*10)/100+salaryKristina;
        System.out.println("Зарплата Маши после повышения "+upgradeSalaryMasha+" рублей.");
        System.out.println("Зарплата Дениса после повышения "+upgradeSalaryDenis+" рублей.");
        System.out.println("Зарплата Кристины после повышения "+upgradeSalaryDenis+" рублей.");
        int annualEarningsMashaNow = salaryMasha * 12;
        int annualEarningsDenisNow = salaryDenis * 12;
        int annualEarningsKristinaNow = salaryKristina * 12;
        System.out.println("Годовой доход Маши перед повышением зарплаты составлял "+annualEarningsMashaNow+" рублей.");
        System.out.println("Годовой доход Дениса перед повышением зарплаты составлял "+annualEarningsDenisNow+" рублей.");
        System.out.println("Годовой доход Кристины перед повышением зарплаты составлял "+annualEarningsKristinaNow+" рублей.");
        int salaryAfterPromotionMasha = upgradeSalaryMasha*12;
        int salaryAfterPromotionDenis = upgradeSalaryDenis*12;
        int salaryAfterPromotionKristina = upgradeSalaryKristina*12;
        System.out.println("Годовой доход Маши после повышения зарплаты составил "+salaryAfterPromotionMasha+ " рублей.");
        System.out.println("Годовой доход Дениса после повышения зарплаты составил "+salaryAfterPromotionDenis+" рублей.");
        System.out.println("Годовой доход Кристины после повышения зарплаты составил "+salaryAfterPromotionKristina+" рублей.");
        int profitMasha = salaryAfterPromotionMasha-annualEarningsMashaNow;
        int profitDenis = salaryAfterPromotionDenis - annualEarningsDenisNow;
        int profitKristina = salaryAfterPromotionKristina - annualEarningsKristinaNow;
        System.out.println("Маша теперь получает "+upgradeSalaryMasha+" рублей. Годовой доход вырос на "+profitMasha+" рублей!");
        System.out.println("Денис теперь получает "+upgradeSalaryDenis+" рублей. Годовой доход вырос на "+profitDenis+" рублей!");
        System.out.println("Кристина теперь получает "+upgradeSalaryKristina+" рублей. Годовой доход вырос на "+profitKristina+" рублей!");



    }
}