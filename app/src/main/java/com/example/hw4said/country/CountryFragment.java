package com.example.hw4said.country;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw4said.R;
import com.example.hw4said.databinding.FragmentContinentBinding;

import java.util.ArrayList;


public class CountryFragment extends Fragment {
private ArrayList<CountryModel>
    countryList=new ArrayList<>();
private Integer position;
private FragmentContinentBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentContinentBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        position = getArguments().getInt("keyForPosition");
        checkPosition(position);
        CountryAdapter countryAdapter = new CountryAdapter(countryList);
        binding.recyclerView.setAdapter(countryAdapter);
    }

    private void checkPosition(Integer position) {
        switch (position) {
            case 0:
                      loadEurasia();
            break;
            case 1:
                loadNorthAmerica();
                break;
            case 2:
                loadSouthAmerica();
                break;
            case 3 :
                loadAfrica();
                break;
            case 4:
                loadAustralia();
                break;
        }
    }
    private void loadAustralia() {
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/fj-1-580x290.png.webp", "Fiji"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/to-1-580x290.png.webp", "Tonga"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/sb-1-580x290.png.webp", "Solomon Islands"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/ws-1-580x290.png.webp", "Samoa"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/nz-1-580x290.png.webp", "New Zealand"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/fm-1-580x305.png.webp", "Federated States of Micronesia"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/vu-1-580x348.png.webp", "Vanuatu"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/au-768x384.png.webp", "Australia"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/pw-1-580x363.png.webp", " Palau"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/nr-1-580x290.png.webp", "Nauru"));
    }

    private void loadAfrica() {
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/ss-1-580x290.png.webp", "South Sudan"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/et-1-580x290.png.webp", "Ethiopia "));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/td-1-580x387.png.webp", "Tchad"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/gq-1-580x387.png.webp", "Guiné Equatorial"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/ug-1-580x387.png.webp", "Uganda"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/tn-1-580x387.png.webp", "Tunisia"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/sd-1-580x290.png.webp", "Sudan"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/rw-1-580x387.png.webp", "Rwanda"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/tg-1-580x358.png.webp", "Togo"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/ng-1-580x290.png.webp", "Nigeria"));
    }

    private void loadSouthAmerica() {
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/cl-1-580x387.png.webp", "Chile"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/ec-1-580x290.png.webp", "Ecuador"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/uy-1-580x387.png.webp", "Uruguay"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/pe-1-580x387.png.webp", "Peru"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/py-1-580x348.png.webp", "Paraguay"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/co-1-580x387.png.webp", "Columbia"));
        countryList.
                add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/br-1-580x406.png.webp", "Brazil"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/ve-1-580x387.png.webp", "Venezuela"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/ar-580x373.png.webp", "Argentina"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/bo-1-580x395.png.webp", "Bolivia"));
    }

    private void loadNorthAmerica() {
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/jm-1-580x290.png.webp", "Jamaica"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/tt-1-580x348.png.webp", "Trinidad and Tobago"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/us-1-580x305.png.webp", "USA"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/lc-1-580x290.png.webp", "Saint Lucia"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/vc-1-580x387.png.webp", "Saint Vincent and Grenadines "));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/kn-1-580x387.png.webp", "Saint Kitts and Nevis"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/ca-1-580x290.png.webp", "Canada"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/cu-2-580x290.png.webp", "Cuba"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/pa-1-580x387.png.webp", "Panama"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/dm-580x290.png.webp", "Dominica"));
    }

    private void loadEurasia() {
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/kg-1-580x348.png.webp", "Kyrgyzstan "));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/jp-1-580x387.png.webp", "Japan"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/south-ossetia-1-580x290.png.webp", "South Ossetia"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/kr-1-580x387.png.webp", "South Korea"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/ee-1-580x369.png.webp", "Estonia"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/fr-580x387.png.webp", "France"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/lk-1-580x290.png.webp", "Sri Lanka"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/ch-1-580x580.png.webp", "Switzerland "));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/tr-1-580x387.png.webp", "Turkey"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/cz-1-580x387.png.webp", "Czechia"));
    }
}
