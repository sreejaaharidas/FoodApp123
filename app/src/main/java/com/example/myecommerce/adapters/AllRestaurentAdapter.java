package com.example.myecommerce.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myecommerce.R;
import com.example.myecommerce.models.AllRestaurentModels;
import com.makeramen.roundedimageview.RoundedImageView;

import java.util.List;

public class AllRestaurentAdapter extends RecyclerView.Adapter<AllRestaurentAdapter.ViewHolder> {
    List<AllRestaurentModels> list;

    public AllRestaurentAdapter(List<AllRestaurentModels> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.all_res_item, parent, false));

    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
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
