package com.app.rx.cleanmvp.presentation.userlistscreen;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableField;

import com.app.rx.cleanmvp.domain.model.User;

import java.util.List;

/**
 * Created by sarath on 4/10/17.
 */

public class UserListScreenModel extends BaseObservable {
    private ObservableField<List<User>> mListObservableField;

    @Bindable
    public ObservableField<List<User>> getListObservableField() {
        return mListObservableField;
    }
}
