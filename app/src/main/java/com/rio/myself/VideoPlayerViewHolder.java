/*
 *     Tanggal Pengerjaan : 8/6/2024
 *     Nim : 10121050
 *     Nama : Rio Christian Cesar Sihombing
 *     email :riosihombing047@gmail.com
 *     Copyright © 2024 Rio Sihombing. All rights reserved.
 */
package com.rio.myself;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bumptech.glide.RequestManager;
import com.rio.myself.models.MediaObject;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class VideoPlayerViewHolder extends RecyclerView.ViewHolder {

    FrameLayout media_container;
    TextView title;
    ImageView thumbnail, volumeControl;
    ProgressBar progressBar;
    View parent;
    RequestManager requestManager;

    public VideoPlayerViewHolder(@NonNull View itemView) {
        super(itemView);
        parent = itemView;
        media_container = itemView.findViewById(R.id.media_container);
        thumbnail = itemView.findViewById(R.id.thumbnail);
        title = itemView.findViewById(R.id.title);
        progressBar = itemView.findViewById(R.id.progressBar);
        volumeControl = itemView.findViewById(R.id.volume_control);
    }

    public void onBind(MediaObject mediaObject, RequestManager requestManager) {
        this.requestManager = requestManager;
        parent.setTag(this);
        title.setText(mediaObject.getTitle());
        this.requestManager
                .load(mediaObject.getThumbnail())
                .into(thumbnail);
    }

}
