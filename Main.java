import java.util.Scanner;

public class Main{
    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Locality city = new City("Emir");
        city.setSupervisor("Emir");

        search();

    }
    public static void search(){
        String a = sc.nextLine();
        if(a.equals(city.getSupervisor)){
            System.out.println("Info about city or village");
        }

    }
}

