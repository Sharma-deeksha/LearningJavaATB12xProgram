package ex_18_Constructors;

public class Car2 {
    String model;
    int year;
    String name;
    Car2(){
        System.out.println("Car 2 Default constructor");
        model= "XXX";
        year  = 1900;
    }
    Car2(String name,String model){
        System.out.println(name + model);
        this.model=model;
        this.name=name;
    }
    Car2(String name,String model,int year){

        this("Maruti","800");
        System.out.println(name+model+year);
        this.name=name;
        this.model=model;
        this.year=year;
    }
}
