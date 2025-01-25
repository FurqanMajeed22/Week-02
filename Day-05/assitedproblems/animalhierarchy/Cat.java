package assitedproblems.animalhierarchy;

//Derived Class
class Cat extends Animal{
    Cat(String name,int age){
        super(name,age);
    }
    @Override
    public void makeSound(){

        System.out.println("Cat is making Sound");
    }
}