package com.app.rx.cleanmvp.presentation.userlistscreen;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.rx.cleanmvp.presentation.BaseFragment;

/**
 * Created by sarath on 4/10/17.
 */

public class UserListFragment extends BaseFragment implements UserListView {
    private UserListPresenter mPresenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        if (mPresenter != null) {
            mPresenter.start();
        }
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onPresenterCreated(UserListPresenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}
