public class Warehouse {
    double prise;
    int amount;
    Warehouse(){
        amount = 8;
        prise = 9.6;
    }
    Warehouse(int amount_, double price_){
        amount = amount_;
        prise = price_;
    }

    public void change_am(int amount_){
        amount = amount_;
    }
    public void change_pr(double price_){
        prise = price_;
    }
    public void calculate(){
        System.out.println(amount*prise);
    }
    public void new_amount(Warehouse...v){
        int res = 0;
        for(Warehouse x : v){
            res += x.amount;
        }
        System.out.println("Общее количество " + res);
    }
}