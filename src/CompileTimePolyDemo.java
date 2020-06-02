
//Compile time polymorphism
public class CompileTimePolyDemo {
    int a=10,b=20;

//    public CompileTimePolyDemo(int a,int b){
//        this.a=a;
//        this.b=b;
//    }
    void addNumbers(){
        int c=a+b;
        System.out.println("Addition 1 :"+c);
    }
    //method overloading
    void addNumbers(int a,int b){
        int c1=a+b;
        System.out.println("Addition 2 : "+c1);
    }

    public static void main(String[] args){
        CompileTimePolyDemo c=new CompileTimePolyDemo();
        c.addNumbers();
        c.addNumbers(30,40);
    }
}
