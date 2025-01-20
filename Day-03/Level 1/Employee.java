public class Employee {
    private  static String CompanyName ="";
    private  static int  totalEmployees=0;
    private String name;
    private final int id;
     private String designation;
    public  Employee(String name,int id,String designation){
        this.name=name;
        this.id=id;
        this.designation=designation;
        totalEmployees++;
    }
    public  static void displayTotalEmployees(){
        System.out.println("TotalEmployees "+ totalEmployees);
    }
    public void displayBookDetails( Object obj){
          if(obj instanceof  Employee){
              System.out.println("CompanyName :"+ CompanyName);
              System.out.println("Name: "+((Employee) obj).name);
              System.out.println("Id: "+ ((Employee) obj).id);
              System.out.println("designation "+ ((Employee) obj).designation);

        }else{
              System.out.println("Invalid Employee");
          }

    }
    public  static  void setCompanyName(String name){
       CompanyName=name;

    }

    public static void main(String[] args) {
        Employee.setCompanyName("Capgemini");
        Employee Sde1=new Employee("Furqan",1234,"Software Developer");
        Employee Sde2=new Employee("Anubhav",5647,"ASE");
        Sde1.displayBookDetails(Sde1);
        Sde2.displayBookDetails(Sde2);
        System.out.println(Employee.totalEmployees);


    }
}
