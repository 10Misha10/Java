import java.util.Scanner;

public class Srudent {
    public int numberCource;
    public String nameStudent;

    /***********Task_7************//*Srudent(int cour, String name){
        numberCource = cour;
        nameStudent = name;
    }*/
    /**************Task_8***********/
    Srudent(int numberCource, String nameStudent){
        this.numberCource = numberCource;
        this.nameStudent = nameStudent;
    }
    /*******************************/
    /************Task_3*************/
    public void View(){
        System.out.println("Student name: " + nameStudent + "\n\tStudent course: " + numberCource);
    }
    /*****************************/

    /***************Task_4******/
    public double Average_mark(){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        double sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(sc.hasNextInt()){
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            else{
                System.out.println("ошибка");
            }


        }
        return sum/5;
    }
    /***************************/
    /***************Task_5******/
    public double Average_mark_arr(double[] arr){
        double sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum/arr.length;
    }
    /***************************/

    /*******************Task_6***************************/
    Srudent(){
        nameStudent = "Jorj";
        numberCource = 3;
    }
    /**************************************************/

    /*******************Task_9***************************/
    public void square(double i){
        System.out.println("Площадь квадрата: " + i*i);
    }
    public void square(int i){
        System.out.println("Площадь круга: " + 2*i*Math.PI);
    }
    public void square(double i, double j){
        System.out.println("Площадь прямоугольника: " + i*j);
    }
    /**************************************************/

    /*******************Task_10 КОПИЯ ОБЪЕКТА***************************/
    Srudent(Srudent obj){
        nameStudent = obj.nameStudent;
        numberCource = obj.numberCource;
    }
    /**************************************************/

}
