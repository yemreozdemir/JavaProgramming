package day31_Constructors.Restaurant_Task;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    public String owner,location;
    public int numberOfstars;
    public ArrayList<Server> servers;
    public ArrayList<Chef> chefs;

    public Restaurant(String owner, String location, int numberOfstars) {
        this.owner = owner;
        this.location = location;
        this.numberOfstars = numberOfstars;
        servers = new ArrayList<>();
        chefs = new ArrayList<>();
    }


    public void hireServer(Server server){
        servers.add(server);
    }

    public void hireServers(Server[] servers){
        this.servers.addAll(Arrays.asList(servers));
    }

    public void  hireChef(Chef chef){
        chefs.add(chef);
    }

    public void hireChefs(Chef[] chefs){
        this.chefs.addAll(Arrays.asList(chefs));
    }

    public void terminateChef(int employeeID){
        chefs.removeIf(p-> p.employeeID==employeeID);
    }

    public void terminateServer(int employeeID){
        servers.removeIf(p-> p.employeeID==employeeID);
    }

    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfstars=" + numberOfstars +
                ", numberOfservers=" + servers.size() +
                ", numberOfchefs=" + chefs.size() +
                '}';
    }
}
