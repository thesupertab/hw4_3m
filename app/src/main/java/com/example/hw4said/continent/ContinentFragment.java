package com.example.hw4said.continent;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw4said.OnClick;
import com.example.hw4said.R;
import com.example.hw4said.country.CountryFragment;
import com.example.hw4said.databinding.FragmentContinentBinding;

import java.util.ArrayList;

public class ContinentFragment extends Fragment implements OnClick{
    private FragmentContinentBinding binding;
private ArrayList<ContinentModel> continentList=new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_continent, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        initAdapter();
    }

    private void initAdapter() {
        ContinentAdapter continentAdapter = new ContinentAdapter(continentList,this);
                binding.recyclerView.setAdapter(continentAdapter);
    }

    private void loadData() {
        continentList.add(new ContinentModel("https://w7.pngwing.com/pngs/565/967/png-transparent-afro-eurasia-map-asia-blue-cloud-world-thumbnail.png","Eurasia"));
        continentList.add(new ContinentModel("https://www.kindpng.com/picc/m/456-4560181_north-america-north-america-map-vector-png-transparent.png","North America"));
        continentList.add(new ContinentModel("https://toppng.com/uploads/preview/vaping-laws-in-south-america-map-of-peru-in-south-america-11569055337vp0pzzpeow.png","South America"));
        continentList.add(new ContinentModel("https://www.iapb.org/wp-content/uploads/2020/09/IAPB-regions-Africa.png","Africa"));
        continentList.add(new ContinentModel("https://freepngimg.com/thumb/map/24277-8-australia-map-transparent-background.png","Australia"));
    }

    @Override
    public void onClick(int position) {
        Bundle bundle = new Bundle();
        bundle.putInt("keyForPosition",position);
        CountryFragment countryFragment = new CountryFragment();
        countryFragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,countryFragment).addToBackStack(null).commit();
    }
}