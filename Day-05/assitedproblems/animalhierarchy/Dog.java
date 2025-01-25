package assitedproblems.animalhierarchy;

//Derived class
class Dog extends Animal{
    Dog(String name,int age){
        super(name,age);
    }
    @Override
    public void makeSound(){

        System.out.println("Dog is making Sound");
    }
}