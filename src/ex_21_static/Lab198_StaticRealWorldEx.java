package ex_21_static;

public class Lab198_StaticRealWorldEx {
    public static void main(String[] args) {
     new ATB1();
        System.out.println("-------");
     ATB1 a1=new ATB1();
     a1.setName("Deeksha");
     System.out.println(a1.getName());
     a1.setPhone("32897428734");
     System.out.println(a1.getPhone());
     a1.readDocuments();
     ATB1.doAssignment();
     System.out.println(ATB1.courseName);

    }
}
class ATB1{

    {
        System.out.println("IIB - this is called when Object is created!");
        // What is the purpose? -
        // Here you can write code related to
        // start a website or anything before starting the
        // web automation or api automation
        //
    }

    static {
        System.out.println("Load the class?, I will execute");
    }

    private String name; // non static
    private String phone;
    static String courseName = "ATB10x";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    void readDocuments(){
        System.out.println("Non Static Method");
        System.out.println(courseName);
    }

    static void doAssignment(){
        //System.out.println(phone); // Staic method can't access the non static variables
        System.out.println("Do Assignment");
    }


}
