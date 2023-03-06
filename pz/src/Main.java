import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*int b = 5;
        int c = 4;
        System.out.println(4*(b+c-1)/2);*/
        /*byte b;
        int i = 257;
        double d = 323.142;
        b = (byte)i;
        i = (byte)d;
        b = (byte)d;*/


        /*double n = 3.6;
        System.out.println(Math.round(n));
        int q = 5, w = 8;
        System.out.println((double)q/w);*/
        /*int i = 0;
        while(i <= 10){
            if(i%2==0){
                System.out.println(i + " чет");
            }
            else{
                System.out.println(i + " ночет");
            }
            i++;
        }

///////
        int n = 2;
        int k = 0;
        do{
            System.out.print(n + " ");
            n *= 2;
            k++;
        }while (k < 10);*/

        /*int sum = 0;
        for(int j = -20; j <= 20; j++){
            if(j%2 == 0){sum++;}
        }
        System.out.println();
        System.out.println("Сумма четных " + sum);


        Scanner sc = new Scanner(System.in);
        String n1 = sc.nextLine();
        /*while(!(sc.hasNextInt())){
            System.out.println("Некорректный ввод!");
            sc.next();
        }
        n1 = sc.nextInt();*/
        /*switch (n1) {
            case "1":
                System.out.println("Январь - холодно");
                break;
            case "2":
                System.out.println("Февраль - холодно");
                break;
            case "3":
                    System.out.println("Март - холодно");
                break;
            case "4":
                System.out.println("Аппрель - тепло");
                break;
            case "5":
                System.out.println("Май - тепло");
                break;
            case "6":
                System.out.println("Июнь - тепло");
                break;
            case "7":
                System.out.println("Июль - холодно");
                break;
            case "8":
                System.out.println("Февраль - холодно");
                break;
            case "9":
                System.out.println("Март - холодно");
            case "10":
                System.out.println("Январь - холодно");
                break;
            case "11":
                System.out.println("Февраль - холодно");
                break;
            case "12":
                System.out.println("Март - холодно");
                break;
            default:
                break;
        }*/
        /*Scanner sc = new Scanner(System.in);
        while(!(sc.hasNextInt())){
            System.out.println("Некорректный ввод!");
            sc.next();
        }
        int n1 = sc.nextInt();
        System.out.println(String.valueOf(n1).length());*/
        /*while(!(sc.hasNextInt())){
            System.out.println("Некорректный ввод!");
            sc.next();
        }
        n1 = sc.nextInt();
        System.out.println();*/
        /*int n = (int)(Math.random()*6)-3;
        System.out.println(n);

        int b = 100, a = 9;
        System.out.println((int)(Math.random()*b)+a);*/
        /*int arr[] = new int[15], j = 0;
        for(int i = 0; i < 15; i++){
                arr[j] = (int)Math.random()*10;
                System.out.print(arr[j] + " ");
                j++;
        }
        System.out.println();
        for(int k = arr.length; k < 0; k--){
            System.out.print(arr[k] + " ");
        }*/
        /*int n = 7, m = 4;
        int arr[][] = new int[n][m];
        int max = -16;
        int index = 0;
        int sum = 1;

        for(int i = 0; i < n; i++){
            for(int k = 0; k < m; k++){
                arr[i][k] = (int)(Math.random()*10)-5;
            }
        }
        for(int i = 0; i < n; i++){
            for(int k = 0; k < m; k++){
                System.out.print(arr[i][k] + " ");
            }
            System.out.println();
        }
        for(int i = 0; i < n; i++){
            for(int k = 0; k < m; k++){
                sum *= arr[i][k];
            }
            if( max < sum){
                max = sum;
                index = i;
            }
        }
        System.out.println();
        System.out.println(max + " " + index);*/

    }
}