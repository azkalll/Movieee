package com.example.movieee;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;
import java.util.Locale;

import javax.xml.transform.Result;

public class TopMovielistAdapter extends RecyclerView.Adapter<TopMovielistAdapter.MyViewHolder> {

    private Context mContext;
    private List<Result> mList;

    public TopMovielistAdapter(Context mContext, List<Result> mList) {
        this.mContext = mContext;
        this.mList = mList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(mContext).inflate(R.layout.movie_single_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.MVtitle.setText(mList.get(position).getTitle());
        holder.MVrating.setText(String.format(Locale.getDefault(), "%.1f", mList.get(position).getVoteAverage()));
        holder.MVrelasedate.setText(mList.get(position).getReleaseDate());
        Glide.with(mContext).load("https://image.tmdb.org/t/p/w500" + mList.get(position).getPosterPath()).into(holder.MVposter);

    }

    @Override
    public int getItemCount() {

        if (this.mList != null) {
            return mList.size();
        } else {
            return 0;
        }
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView MVposter;
        TextView MVtitle, MVrelasedate, MVrating;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            MVposter = itemView.findViewById(R.id.movie_poster);
            MVtitle = itemView.findViewById(R.id.MVtittle);
            MVrelasedate = itemView.findViewById(R.id.MVrelease);
            MVrating = itemView.findViewById(R.id.MVrating);

        }
    }
}
