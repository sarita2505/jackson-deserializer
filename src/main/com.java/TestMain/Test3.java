package TestMain;

public  class Test3 {
    public int i=90;
    private int j;

    public static void main(String[] args) {

    }
    public  static void  m1(){
        System.out.println("parent");
    }
    public void m2(){
        System.out.println("parent m2");
    }
    public void m3(){
        System.out.println(super.hashCode());
        this.j=20;
        System.out.println(this.j);

    }
}
class Test4 extends Test3{
    public int i=100;
    private int j;
    public static void main(String[] args) {
        System.out.println("inside the child");
        Test3 test4=new Test4();
        System.out.println("object created");
        test4.m1();
        System.out.println(test4.i);
        test4.m3();
    }
    public static void m1(){
        System.out.println("child");
    }
    public void m3(){
        this.j=40;
        System.out.println(this.j);
    }
}
