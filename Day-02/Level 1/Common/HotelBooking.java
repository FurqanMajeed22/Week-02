public class HotelBooking {
    private String  guestName;
    private  String roomType;
    private  int nights;
    //Default Constructor
    HotelBooking(){
        this.guestName="Unknown";
        this.roomType="Deluxe";
        this.nights=1;
    }
    //Parameterized Constructor
    HotelBooking(String name,String roomType,int nights){
        this.guestName=name;
        this.roomType=roomType;
        this.nights=nights;
    }
    //Copy Constructor
    HotelBooking(HotelBooking Person){
        this.guestName=Person.guestName;
        this.roomType= Person.roomType;
        this.nights= Person.nights;
    }
    public static void main(String[] args) {
        HotelBooking Person1=new HotelBooking();
        System.out.println("Printing Person1 details");
        System.out.println(Person1.guestName);
        System.out.println(Person1.roomType);
        System.out.println(Person1.nights);
        HotelBooking Person2=new HotelBooking("Furqan","Ac",3);
        System.out.println("Printing Person2 details");
        System.out.println(Person2.guestName);
        System.out.println(Person2.roomType);
        System.out.println(Person2.nights);
        HotelBooking Person3=new HotelBooking(Person2);
        System.out.println("Printing Person3 details");
        System.out.println(Person3.guestName);
        System.out.println(Person3.roomType);
        System.out.println(Person3.nights);



    }
}
