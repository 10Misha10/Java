public class Cat extends Animal{
    int amount_of_mice;
    Cat(){
        set_age(5);
        set_name("Barsik");
        set_weight(10);
        amount_of_mice = 9;
    }
    public void change_amount(int amount){
        amount_of_mice = amount;
    }
    public void view_all(){
        System.out.println("Name: " + get_name());
        System.out.println("\tAge: " + get_age());
        System.out.println("\tWeight: " + get_weight());
        System.out.println("\tAmount of mice: " + amount_of_mice);
    }
}
