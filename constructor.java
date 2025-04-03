package constructor;

public class constructor {
    String name;int age;
    constructor(){
        System.out.println("constructor is called");
    }
    constructor(String n,int a){
        name=n;
        age=a;
    }
    void display(){
        System.out.println("Nmae is "+name);
        System.out.println("Age is "+age);
    }
    public static void main(String[]args){
        constructor obj1=new constructor("Sushma",20);
        obj1.display();

    }}
