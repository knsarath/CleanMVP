package com.app.rx.cleanmvp.presentation.mvp;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by sarath on 4/10/17.
 */

public abstract class BasePresenter {
    BaseView mBaseView;
    CompositeDisposable mCompositeDisposable = new CompositeDisposable();

    public BasePresenter(BaseView baseView) {
        mBaseView = baseView;
    }

    abstract public void start();

    public void destroy() {
        mBaseView = null;
        mCompositeDisposable.clear();
    }
}
