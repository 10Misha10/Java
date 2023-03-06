import java.util.Scanner;

public class Animal {
    String name;
    double age, weight, height;
    static double age_ = 3, weight_ = 50, height_ = 20;
    Animal(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");
        name = sc.next();
        System.out.println("Age: ");
        age = sc.nextDouble();
        System.out.println("Weight: ");
        weight = sc.nextDouble();
        System.out.println("Height: ");
        height = sc.nextDouble();
    }
    Animal(String name, double age, double weight, double height){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    public void View() {
        System.out.println("Name: " + name);
        System.out.println("\tAge: " + age);
        System.out.println("\tWeight: " + weight);
        System.out.println("\tHeight: " + height);
    }
    public void Check_name(Animal obj1, Animal obj2){
        if(obj1.name.equals(obj2.name)){
            System.out.println("Identical names");
        }
        else{
            System.out.println("Not identical names");
        }
    }
    public void Check_average(){
        System.out.println(name);
        if(age > age_){
            System.out.println("Старше " + age_ + " лет!");
        }
        else{
            System.out.println("Младше " + age_ + " лет!");
        }
        if(weight > weight_){
            System.out.println("Больше " + weight_ + " килограмм!");
        }
        else{
            System.out.println("Меньше " + weight_ + " килограмм!");
        }
        if(height > height_){
            System.out.println("Выше " + height_ + " см!");
        }
        else{
            System.out.println("Ниже " + height_ + " см!");
        }
    }
}