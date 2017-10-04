package com.app.rx.cleanmvp.di;

import android.app.Application;
import android.content.Context;

import com.app.rx.cleanmvp.data.AppRepository;
import com.app.rx.cleanmvp.data.LocalDataSource;
import com.app.rx.cleanmvp.data.MainRepository;
import com.app.rx.cleanmvp.data.RemoteDataSource;
import com.app.rx.cleanmvp.data.RemoteRepository;
import com.app.rx.cleanmvp.data.local.Preference;
import com.app.rx.cleanmvp.di.scopes.ApplicationScope;

import dagger.Binds;
import dagger.Module;

/**
 * Created by sarath on 4/10/17.
 */
@Module
abstract class AppModule {
    @Binds
    @ApplicationScope
    abstract AppRepository appRepository(MainRepository mainRepository);

    @Binds
    @ApplicationScope
    abstract LocalDataSource localRepository(Preference preference);

    @Binds
    @ApplicationScope
    @ApplicationContext
    abstract Context appContext(Application application);

    @Binds
    @ApplicationScope
    abstract RemoteDataSource remoteDataSource(RemoteRepository remoteRepository);
}
