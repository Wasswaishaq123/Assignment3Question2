package movie;

import java.util.ArrayList;
import java.util.List;

public class movie {
    private List<movieItem>movieItems= new ArrayList<movieItem>();

    public void addmovieItem(movieItem movieitem){
        movieItems.add(movieitem);
    }
    public List<movieItem>getMovieItems(){
        return movieItems;
    }
    public void printmovieDetails(){
        for(movieItem movieItemitem: movieItems){
            System.out.println(movieItem);
        }
    }
}
