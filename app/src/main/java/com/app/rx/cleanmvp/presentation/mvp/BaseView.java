package com.app.rx.cleanmvp.presentation.mvp;

/**
 * Created by sarath on 4/10/17.
 */

public interface BaseView<P extends BasePresenter> {

    void onPresenterCreated(P presenter);

}
