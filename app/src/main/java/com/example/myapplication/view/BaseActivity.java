package com.example.myapplication.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.myapplication.presenter.BasePresenter;

/**
 * Created by gabordudas on 2018-01-17.
 * Copyright (c) 2015 MyApplication. All rights reserved.
 */

abstract class BaseActivity<T extends BasePresenter> extends AppCompatActivity {
    protected T presenter;

    protected abstract T setPresenter();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.presenter = setPresenter();
    }

    @Override
    protected void onResume() {
        super.onResume();

        this.presenter.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();

        this.presenter.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        this.presenter.onDestroy();
    }
}
