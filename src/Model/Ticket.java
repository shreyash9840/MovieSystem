package Model;

import java.util.ArrayList;
import java.util.Iterator;

public class Ticket {
        ArrayList<Seat> seats;
        ArrayList<User> users;
        ArrayList<Movie> movies;

        Ticket(ArrayList<Seat> seats, ArrayList<User> users, ArrayList<Movie> movies) {
            this.seats = seats;
            this.users = users;
            this.movies = movies;
        }

        void getSeats() {
            Iterator var1 = this.seats.iterator();

            while(var1.hasNext()) {
                Seat seat = (Seat)var1.next();
                System.out.println("Seat Number: " + seat.seatNumber);
                System.out.println("Main Category: " + seat.mainCategory);
                System.out.println();
            }

        }

        void getUsers() {
            Iterator var1 = this.users.iterator();

            while(var1.hasNext()) {
                User user = (User)var1.next();
                System.out.println("Name: " + user.name);
                System.out.println("Email: " + user.email);
                System.out.println();
            }

        }
    }


