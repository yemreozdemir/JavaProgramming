package day36_Inheritance.cryptoToken;

public class MyWallet {

    public static void main(String[] args) {


        Doge doge=new Doge();
        doge.setInfo(3,1200,123456789,123400014,false);


        System.out.println(doge);
    }
}
