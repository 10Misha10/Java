public enum Color {
    RED(1), ORANGE(2), YELLOW(3), GREEN(4), BLUE(5), PURPLE(6), BLACK(7), WHITE(8);
    int number;
    Color(int i){
        number = i;
    }
    public void view(){
        for(Color x : Color.values()){
            System.out.println(x);
        }
    }
    public void chose(int i){
        for(Color x : Color.values()){
            if(x.number == i){
                System.out.println(x);
            }
        }
    }
}
