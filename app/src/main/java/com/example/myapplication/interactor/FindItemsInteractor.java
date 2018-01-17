package com.example.myapplication.interactor;

import java.util.List;

/**
 * Created by gabordudas on 2018-01-18.
 * Copyright (c) 2015 MyApplication. All rights reserved.
 */

public interface FindItemsInteractor {

    interface OnFinishedListener {
        void onFinished(List<String> items);
    }

    void findItems(OnFinishedListener listener);
}
