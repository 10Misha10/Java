import java.awt.desktop.SystemSleepEvent;

import java.util.Scanner;
public class String_arr {
    String arr[] = new String[5];
    String_arr(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextLine();
        }
    }
    public void check_words_and_sort(String arr[]){

    }
    public void view(){
        for(String x : arr){
            System.out.println(x);
        }
    }
    public void view_lenght_of_elements(){
        for(String x : arr){
            System.out.print(x.length() + " ");
        }
        System.out.println();
    }
    public void view_from_to(int i, int j){
        if(i < arr.length) {
            for (; i < j; i++) {

                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        else{
            System.out.println("Начальная точка слишком большая!");
        }
    }
    public void view_str_with_max_number(){
        int index = 0, buffer = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length(); j++) {
                if (Character.isDigit(arr[i].charAt(j))) {
                    if(Character.digit(arr[i].charAt(j), 10) > buffer){
                        buffer = Character.digit(arr[i].charAt(j), 10);
                        index = i;
                    }
                }
            }
        }
        System.out.println("Максимальное число " + buffer + " В строке " + (index + 1));
    }
    public void delete_uppercase(int i){
        arr[i] = arr[i].replaceAll("[A-Z]", "");
    }
    public void delete_all_without_numbers_symbols(int i){
        arr[i] = arr[i].replaceAll("[^A-Za-zA-Яа-я0-9]", "");
    }
    public void count_words(String arr[]){
        int count = 1;
        int j = 0;
        int int_arr[] = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            if(arr[i].length() > 0) {
                for (j = 0; j < arr[i].length(); j++) {
                    if (arr[i].charAt(j) == ' ' && (j > 0 && arr[i].charAt(j - 1) != ' ')) {
                        count++;
                    }
                }
                if (arr[i].charAt(j - 1) == ' ') {
                    count--;
                }
                int_arr[i] = count;
                System.out.print(count + " ");
                count = 1;
            }
            else{
                System.out.print(0 + " ");
            }
        }
        System.out.println();
        String temp;
        int int_temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int k = 0; k < arr.length - i - 1; k++) {
                if (int_arr[k] > int_arr[k + 1]) {
                    temp = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k + 1] = temp;
                    int_temp = int_arr[k];
                    int_arr[k] = int_arr[k + 1];
                    int_arr[k + 1] = int_temp;
                }
            }
        }
    }

    public void view_i_only_numbers(int i){
        int count = 0;
        int temp = 0;
        for(int j = 0; j < arr[i].length(); j++){
            if ((arr[i].charAt(j) == ' ' && (j > 0 && arr[i].charAt(j - 1) != ' '))) {
                if(count == j - temp){
                    for(; temp < j; temp ++){
                        System.out.print(arr[i].charAt(temp));
                    }
                    System.out.print(" ");
                }
                if(j == arr[i].length()){
                    for(; temp <= j; temp ++){
                        System.out.print(arr[i].charAt(temp));
                    }
                }

                count = 0;
                temp = j + 1;
            }
            else if(arr[i].charAt(j) <= '9' && arr[i].charAt(j) >= '0'){
                count++;
                if(j == arr[i].length()-1){
                    for(; temp <= j; temp ++){
                        System.out.print(arr[i].charAt(temp));
                    }
                }
            }
            else{}
        }
    }

    public void count_of_numbers(int i){
        int sum = 0;
        for(int j = 0; j < arr[i].length(); j++){
            if(arr[i].charAt(j) <= '9' && arr[i].charAt(j) >= '0'){
                sum += Character.digit(arr[i].charAt(j), 10);
            }
        }
        System.out.println("Sum: " + sum);
    }

    public void view_i_only_symbols(){
        int count = 0;
        int temp = 0;
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                if ((arr[i].charAt(j) == ' ' && (j > 0 && arr[i].charAt(j - 1) != ' '))) {
                    if (count == j - temp) {
                        for (; temp < j; temp++) {
                            System.out.print(arr[i].charAt(temp));
                        }
                        System.out.print(" ");
                    }
                    if (j == arr[i].length()) {
                        for (; temp <= j; temp++) {
                            System.out.print(arr[i].charAt(temp));
                        }
                    }

                    count = 0;
                    temp = j + 1;
                } else if (arr[i].charAt(j) >= 'a' && arr[i].charAt(j) <= 'z') {
                    count++;
                    if (j == arr[i].length() - 1 && count == j - temp + 1) {
                        for (; temp <= j; temp++) {
                            System.out.print(arr[i].charAt(temp));
                        }
                        System.out.print(" ");
                    }
                } else {
                }
            }
            count = 0;
            temp = 0;
        }
    }

    public void view_all_numbers(){
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) >= '0' && arr[i].charAt(j) <= '9') {
                    System.out.print(arr[i].charAt(j) + " ");
                }
            }
            System.out.println();
        }
    }

    public void delete_between_symbols(String symbol, int i){
        //String s = "Впрочем, английский текст !комментария! составлен правильно.";
        String[] buff = arr[i].split(symbol);
        String result = buff[0] + buff[2];
        System.out.println(result);
    }

}