public class Animal {
    private String name;
    private int age, weight;
    Animal(){
        name = "Barsik";
        age = 5;
        weight = 8;
    }
    public void change(String name, int age, int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public void view(){
        System.out.println("Name: " + name);
        System.out.println("\tAge: " + age);
        System.out.println("\tWeight: " + weight);
    }

    public String get_name(){
        return name;
    }
    public int get_age(){
        return age;
    }
    public int get_weight(){
        return weight;
    }
    public void set_name(String n){
        name = n;
    }
    public void set_age(int agge){
        age = agge;
    }
    public void set_weight(int weigh){
        weight = weigh;
    }
}
