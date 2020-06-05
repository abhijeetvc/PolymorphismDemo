
//Anonymous class can be defined inside class
public class AnonymousClassDemo { //class that doesn't have any name

    public void getData(){
        System.out.println("In AnonymousClassDemo");
    }
}

interface MyDemo1{
    void check1();

}

interface MyDemo2{
    void check2();
}
class Demo1 implements MyDemo2{

    public void check(){

        //Anonymous Inner Class
        AnonymousClassDemo acd= new AnonymousClassDemo(){
            public void getData(){
                System.out.println("In Demo1 class");
            }
        };

        acd.getData();

        MyDemo1 m1=new MyDemo1() {
            @Override
            public void check1() {
                System.out.println("In My Demo1");
            }
        };
        m1.check1();
    }

    @Override
    public void check2() {
        System.out.println("Inside myDemo2");
    }
}

class MainClass{
    public static void main(String[] args){
        AnonymousClassDemo a=new AnonymousClassDemo();
        a.getData();

        Demo1 d=new Demo1();
        d.check();
        d.check2();

    }
}