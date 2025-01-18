public class Book {
    private  String title;
    private  String author;
    private   int price;
    //Default Constructor
    Book(){
        System.out.println("Deafault Constructor Called");
    }
    //Parameterized Constructor
    Book(String title,String author,int price){
        System.out.println("Parameterized Constructor Called");
        this.title=title;
        this.author=author;
        this.price=price;
    }

    public static void main(String[] args) {
        Book Math=new Book();
        Book English=new Book("Grammar","Furqan",1000);


    }


}
