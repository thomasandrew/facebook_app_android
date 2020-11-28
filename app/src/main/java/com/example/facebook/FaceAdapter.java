package com.example.facebook;

import android.content.Context;
import android.media.FaceDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;

import java.util.ArrayList;

public class FaceAdapter extends RecyclerView.Adapter<FaceAdapter.ViewHolder>{

    private ArrayList<Face_> face_;
    private Context context;
    private RequestManager glide;
    private boolean isPressed;

    public FaceAdapter(Context context, ArrayList<Face_> face_) {
        this.context = context;
        this.face_ = face_;
        glide = Glide.with(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.face_feed, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        final Face_ face = face_.get(position);

        holder.profName.setText(face.getProfName());
        holder.hour.setText(face.getHours());
        holder.profTxt.setText(face.getProfTxt());
        holder.comments.setText(String.valueOf(face.getComments()));

        glide.load(face.getProfPic()).into(holder.profPic);

        if (face.getPostPic() == 0) {
            holder.postPic.setVisibility(View.GONE);
        } else {
            holder.postPic.setVisibility(View.VISIBLE);
            glide.load(face.getPostPic()).into(holder.postPic);
        }

        holder.like_change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isPressed = !isPressed;
                if (isPressed) {
                    v.setBackgroundResource(R.drawable.like_red);
                    holder.liked.setText(String.valueOf(face.getLiked() + 1));
                } else {
                    v.setBackgroundResource(R.drawable.like);
                    holder.liked.setText(String.valueOf(face.getLiked()));
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return face_.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView profName, hour, profTxt, liked, comments;
        private ImageView postPic, profPic;
        private ImageButton like_change;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            profName = itemView.findViewById(R.id.profName);
            hour = itemView.findViewById(R.id.hour);
            profTxt = itemView.findViewById(R.id.profTxt);
            liked = itemView.findViewById(R.id.liked);
            comments = itemView.findViewById(R.id.comments);
            postPic = itemView.findViewById(R.id.postPic);
            profPic = itemView.findViewById(R.id.profPic);
            like_change = itemView.findViewById(R.id.like_change);
        }
    }
}
