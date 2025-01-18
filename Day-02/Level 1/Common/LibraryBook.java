public class LibraryBook {
    private  String title;
    private  String  author;
    private  int price;
    private  boolean availability;
    LibraryBook(String title,String author,int price,Boolean availability){
        this.title=title;
        this.author=author;
        this.price=price;
        this.availability=availability;
    }
    public void borrow(){
        if(availability){
            availability=false;
            System.out.println("Book issued");
        }else{
            System.out.println("Book Not available");
        }
    }

    public static void main(String[] args) {
        LibraryBook MathBook=new LibraryBook("Root","Furqan",1000,true);
        //Issued
        MathBook.borrow();
        //Not available--> Trying to borrow a book again
        MathBook.borrow();

    }
}
