import java.util.Scanner;

public class People {
    String name;
    int age, weight, height;
    People(String inf){
        String[] buff = inf.split("; ");
        name = buff[0];
        age = Integer.parseInt(buff[1]);
        weight = Integer.parseInt(buff[2]);
        height = Integer.parseInt(buff[3]);
    }

    public void compare(String str){
        String[] buff = str.split("; ");
        System.out.println("Name check..." + ((name.equals(buff[0])) ? "True": "False"));
        System.out.println("Age check..." + ((Integer.parseInt(buff[1]) == age) ? "True": "False"));
        System.out.println("Weight check..." + ((Integer.parseInt(buff[2]) == weight) ? "True": "False"));
        System.out.println("Height check..." + ((Integer.parseInt(buff[3]) == height) ? "True": "False"));
    }

    public void view(){
        System.out.println("Name: " + name + "\n\tAge: " + age + "\n\tWeight: " + weight + "\n\tHeight " + height);
    }

    public void new_fields(){
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        age = sc.nextInt();
        weight = sc.nextInt();
        height = sc.nextInt();
    }
}