package Test;

import movie.movie;
import movie.movieItem;

public class movieTest{

    public static void main(String[]args){
        movie myMovie=new movie();

        movieItem item1=new movieItem("All american","Ben White");
        movieItem item2=new movieItem("Jumanji","Luiz Diaz");
        movieItem item3=new movieItem("Elite","Mo Salah");

        myMovie.addmovieItem(item1);
        myMovie.addmovieItem(item2);
        myMovie.addmovieItem(item3);

        myMovie.printmovieDetails();
    }
}
