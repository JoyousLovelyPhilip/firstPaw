import java.util.Scanner;
import java.util.ArrayList;
class Movie {
    String title;
    int year;

    Movie(String title, int year) {
        this.title = title;
        this.year = year;
    }

    void display() {
        System.out.println("Movie: " + title);
        System.out.println("Year: " + year);
        System.out.println();
    }
}

public class Practise {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Movie> movies = new ArrayList<>();

        System.out.print("How many Movies? ");
        int n = sc.nextInt();
        sc.nextLine(); // important

        for (int i = 0; i < n; i++) {

            System.out.print("Enter movie title: ");
            String title = sc.nextLine();

            System.out.print("Enter release year: ");
            int year = sc.nextInt();
            sc.nextLine();

            Movie movie = new Movie(title, year);
            movies.add(movie);
        }

        System.out.println("\n--- Movie Collection ---");

        for (Movie m : movies) {
            m.display();
        }
    }
}