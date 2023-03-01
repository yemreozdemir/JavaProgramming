package day31_Constructors.Restaurant_Task;

import java.util.ArrayList;

public class LocalRestaurant {

    public static void main(String[] args) {

        Server[] servers={
                new Server("Kaan",25,20,true),
                new Server("Cem" ,26,17,true),
                new Server("Emre",27,14,false),
                new Server("Tapir",28, 10, false),
                new Server("Zihni", 29, 20, true),
                new Server("Yunuz", 30, 23, true),


        };

        Chef[] chefs={

                new Chef("Ebubekir", 23, 35, true),
                new Chef("Sıddığ", 22, 26, false),
                new Chef("Şükrüye", 21, 27, true),


        };

        Restaurant restaurant=new Restaurant("9İsmail","Oltu",3);
        restaurant.hireChefs(chefs);
        restaurant.hireServers(servers);

        System.out.println(restaurant);
    }
}
