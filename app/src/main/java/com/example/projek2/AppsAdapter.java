package com.example.projek2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class AppsAdapter extends RecyclerView.Adapter<AppsAdapter.ViewHolder> {

    private Context context;
    private ArrayList<AppsModel> appsModels;

    public ArrayList<AppsModel> getAppsModels() {
        return appsModels;
    }

    public void setAppsModels(ArrayList<AppsModel> appsModels) {
        this.appsModels = appsModels;
    }

    public AppsAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public AppsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_apps,parent,false);
        return new ViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull AppsAdapter.ViewHolder holder, int position) {
        Glide.with(context).load(getAppsModels().get(position).getGambar()).into(holder.gambar);
        holder.judul.setText(getAppsModels().get(position).getJudul());
        holder.share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "This is " + getAppsModels().get(position).getJudul() +" Apps, where you want to send ?");
                sendIntent.setType("text/plain");

                Intent shareIntent = Intent.createChooser(sendIntent, null);
                context.startActivity(shareIntent);
            }
        });
        holder.lihat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, AppsDetail.class);
                intent.putExtra("logo_apps", getAppsModels().get(position).getGambar());
                intent.putExtra("judul_apps", getAppsModels().get(position).getJudul());
                intent.putExtra("desc_apps", getAppsModels().get(position).getDesc());

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return getAppsModels().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView gambar;
        private TextView judul;
        private Button share, lihat;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            gambar = itemView.findViewById(R.id.iv_template);
            judul = itemView.findViewById(R.id.tv_template);
            share = itemView.findViewById(R.id.btn_template1);
            lihat = itemView.findViewById(R.id.btn_template2);
        }
    }
}
