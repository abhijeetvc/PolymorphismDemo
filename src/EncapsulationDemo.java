public class EncapsulationDemo {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class EncapDemo{
    public static void main(String[] args){
        EncapsulationDemo ed=new EncapsulationDemo();
        ed.setName("Abc");
        ed.setAge(25);
        System.out.println("Name is : "+ed.getName());
        System.out.println("Age is : "+ed.getAge());
        EncapsulationDemo ed1=new EncapsulationDemo();
        ed1.setName("Abcd");
        ed1.setAge(30);
        String name1=ed1.getName();
        System.out.println("Name is : "+name1);
        System.out.println("Age is : "+ed1.getAge());
    }
}
