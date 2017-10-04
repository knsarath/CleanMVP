package com.app.rx.cleanmvp.presentation.userlistscreen;

import com.app.rx.cleanmvp.domain.userlist.GetUsers;
import com.app.rx.cleanmvp.presentation.mvp.BasePresenter;

import javax.inject.Inject;

import io.reactivex.subscribers.DisposableSubscriber;

/**
 * Created by sarath on 4/10/17.
 */

public class UserListPresenter extends BasePresenter {

    private final UserListView mView;
    private final GetUsers mGetUsers;

    @Inject
    public UserListPresenter(UserListView view, GetUsers getUsers) {
        super(view);
        mView = view;
        mGetUsers = getUsers;
    }


    @Override
    public void start() {
        mGetUsers.execute(new GetUsers.RequestValues(), new DisposableSubscriber() {
            @Override
            public void onNext(Object o) {

            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onComplete() {

            }
        });
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
