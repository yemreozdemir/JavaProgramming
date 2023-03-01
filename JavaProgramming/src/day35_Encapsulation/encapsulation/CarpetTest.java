package day35_Encapsulation.encapsulation;

public class CarpetTest {

    public static void main(String[] args) {

        Carpet carpet=new Carpet(4,5,8,true);

        System.out.println(carpet);

        carpet.setPersian(true);
        carpet.setUnitPrice(7);
        carpet.setWidth(2);
        carpet.setLength(4);

        System.out.println(carpet);
    }
}
