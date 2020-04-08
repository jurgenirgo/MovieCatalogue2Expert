package jurgen.example.moviecatalogue2.ViewModel;

import org.junit.Before;
import org.junit.Test;

import jurgen.example.moviecatalogue2.Model.MovieModel;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

public class MovieViewModelTest {

    private MovieModel movieModel;
    private MovieViewModel movieViewModel;

    @Test
    public void getArrayData() {
        movieModel = new MovieModel();
        movieViewModel = new MovieViewModel(movieModel);

        assertNotNull(movieViewModel.getArrayData());
        assertEquals(10, movieViewModel.getArrayData().size());
    }

    @Before
    public void before() {
        movieModel = mock(MovieModel.class);
        movieViewModel = new MovieViewModel(movieModel);
    }
}