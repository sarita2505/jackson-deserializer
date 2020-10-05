package TestMain;

public class Test2 {
    private int i;
    public Test2() {
        this.i=10;
        Test2 test2=this;
       this.i=i+1;
        System.out.println(this.i);
        System.out.println(test2.i);

    }

    public static void main(String[] args) {
        m1(null);
        Test2 test2=new Test2();
    }
    public static void m1(String name){
        System.out.println("String class"+name);
    }
    public static void m1(Object name){
        System.out.println("object class"+name);
    }
}
