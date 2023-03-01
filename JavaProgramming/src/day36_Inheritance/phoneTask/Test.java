package day36_Inheritance.phoneTask;

public class Test {

    public static void main(String[] args) {


        Iphone iphone=new Iphone();
        iphone.setInfo("iphone","12","5.6","white",1000);

        Samsung samsung=new Samsung();
        samsung.setInfo("samsung","S19","6","white",900);

        Nokia nokia=new Nokia();
        nokia.setInfo("nokia","n70","5","grey",100);

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);
    }
}
