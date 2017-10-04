package com.app.rx.cleanmvp.presentation.userlistscreen;

import dagger.Binds;
import dagger.Module;

/**
 * Created by sarath on 4/10/17.
 */
@Module
public class UserListModule {
    @Binds
    abstract UserListFragment mUserListFragment();

}
