package assitedproblems.animalhierarchy;
//Base Class
class Animal{
    public String name;
    public  int age;
    Animal(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void makeSound(){
        System.out.println("Animal is Making sound");
    };
}