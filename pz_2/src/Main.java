import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /******************Task_1*******************/
        /*while(!(sc.hasNextInt())){
            System.out.println("Некорректный ввод!");
            sc.nextLine();
        }
        Srudent Ivanov = new Srudent(sc.nextInt(), sc.next());
        while(!(sc.hasNextInt())){
            System.out.println("Некорректный ввод!");
            sc.nextLine();
        }
        Srudent petrov = new Srudent(sc.nextInt(), sc.next());
        Ivanov.View();
        petrov.View();
        /*************************************************/

        /******************Task_2*******************/
        /*while(!(sc.hasNextInt())){
            System.out.println("Некорректный ввод!");
            sc.nextLine();
        }
        Srudent Ivanov = new Srudent(sc.nextInt(), sc.next());
        Srudent petrov = Ivanov;*/
        //Ivanov = null;
        //Ivanov.View();
        //petrov.View();
        //while(!(sc.hasNextInt())){
           // System.out.println("Некорректный ввод!");
            //sc.nextLine();
        //}
        //vanov.numberCource = sc.nextInt();
        //Ivanov.nameStudent = sc.next();
        //Ivanov.View();
        //petrov.View();
        /******************Task_4 and in class*************///System.out.println("Average mark: " + petrov.Average_mark());
        /*************************************************/

        /***************Task_3 in class*******************/

        /*******************Task_5 and in class***************************/
        /*Srudent st = new Srudent(1, "d");
        double arr[] = new double[5];
        double sum = 0;
        for(int i = 0; i < arr.length; i++){
            while(!(sc.hasNextDouble())){
                 System.out.println("Некорректный ввод!");
                 sc.nextLine();
            }
            arr[i] = sc.nextDouble();
        }
        System.out.println("Average mark: " + st.Average_mark_arr(arr));*/
        /**************************************************/


        /*******************Task_11***************************/
        /*Animal an1 = new Animal();
        Animal an2 = new Animal();
        Animal an3 = new Animal();

        an1.Check_name(an2, an3);

        an1.Check_average();
        an2.Check_average();
        an3.Check_average();*/
        /**************************************************/

        /*******************Task_12***************************/
        /*Matrics mat1 = new Matrics(5);
        Matrics mat2 = new Matrics(5, 5);
        Matrics mat3 = new Matrics(5, 5);
        mat1.View();
        System.out.println();
        mat2.View();
        System.out.println();
        mat3.View();*/

        /**Sum**/
        /*System.out.println();
        int c[][] = mat1.Add(mat2.arr, mat3.arr, 5);
        for (int i = 0; i < 5; i++) {
            for (int k = 0; k < 5; k++) {
                System.out.print(c[i][k] + " ");
            }
            System.out.println();
        }*/
        /**Minus**/
        /*System.out.println();
        int b[][] = mat1.Minus(mat2.arr, mat3.arr, 5);
        for (int i = 0; i < 5; i++) {
            for (int k = 0; k < 5; k++) {
                System.out.print(b[i][k] + " ");
            }
            System.out.println();
        }*/
        /**Multiplication**/
        /*System.out.println();
        int a[][] = mat1.multiplyMatrices(mat1.arr, mat2.arr);
        for (int i = 0; i < a.length; i++) {
            for (int k = 0; (a[i] != null && k < a[i].length); k++) {
                System.out.print(a[i][k] + " ");
            }
            System.out.println();
        }*/
        /**************************************************/

        /****************Task_13*****************/
        /*int arr[] = new int[5];
        for(int i = 0; i< 5; i++){
            arr[i] = (int) (Math.random() * 11)+1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Matrics mat1 = new Matrics(1);
        mat1.Variable_4(arr);*/
        /***************************************************/

        /***********************Task_14********************/
        /*String_arr str = new String_arr();
        str.view();*/

        //str.view_lenght_of_elements();

        //str.view_from_to(2, 3);

        //str.view_str_with_max_number();

        /*str.delete_uppercase(3);
        str.view();*/

        /*str.delete_all_without_numbers_symbols(0);
        str.view();*/


        /*str.count_words(str.arr);//сортировка строк массива по количеству слов в строке
        str.view();*/

        /*str.view_i_only_numbers(3);*/ //вывод из i-ой строки всех слов, содержащих только цифры;


        /*str.count_of_numbers(2);*///вывод из i-ой строки всех слов, содержащих только цифры

        /*System.out.println();
        str.view_i_only_symbols();*///вывод из массива всех слов, содержащих только прописные буквы


        /*str.view_all_numbers();*///вывод всех чисел из строк


        /*str.delete_between_symbols("=", 2);*///удаление из строки части, заключенной между двумя символами, которые вводятся (например, между скобками или между звездочками и т.п.);


        /*People people = new People("Kirill; 19; 55; 181");
        people.view();
        people.compare("jfvjfnj; 159; 55; 181");
        people.new_fields();
        people.view();*///2-е задание




        /************************Last_Task*****************/
        Color c;
        c = Color.BLUE;
        c.view();
        c.chose(sc.nextInt());
        /**************************************************/

        Test ob = new Test();
        ob.a = 10;
        ob.b = 20;
        //ob.c = 100;
        ob.setS(100);
        System.out.println("a, b, c:" + ob.a + ob.b + ob.getC());
    }
}