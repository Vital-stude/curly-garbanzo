public class Main {
    public static void main(String[] args) {
        System.out.println( "Условные операторы");

    int clientOs = 1;
    int Ios =0;
    if (clientOs ==1){
        System.out.println("Установите версию приложения для Android по ссылке");
    }
    if (Ios == 0) {
        System.out.println("Установите версию приложения для Ios по ссылке");
    }
        System.out.println(" ");
    }

    public static void task2(){

    int clientOs = 0;
    int clientDeviceYear = 2015;

    if (clientOs == 0);

            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Ios по ссылке");
            } else {
                System.out.println("Установите версию приложения для Ios по ссылке");
            }
           if (clientDeviceYear >= 2015) {
               System.out.println("Установите облегченную версию приложения для Android по ссылке");
           } else {

         System.out.println("Установите версию приложения для Android по ссылке");
     }}

        public static void task3(){
         System.out.print("Задание 3");
         int year = 2021;
         if ((year -1) / 4 ==1 && year % 100 == 0 || year == 0);
            year ++;
     }

         public static void task4(){
             System.out.println("Задание 4");
             int delaveryDistance = 95;

             int delaveryDays = 1;


             if (delaveryDistance > 20);{
                 delaveryDays++;
             }
             if (delaveryDistance > 60) {
                 delaveryDays++;
             }
             System.out.println("Потребуется дней" + delaveryDays);
         }
}



