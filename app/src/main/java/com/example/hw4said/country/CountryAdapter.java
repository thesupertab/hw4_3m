package com.example.hw4said.country;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.hw4said.R;

import java.util.ArrayList;

public class CountryAdapter extends RecyclerView.Adapter <CountryAdapter.CountryViewHolder>{
    private ArrayList <CountryModel> countryList;

    public CountryAdapter(ArrayList<CountryModel> countryList) {
        this.countryList = countryList;
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CountryViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_country,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
holder.bind(countryList.get(position));
    }

    @Override
    public int getItemCount() {
        return countryList.size();

    }
    class CountryViewHolder extends RecyclerView.ViewHolder{
        private ImageView imgCountry;
        private TextView tvCountry;

        public CountryViewHolder(@NonNull View itemView) {
            super(itemView);
            this.imgCountry = imgCountry;
            this.tvCountry = tvCountry;
        }
        public void bind(CountryModel countryModel){
            tvCountry.setText(countryModel.getName());
            Glide.with(imgCountry).load(countryModel.getFlag()).into(imgCountry);
        }
    }
}
