package com.chowbus.flickrphotos.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chowbus.flickrphotos.R;
import com.chowbus.flickrphotos.adapter.PhotoAdapter;
import com.chowbus.flickrphotos.api.ResponseCallBack;
import com.chowbus.flickrphotos.api.ServiceApi;
import com.chowbus.flickrphotos.api.response.InterestingPhotosResponse;
import com.jude.easyrecyclerview.EasyRecyclerView;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.chowbus.flickrphotos.api.ServerConfig.COUNT_FOR_PAGENATION;

public class MainFragment extends BaseFragment implements RecyclerArrayAdapter.OnMoreListener{

    @BindView(R.id.rv_photos)
    EasyRecyclerView rvPhotos;

    private int page = 1;
    private boolean isNeededLoadMore = true;
    private PhotoAdapter adapter;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        ButterKnife.bind(this, view);

        initWidget();
        return view;
    }

    private void initWidget() {

        rvPhotos.setLayoutManager(new LinearLayoutManager(getContext()));
        rvPhotos.setProgressView(R.layout.view_progress);

        adapter = new PhotoAdapter(getContext());
        adapter.setOnItemClickListener(new RecyclerArrayAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                if (getActivity() == null)      return;

                PhotoDetailFragment detailFragment = PhotoDetailFragment.newInstance(adapter.getItem(position));
                detailFragment.show(getActivity().getSupportFragmentManager(), "Detail page");
            }
        });
        adapter.setMore(R.layout.view_load_more, this);
        rvPhotos.setAdapter(adapter);
        rvPhotos.showProgress();

        getPhotos();
    }

    private void getPhotos() {
        ServiceApi.newInstance().getPhotos(page, new ResponseCallBack<InterestingPhotosResponse>() {
            @Override
            public void onSuccess(InterestingPhotosResponse data) {
                rvPhotos.showRecycler();
                if (data.getPhotos() != null && data.getPhotos().getPhotos() != null) {
                    adapter.addAll(data.getPhotos().getPhotos());
                    isNeededLoadMore = data.getPhotos().getPhotos().size() == COUNT_FOR_PAGENATION;
                    page++;
                } else {
                    if (adapter.getCount() > 0)
                        adapter.stopMore();
                    else
                        rvPhotos.showRecycler();
                    isNeededLoadMore = false;
                }
            }

            @Override
            public void onFailure(String errorMessage) {
                rvPhotos.showRecycler();
                showErrorNotificationBar(errorMessage);
            }
        });
    }

    @Override
    public void onMoreShow() {
        if (isNeededLoadMore) {
            getPhotos();
        } else {
            adapter.stopMore();
        }
    }

    @Override
    public void onMoreClick() {

    }

}
