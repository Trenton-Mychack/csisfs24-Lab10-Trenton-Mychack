


public class Main {
    public static void main(String[] args) {
        Day d1, d2;
        int d3;
        d1 = Day.SUNDAY; // Corrected assignment with enum type qualifier
        // d2 = "MONDAY"; // Error: This line will not compile
        d2 = Day.MONDAY; // Corrected assignment with enum type qualifier
        d3 = d1.ordinal(); // Converting enum to int using ordinal()
        
        System.out.println("d1: " + d1);
        System.out.println("d2: " + d2);
        System.out.println("d3: " + d3);
    }
    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY 
    }
}



