package Model;

import java.util.ArrayList;
import java.util.Iterator;

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
            System.out.println("Main Category: " + this.mainCategory);
            System.out.println("Category: " + this.genre);
            System.out.println("Movie: " + this.name);
            System.out.println("Director: " + this.director);
            System.out.println("Show Time: " + this.showTime);
            System.out.println("Price: " + this.price);
        }

        static void getMovies(ArrayList<Movie> movies, String showTime) {
            Iterator var2 = movies.iterator();

            while(var2.hasNext()) {
                Movie movie = (Movie)var2.next();
                if (movie.showTime.equals(showTime)) {
                    movie.getInfo();
                    System.out.println();
                }
            }

        }
    }


