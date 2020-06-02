public class InnerClassDemo {

    int a=10;
    //nested class
     class Demo1{
        double b=20.5;

        double getValue(){
            return 50.5;
        }
    }
}

class InnerClassDemo1{
    public static  void main(String[] args){
        InnerClassDemo ic=new InnerClassDemo();
        System.out.println("value of a: "+ic.a);

        InnerClassDemo.Demo1 icd1=ic.new Demo1();
        System.out.println("value of b: "+icd1.b);
        System.out.println("Returned value is : "+icd1.getValue());

    }
}