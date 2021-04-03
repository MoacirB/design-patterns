package compareDucks;

import java.util.Arrays;

public class DuckSortTestDrive {
    public static void main(String[] args){
        Duck[] ducks = {
            new Duck("Daffy", 8),
            new Duck("Dewey", 2),
            new Duck("Howard", 7),
            new Duck("Louis", 2),
            new Duck("Donald", 10),
            new Duck("Huey", 2)
        };

        System.out.println("Before sorting");
        display(ducks);

        Arrays.sort(ducks);
        System.out.println("\n After sorting");
        display(ducks);
    }

    public static void display(Duck[] ducks){
        for(int I = 0; I<ducks.length; I++){
            System.out.println(ducks[I]);
        }
    }
    
}
