package jurgen.example.moviecatalogue2.ViewModel;

import org.junit.Before;
import org.junit.Test;

import jurgen.example.moviecatalogue2.Model.TvShowModel;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

public class TvShowViewModelTest {

    TvShowModel tvShowModel;
    TvShowViewModel tvShowViewModel;

    @Test
    public void getArrayData() {
        tvShowModel = new TvShowModel();
        tvShowViewModel = new TvShowViewModel(tvShowModel);

        assertNotNull(tvShowViewModel.getArrayData());
        assertEquals(10, tvShowViewModel.getArrayData().size());
    }

    @Before
    public void before() {
        tvShowModel = mock(TvShowModel.class);
        tvShowViewModel = new TvShowViewModel(tvShowModel);
    }
}