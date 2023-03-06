public class Test {
    int a;
    public int b;
    private int c;

    public void setS(int i){
        c = i;
    }
    public int getC(){
        return c;
    }
    public static void main(String[] args) {
        Test ob = new Test();
        ob.a = 10;
        ob.b = 20;
        ob.c = 100;
        ob.setS(100);
        System.out.println("a, b, c:" + ob.a + ob.b + ob.getC());
    }
}