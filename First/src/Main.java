import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        /**************----------------FIRST-------------------*********/
        /*Scanner sc = new Scanner(System.in);
        int n;
        while(!(sc.hasNextInt())){
            System.out.println("Некорректный ввод!");
            sc.nextLine();
        }
        n = sc.nextInt();
        for(int i = 0; i < 4; i++){
            System.out.println(Math.pow(n, i));
        }*/
        /*********----------------------------------------**************/

        /*************---------------SECOND-------------------************/
        /*Scanner sc = new Scanner(System.in);
        int password = 5656;
        int n = 0;
        System.out.println("Input the password:");
        while(true){
            String inputString = sc.nextLine();
            try{
                n = Integer.valueOf(inputString);
            }catch (Exception e){
                //ignore
            }
            if(n != password){
                System.out.println("Wrong password!\nTry again!");
            }
            else{
                break;
            }
        }
        System.out.println("Good job!");*/
        /**************---------------------------------------**********/

        /*************---------------THIRD-------------------************/
        /*Scanner sc = new Scanner(System.in);
        int res = 0;
        for(int i = 1; i <= 9999;i++){
            res += i;
        }
        System.out.println(res);*/
        /**************---------------------------------------**********/

        /*************---------------FOURTH-------------------************/
        /*Scanner sc = new Scanner(System.in);
        int n = (int)(Math.random()*11)+1;
        System.out.println("Try to guess:");

        while(!(sc.hasNextInt())){
            System.out.println("Некорректный ввод!");
            sc.next();
        }
        int password = sc.nextInt();
        while(password != n){
            if(password > n){
                System.out.println("Less...");
            }
            else{
                System.out.println("More...");
            }
            while(!(sc.hasNextInt())){
                System.out.println("Некорректный ввод!");
                sc.next();
            }
            password = sc.nextInt();
        }
        System.out.println("Good job!");
        System.out.println(n);*/
        /**************---------------------------------------**********/

        /*************---------------FIFTH-------------------************/
        /*
        for(int i = 1000; i <= 9999;i += 3){
            System.out.print(i + " ");
        }*/
        /**************---------------------------------------**********/

        /*************---------------SIXTH-------------------************/
        /*int f = 1;
        int res = 2;
        System.out.println(f);
        System.out.println(f);
        for(int i = 1; i <= 9;i++){
            System.out.println(res);
            res += f;
            f = res - f;
        }*/
        /**************---------------------------------------**********/

        /*************---------------SEVENTH-------------------************/
        /*int res = 0;
        int num1, num2, num3, num4, num5, num6;
        for(int i = 1001; i <= 999999;i++){
            num1 = i/100000;
            num2 = (i/10000)%10;
            num3 = (i/1000)%10;
            num4 = (i/100)%10;
            num5 = (i/10)%10;
            num6 = i%10;
            if(num1 + num2 + num3 == num4 + num5 + num6){
                res++;
            }
        }
        System.out.println(res);*/
        /**************---------------------------------------**********/

        /*************---------------NINTH-------------------************/
        /*int n = (int)(Math.random()*155)+5;
        System.out.println("25 < n < 100 ? ");
        if(n > 25 && n <100){
            System.out.println("Truth!");
        }
        else{
            System.out.println("False");
        }
        System.out.println("n = " + n);*/
        /**************---------------------------------------**********/

        /*************---------------TENTH-------------------************/
        /*int n = (int)(Math.random()*28800);
        System.out.println("n = " + n);
        if(n < 1){
            System.out.println("Осталось менее часа.");
        }
        else{
            System.out.println("Остался(ось) " + Math.round(n/3600) + " час(а).");
        }*/
        /**************---------------------------------------**********/

        /*************---------------ELEVENTH-------------------************/
        /*int arr[] = new int[12];
        int max = -16;
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random()*30)-15;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
            if(arr[i] >= max){
                max = arr[i];
                index = i;
            }
        }
        System.out.println();
        System.out.println("Максимальное число: " + max);
        System.out.println("Индекс последнего входа: " + index);*/
        /**************---------------------------------------**********/

        /***********--------------TWELFTH------------------*************/
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Input n > 3:");
        int n = 0;
        while(true){
            String inputString = sc.nextLine();
            try{
                n = Integer.valueOf(inputString);
            }catch (Exception e){
                //ignore
            }
            if(n < 3){
                System.out.println("Wrong input!\nTry again!");
            }
            else{
                break;
            }
        }
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random()*n);
        }
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
            if(arr[i] % 2 == 0){
                count++;
            }
        }
        System.out.println();
        if(count > 0){
            int arr_2[] = new int[count];
            int k = 0;
            for(int i = 0; i < arr.length; i++){
                if(arr[i] % 2 == 0){
                    arr_2[k] = arr[i];
                    System.out.print(arr_2[k] + " ");
                    k++;
                }
            }
        }*/
        /***********-------------------------------------**************/

        /*************---------------THIRTEENTH-------------------************/
        /*int arr[] = new int[15];
        int a = 0, b = 0, k = 0, i = 0;
        while(arr[14] == 0) {
            a = (int) (Math.random() * 8) + 2;
            b = (int) (Math.random() * 8) + 2;
            for (int j = 0; j <= i; j++) {
                if ((a * b != arr[j]) && (arr[j] != 0)) {
                } else {
                    if(a * b != arr[j]) {
                        System.out.println(a + " * " + b);
                    }
                    arr[j] = a * b;
                    break;
                }
            }
            if(i <= 15){i++;}
        }*/
        /**************---------------------------------------**********/

        /*************---------------FOURTEENTH-------------------************/
        /*Scanner sc = new Scanner(System.in);
        int n = 0, m = 0;
        n = sc.nextInt();
        m = sc.nextInt();
        int arr[][] = new int[n][m];
        int max = -16;
        int index = 0;
        for(int i = 0; i < n; i++){
            for(int k = 0; k < m; k++){
                arr[i][k] = (int)(Math.random()*30)-15;
            }
        }
        for(int i = 0; i < n; i++){
            for(int k = 0; k < m; k++){
                System.out.print(arr[i][k] + " ");
            }
            System.out.println();
        }
        int indexMaxElem, indexMinElem, maxElem, minElem, tmpElem;
        for (int i = 0; i < n; i++)
        {
            indexMaxElem = 0;
            maxElem = arr[i][indexMaxElem];

            indexMinElem = m-1;
            minElem = arr[i][indexMinElem];

            for (int j = 0; j < m; j++)
            {
                if (arr[i][j] <= minElem)
                {
                    indexMinElem = j;
                    minElem = arr[i][indexMinElem];
                }

                if (arr[i][j] >= maxElem)
                {
                    indexMaxElem = j;
                    maxElem = arr[i][indexMaxElem];
                }
            }

            tmpElem = arr[i][0];
            arr[i][0] = arr[i][indexMaxElem];
            arr[i][indexMaxElem] = tmpElem;

            tmpElem = arr[i][m - 1];
            arr[i][m - 1] = arr[i][indexMinElem];
            arr[i][indexMinElem] = tmpElem;

        }

        System.out.println("\nОбработанный массив");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
                System.out.print(arr[i][j] + "\t");
            System.out.println();
        }*/

        /**************---------------------------------------**********/
    }
}