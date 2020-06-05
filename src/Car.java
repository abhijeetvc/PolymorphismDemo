public class Car {   //Outer Class

    String carName;
    String carType;

    public Car(String carName, String carType) {
        this.carName = carName;
        this.carType = carType;
    }

    private String getCarName(){
        return this.carName;
    }

    class Engine{  //Inner Class
        String engineType;

        void setEngine(){

            if(Car.this.carType.equals("4WD")){
                if(Car.this.getCarName().equals("BMW")){
                    this.engineType="Bigger";
                }
                else{
                    this.engineType="Smaller";
                }
            }
            else{
                this.engineType="Common";
            }
        }
        String getEngineType(){
            return this.engineType;
        }
    }
}

class Check{
    public static void main(String[] args){
        Car c=new Car("BMW","4WD");

        Car.Engine engine=c.new Engine();
        engine.setEngine();

        System.out.println("Engine type of 2WD : "+engine.getEngineType());
    }
}