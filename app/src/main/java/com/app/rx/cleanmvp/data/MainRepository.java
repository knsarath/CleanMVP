package com.app.rx.cleanmvp.data;

import com.app.rx.cleanmvp.di.scopes.ApplicationScope;
import com.app.rx.cleanmvp.domain.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import javax.inject.Inject;

import io.reactivex.Flowable;

/**
 * Created by sarath on 4/10/17.
 */
@ApplicationScope
public class MainRepository implements AppRepository {
    private LocalDataSource mLocalDataSource;
    private RemoteDataSource mRemoteDataSource;

    @Inject
    public MainRepository(LocalDataSource localDataSource, RemoteDataSource remoteDataSource) {
        mLocalDataSource = localDataSource;
        mRemoteDataSource = remoteDataSource;
    }

    @Override
    public Flowable<List<User>> getUserList() {
        return Flowable.fromCallable(new Callable<List<User>>() {
            @Override
            public List<User> call() throws Exception {
                List<User> users = new ArrayList<User>();
                for (int i = 0; i < 10; i++) {
                    User user = new User();
                    user.name = "User " + i + 1;
                    users.add(user);
                }
                return users;
            }
        });
    }
}
