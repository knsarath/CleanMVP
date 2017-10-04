package com.app.rx.cleanmvp.data;

import com.app.rx.cleanmvp.di.scopes.ApplicationScope;

import javax.inject.Inject;

/**
 * Created by sarath on 4/10/17.
 */
@ApplicationScope
public class RemoteRepository implements RemoteDataSource {
    @Inject
    public RemoteRepository() {
    }
}
