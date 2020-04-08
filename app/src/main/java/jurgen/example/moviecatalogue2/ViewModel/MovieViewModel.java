package jurgen.example.moviecatalogue2.ViewModel;

import java.util.ArrayList;

import jurgen.example.moviecatalogue2.Model.ItemModel;
import jurgen.example.moviecatalogue2.Model.MovieModel;

public class MovieViewModel {
    private MovieModel movieModel;

    public MovieViewModel(MovieModel movieModel) {
        this.movieModel = movieModel;
    }

    public ArrayList<ItemModel> getArrayData() {
        return movieModel.getMovieData();
    }
}