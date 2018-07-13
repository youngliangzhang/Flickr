package com.chowbus.flickrphotos.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.chowbus.flickrphotos.R;
import com.chowbus.flickrphotos.model.Photo;
import com.squareup.picasso.Picasso;

import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class PhotoDetailFragment extends AppCompatDialogFragment {

    @BindView(R.id.iv_photo)
    ImageView ivPhoto;

    @BindView(R.id.tv_title)
    TextView tvTitle;

    @BindView(R.id.tv_username)
    TextView tvUserName;

    @BindView(R.id.tv_date)
    TextView tvDate;

    @BindView(R.id.tv_description)
    TextView tvDescription;

    private Photo photo;

    public static PhotoDetailFragment newInstance(Photo photo) {
        PhotoDetailFragment fragment = new PhotoDetailFragment();
        fragment.photo = photo;
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(DialogFragment.STYLE_NO_TITLE, R.style.MyDialog);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_photo_detail, container, false);
        ButterKnife.bind(this, view);
        initWidget();
        return view;
    }

    private void initWidget() {
        Picasso.get().load(photo.getUrlZ()).placeholder(R.drawable.ic_default).error(R.drawable.ic_default).into(ivPhoto);
        tvTitle.setText(photo.getTitle());
        tvUserName.setText(String.format(Locale.getDefault(), "Owner: %s", photo.getOwnername()));
        tvDate.setText(String.format(Locale.getDefault(), "Uploaded: %s", photo.getDatetaken()));
        if (photo.getDescription() != null && photo.getDescription().getContent() != null)
            tvDescription.setText(photo.getDescription().getContent());
    }

    @OnClick(R.id.btn_close)
    public void onClickClose() {
        dismiss();
    }
}
