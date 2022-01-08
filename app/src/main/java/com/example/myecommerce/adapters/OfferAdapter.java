package com.example.myecommerce.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myecommerce.R;
import com.example.myecommerce.RestaurentActivity;
import com.example.myecommerce.models.OffersModels;
import com.makeramen.roundedimageview.RoundedImageView;

import java.util.List;

public class OfferAdapter extends RecyclerView.Adapter<OfferAdapter.ViewHolder> {

    List<OffersModels> list;
    Context ctx;

    public OfferAdapter(List<OffersModels> list, Context ctx) {
        this.list = list;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.offer_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.roundedImageView.setImageResource(list.get(position).getImg());
holder.itemView.setOnClickListener(v -> {
    Intent i = new Intent(ctx, RestaurentActivity.class);
    ctx.startActivity(i);
});
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        RoundedImageView roundedImageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            roundedImageView = itemView.findViewById(R.id.img);
        }
    }
}
