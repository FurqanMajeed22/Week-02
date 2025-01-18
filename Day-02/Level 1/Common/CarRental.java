public class CarRental {
    private String  customerName;
    private String carModel;
    private  int rentalDays;
    public static  int costperday=50; //Assumed value
    //Default Constructor
    CarRental(){
        this.customerName="";
        this.carModel="";
        this.rentalDays=0;
    }
    //parameterized Constructor
    CarRental(String customerName,String carModel,int rentalDays){
        this.customerName=customerName;
        this.carModel=carModel;
        this.rentalDays=rentalDays;
    }
    //Method to calculate total rent
    public void totalcost(){
        System.out.println("Total rent of "+this.customerName +" "+ this.rentalDays*costperday);
    }
    public static void main(String[] args) {
        CarRental car1=new CarRental("Furqan","A1",8);
        car1.totalcost();

    }
}
