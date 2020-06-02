//2 types of polymorphism : a) Run-time   ) Compile-time

//Run-time polymorphism
public abstract class Animal {

       abstract void run();
}

class Dog extends Animal{

    @Override
    void run() {
        System.out.println("Dog runs fast");
    }
}

class Elephant extends Animal{

    @Override
    void run() {
        System.out.println("Elephant runs slowly");
    }
}

class MainAnimal{

    public static  void main(String[] args){
        Dog d=new Dog();
        d.run();

        Elephant e=new Elephant();
        e.run();
    }
}