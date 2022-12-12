package Massives;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void task1() {
        //task 1
        int[] massive = new int[] {1,2,3};
        // or massive[0] = 1;
        // . massive[1] = 2;
        //  massive[2] = 3;
        float[] massiveFloat = {1.57f, 7.654f, 9.986f};
        double[]massiveDouble = new double[]{1D , 23.6D , 78.8990D };
    }
    public static void task2() {
        //task 2
        System.out.println("TASK2");
        int[] massive = new int[] {1, 2,3};
        float[] massiveFloat = {1.57f, 7.654f, 9.986f};
        double[]massiveDouble = new double[]{1D , 23.6D , 78.8990D };
        System.out.println(massive[0] + ", " + massive[1] + ", " + massive[2]);
        System.out.println(massiveFloat[0] + ", " + massiveFloat[1] + ", " + massiveFloat[2]);
        System.out.println(massiveDouble[0] + ", " + massiveDouble[1] + ", " + massiveDouble[2]);
        System.out.println();// space bar
    }

    public static void task3() {
        //task 3
        System.out.println("TASK3");
        int[] massive = new int[] {1, 2,3};
        float[] massiveFloat = {1.57f, 7.654f, 9.986f};
        double[]massiveDouble = new double[]{1D , 23.6D , 78.8990D };
        for (int i = 2; i >= 0; i--) {
            if (i >=1) {
            System.out.print(massive[i] + ", ");
            }else{
                System.out.println(massive[i]);
            }
        }
        for (int i = 2; i >= 0; i--) {
            if (i >=1) {
                System.out.print(massiveFloat[i] + ", ");
            }else{
                System.out.println(massiveFloat[i]);
            }
        }
        for (int i = 2; i >= 0; i--) {
            if (i >=1) {
                System.out.print(massiveDouble[i] + ", ");
            }else{
                System.out.println(massiveDouble[i]);
            }
        }
    }
}