public class Main {
    public static void main(String[] args) {
        homeWork1();
        homeWork2();
        homeWork3();
        homeWork4();
        homeWork5();
        homeWork6();
    }
    public static void homeWork1(){
        System.out.println("Задача 1");
        int money = 25000;
        double percent = 0.01;
        double bank = 0;
        int year = 0;
        while (bank < 2_459_000){
         bank = (bank + money) * (1 + percent);
        year++;
            System.out.println("Месяц " + year + " ,сумма накоплений равна " + bank + " рублей");
        }


        System.out.println();
    }
    public static void homeWork2(){
        System.out.println("Задача 2");
        int y=0;
        while (y < 10){
           y++;
            System.out.print(" " + y);
        }
        System.out.println();
        for (int i =10; i>0; i--){
            System.out.print(" " +i);
        }

        System.out.println();
    }
    public static void homeWork3(){
        System.out.println("Задача 3");
        int population = 12_000_000;
        double death = (double) 8/1000;
        double birth = (double) 17/1000;
        int years = 0;
        while (years <10){
            population = (int) (population + (population * birth) - (population * death));
            years++;
            System.out.println("Год " + years + " ,численность населения: "+population);
        }

        System.out.println();
    }
    public static void homeWork4(){
        System.out.println("Задача 4");
        double sum = 15000;
        double percent = 0.07;
        double bank = 0;
        int years = 0;
        while (bank < 12_000_000){
            bank = (bank + sum) * (1 + percent);

            years ++;
            System.out.println("Месяц " + years + " ,сумма накоплений равна " + bank + " рублей");
        }
        System.out.println();
    }
    public static void homeWork5 (){
        System.out.println("Задача 5");
        int sum = 15000;
        double percent = 0.07;
        double bank = 0;
        int years = 0;
        while (bank < 12_000_000){
            bank = (bank + sum) * (1 + percent);

            years ++;
            if (years % 6 ==0){
                System.out.println("Месяц " + years + " ,сумма накоплений равна " + bank + " рублей");
            }
        }
        System.out.println();
    }
    public static void homeWork6 (){
        System.out.println("Задача 6");
        int sum = 15000;
        double percent = 0.07;
        double bank = 0;
        int years = 0;
        while (bank < 12_000_000){
            bank = (bank + sum) * (1 + percent);

            years ++;
            if ((years * 12) )
            if ((years % 6 ==0) && (years == 108)){
                System.out.println("Месяц " + years + " ,сумма накоплений равна " + bank + " рублей");
            }
        }
        System.out.println();
    }
}