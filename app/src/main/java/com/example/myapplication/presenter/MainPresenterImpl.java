package com.example.myapplication.presenter;

import com.example.myapplication.interactor.FindItemsInteractor;
import com.example.myapplication.view.MainView;

import java.util.List;

/**
 * Created by gabordudas on 2018-01-17.
 * Copyright (c) 2015 MyApplication. All rights reserved.
 */

public class MainPresenterImpl implements MainPresenter, FindItemsInteractor.OnFinishedListener {
    private MainView mainView;
    private FindItemsInteractor findItemsInteractor;

    public MainPresenterImpl(MainView mainView, FindItemsInteractor findItemsInteractor) {
        this.mainView = mainView;
        this.findItemsInteractor = findItemsInteractor;
    }

    @Override
    public void onResume() {
        if (mainView != null) {
            mainView.showProgress();
        }

        findItemsInteractor.findItems(this);
    }

    @Override
    public void onPause() {

    }

    @Override
    public void onItemClicked(int position) {
        if (mainView != null) {
            mainView.showMessage(String.format("Position %d clicked", position + 1));
        }
    }

    @Override
    public void onDestroy() {
        mainView = null;
    }

    @Override
    public void onFinished(List<String> items) {
        if (mainView != null) {
            mainView.setItems(items);
            mainView.hideProgress();
        }
    }

    public MainView getMainView() {
        return mainView;
    }
}
