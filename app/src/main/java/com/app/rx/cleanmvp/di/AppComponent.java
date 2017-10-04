package com.app.rx.cleanmvp.di;

import android.app.Application;

import com.app.rx.cleanmvp.App;
import com.app.rx.cleanmvp.di.scopes.ApplicationScope;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * Created by sarath on 4/10/17.
 */

@Component(modules = {
        AndroidInjectionModule.class,
        ActivityBuilderModule.class,
        AppModule.class
})
@ApplicationScope
public interface AppComponent {
    void inject(App app);

    @Component.Builder
     interface Builder {
        @BindsInstance Builder application(Application app);
        AppComponent build();
    }
}
