package Main;

public class Main {
    public static void main(String[] args) {
        Sorting sorting = new Sorting();
        try {
            sorting.Sort();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}