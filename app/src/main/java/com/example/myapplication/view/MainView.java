package com.example.myapplication.view;

import java.util.List;

/**
 * Created by gabordudas on 2018-01-17.
 * Copyright (c) 2015 MyApplication. All rights reserved.
 */

public interface MainView {
    void showProgress();

    void hideProgress();

    void setItems(List<String> items);

    void showMessage(String message);
}
