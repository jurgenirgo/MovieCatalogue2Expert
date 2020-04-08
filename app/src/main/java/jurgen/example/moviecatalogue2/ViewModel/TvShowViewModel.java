package jurgen.example.moviecatalogue2.ViewModel;

import java.util.ArrayList;

import jurgen.example.moviecatalogue2.Model.ItemModel;
import jurgen.example.moviecatalogue2.Model.TvShowModel;

public class TvShowViewModel {
    private TvShowModel tvShowModel;

    public TvShowViewModel(TvShowModel tvShowModel) {
        this.tvShowModel = tvShowModel;
    }

    public ArrayList<ItemModel> getArrayData() {
        return tvShowModel.getMovieData();
    }
}
