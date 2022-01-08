package com.example.myecommerce.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myecommerce.R;
import com.example.myecommerce.models.ExcluiveModels;
import com.makeramen.roundedimageview.RoundedImageView;

import java.util.List;

public class Exclusive extends RecyclerView.Adapter<Exclusive.ViewHolder> {
    List<ExcluiveModels> list;

    public Exclusive(List<ExcluiveModels> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public Exclusive.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Exclusive.ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.exclusives_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull Exclusive.ViewHolder holder, int position) {
        holder.roundedImageView.setImageResource(list.get(position).getImg());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        RoundedImageView roundedImageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            roundedImageView = itemView.findViewById(R.id.roundedImageView);
        }
    }
}
