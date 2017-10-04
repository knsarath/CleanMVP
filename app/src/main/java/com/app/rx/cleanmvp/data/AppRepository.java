package com.app.rx.cleanmvp.data;

import com.app.rx.cleanmvp.domain.model.User;

import java.util.List;

import io.reactivex.Flowable;

/**
 * Created by sarath on 4/10/17.
 */

public interface AppRepository {

    Flowable<List<User>> getUserList();

}
