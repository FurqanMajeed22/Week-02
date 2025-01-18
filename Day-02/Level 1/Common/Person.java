public class Person {
    private  String name;
    private  int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("Parametrized Constructor  Called");

    }
    //Copy Constructor
    Person(Person source){
        this.name=source.name;
        this.age=source.age;
        System.out.println("copy Constrcutor Called");
    }
    public static void main(String[] args) {
      Person person1 =new Person("Furqan",23);
      Person person2=new Person((person1));

    }

}
