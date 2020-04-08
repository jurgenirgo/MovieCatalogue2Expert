package jurgen.example.moviecatalogue2.fragment;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import jurgen.example.moviecatalogue2.DetailActivity;
import jurgen.example.moviecatalogue2.Model.ItemModel;
import jurgen.example.moviecatalogue2.Model.TvShowModel;
import jurgen.example.moviecatalogue2.R;
import jurgen.example.moviecatalogue2.ViewModel.TvShowViewModel;
import jurgen.example.moviecatalogue2.adapter.Adapter;

public class TvShowFragment extends Fragment {

    TvShowViewModel tvShowViewModel;
    RecyclerView recyclerView;
    private ArrayList<ItemModel> arrayList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_movie, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tvShowViewModel = new TvShowViewModel(new TvShowModel());
        arrayList = tvShowViewModel.getArrayData();
        Adapter adapter = new Adapter(getActivity(), arrayList);

        recyclerView = view.findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);

        adapter.setOnItemClickListener(new Adapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                ItemModel item = arrayList.get(position);

                startActivity(
                        new Intent(getActivity(), DetailActivity.class)
                                .putExtra("DATA_", item)
                );
            }
        });
    }
}
