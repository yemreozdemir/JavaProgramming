package day33_Statics;

public class Iphone_Test {

    public static void main(String[] args) {


        IphoneTask phone =new IphoneTask("iphone13",40000,"white","5.6 inches");

        System.out.println(phone);

        phone.faceTime(123456789);
        phone.faceTime("y.emreozdemir88@gmail.com");
        phone.call(123456789);
        phone.text(123456789);
    }
}
