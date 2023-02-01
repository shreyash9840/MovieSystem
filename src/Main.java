import java.util.ArrayList;

class MainCategory {
    String mainCategory;

    MainCategory(String mainCategory) {
        this.mainCategory = mainCategory;
    }
}

class Category extends MainCategory {
    String genre;

    Category(String mainCategory, String genre) {
        super(mainCategory);
        this.genre = genre;
    }
}

class Movie extends Category {
    String name;
    String director;
    String showTime;
    int price;

    Movie(String mainCategory, String genre, String name, String director, String showTime, int price) {
        super(mainCategory, genre);
        this.name = name;
        this.director = director;
        this.showTime = showTime;
        this.price = price;
    }

    void getInfo() {
        System.out.println("Main Category: " + mainCategory);
        System.out.println("Category: " + genre);
        System.out.println("Movie: " + name);
        System.out.println("Director: " + director);
        System.out.println("Show Time: " + showTime);
        System.out.println("Price: " + price);
    }

    static void getMovies(ArrayList<Movie> movies, String showTime) {
        for (Movie movie : movies) {
            if (movie.showTime.equals(showTime)) {
                movie.getInfo();
                System.out.println();
            }
        }
    }
}

class User {
    String name;
    String email;

    User(String name, String email) {
        this.name = name;
        this.email = email;
    }
}

class Seat {
    int seatNumber;
    MainCategory mainCategory;

    Seat(int seatNumber, MainCategory mainCategory) {
        this.seatNumber = seatNumber;
        this.mainCategory = mainCategory;
    }
}

class Ticket {
    ArrayList<Seat> seats;
    ArrayList<User> users;
    ArrayList<Movie> movies;

    Ticket(ArrayList<Seat> seats, ArrayList<User> users, ArrayList<Movie> movies) {
        this.seats = seats;
        this.users = users;
        this.movies = movies;
    }

    void getSeats() {
        for (Seat seat : seats) {
            System.out.println("Seat Number: " + seat.seatNumber);
            System.out.println("Main Category: " + seat.mainCategory.mainCategory);
            System.out.println();
        }
    }

    void getUsers() {
        for (User user : users) {
            System.out.println("Name: " + user.name);
            System.out.println("Email: " + user.email);
            System.out.println();
        }
    }
}

/*
class Main {
    public static void main(String[] args) {
        MainCategory sofa = new MainCategory("Sofa");
        MainCategory seat = new MainCategory("Seat");
        Category action = new Category("Seat", "Action");
        Category comedy = new
*/

public class Main {
    public static void main(String[] args) {
        MainCategory sofa = new MainCategory("Sofa");
        MainCategory seat = new MainCategory("Seat");

        Category action = new Category("Seat", "Action");
        Category drama = new Category("Sofa", "Drama");

        ArrayList<Movie> movies = new ArrayList<Movie>();
        movies.add(new Movie("Seat", "Sci-Fi", "Jurassic Park", "Steven Spielberg", "2 PM", 450));
        movies.add(new Movie("Seat", "Action", "Iron Man", "Ram hari", "5 PM", 500));
        movies.add(new Movie("Sofa", "War", "Schindler's List", "Steven Spielberg", "8 PM", 200));

        ArrayList<Seat> seats = new ArrayList<Seat>();
        seats.add(new Seat(1, seat));
        seats.add(new Seat(2, seat));
        seats.add(new Seat(3, sofa));

        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("Abc Def", "AbcDef@email.com"));
        users.add(new User("QweRty", "QweRty@email.com"));

        Ticket ticket = new Ticket(seats, users, movies);

        ticket.getSeats();
        System.out.println();
        ticket.getUsers();
        System.out.println();
        Movie.getMovies(movies, "2 PM");
    }
}



