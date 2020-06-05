public class StaticInnerClass {

    static class Demo{
        int a=20;
        int b=30;

        int getTotal(){
            return a+b;
        }
    }
}
class CheckMain{

    public static void main(String[] args){
      //  StaticInnerClass sic=new StaticInnerClass();
        StaticInnerClass.Demo demo=new StaticInnerClass.Demo();
        System.out.println("Total is : "+demo.getTotal());
    }
}