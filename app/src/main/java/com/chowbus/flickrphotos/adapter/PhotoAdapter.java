package com.chowbus.flickrphotos.adapter;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.chowbus.flickrphotos.Global;
import com.chowbus.flickrphotos.R;
import com.chowbus.flickrphotos.model.Photo;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PhotoAdapter extends RecyclerArrayAdapter<Photo> {

    public PhotoAdapter(Context context) {
        super(context);
    }

    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
        return new PhotoViewHolder(parent);
    }

    public class PhotoViewHolder extends BaseViewHolder<Photo> {

        @BindView(R.id.tv_title)
        TextView tvTitle;

        @BindView(R.id.iv_photo)
        ImageView ivPhoto;

        public PhotoViewHolder(ViewGroup parent) {
            super(parent, R.layout.li_photo);
            ButterKnife.bind(this, itemView);
        }

        @Override
        public void setData(Photo data) {
            if (data.getTitle() != null)
                tvTitle.setText(data.getTitle());
            else
                tvTitle.setText(R.string.txt_title);

//            Picasso.get().load(Global.getFlickrImageUrl(data, false)).placeholder(R.drawable.ic_image_default).error(R.drawable.ic_image_default).into(ivPhoto);
            Picasso.get().load(data.getUrlZ()).placeholder(R.drawable.ic_default).error(R.drawable.ic_default).into(ivPhoto);
        }
    }
}
