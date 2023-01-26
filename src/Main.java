public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();


    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] first = {1, 2, 3};
        System.out.println(first[0] + "," + first[1] + "," + first[2]);
        double[] first1 = {1.57, 7.654, 9.986};
        System.out.println(first1[0] + "," + first1[1] + "," + first1[2]);
        String[] summer = {"June", "July", "August"};
        System.out.println(summer[0] + "," + summer[1] + "," + summer[2]);
        System.out.println(" ");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] first = {10, 20, 30};
        for (int i = 0; i < first.length - 1; i++)
            System.out.print(first[i] + ",");
        System.out.print(first[first.length-1]);
        System.out.println();

        double[] first1 = {1.57, 7.654, 9.986};
        for (int i = 0; i < first1.length - 1; i++)
               System.out.print(first1[i] + ",");
        System.out.print(first1[first1.length-1]);
        System.out.println();

        String[] summer = {"June", "July", "August"};
        for (int i = 0; i < summer.length-1; i++)
            System.out.print(summer[i]+ ",");
        System.out.println(summer[summer.length-1]);
        System.out.println(" ");

    }
    public static void task3() {
        System.out.println("Задача 3");
        int[] first = {10, 20, 30};
        for (int i = first.length-1;i>=0 ;i--)
            System.out.print(first[i] + ",");
        System.out.println();

        double[] first1 = {1.57, 7.654, 9.986};
        for (int i = first1.length-1; i>=0; i--)
            System.out.print(first1[i] + ",");
        System.out.println();

       String[] summer = {"June", "July", "August"};
        for (int i = summer.length-1;i>=0; i--)
            System.out.print(summer[i]+ ",");
        System.out.println(" ");
    }
    public static void task4() {
        System.out.println("Задача 4");
        int[] first = {1, 2, 3};
        for (int i = 0; i < first.length; i++){
            if (first[i]%2 !=0)
                first[i]++;
            System.out.println(first[i]);}

    }
    }