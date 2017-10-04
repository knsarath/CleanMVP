package com.app.rx.cleanmvp.domain.userlist;

import com.app.rx.cleanmvp.data.AppRepository;
import com.app.rx.cleanmvp.domain.UseCase;

import javax.inject.Inject;

import io.reactivex.Flowable;
import io.reactivex.Scheduler;

/**
 * Created by sarath on 4/10/17.
 */

public class GetUsers extends UseCase<GetUsers.RequestValues> {
    AppRepository mAppRepository;

    @Inject
    public GetUsers(Scheduler threadExecutor, Scheduler postExecutionThread, AppRepository appRepository) {
        super(threadExecutor, postExecutionThread);
        mAppRepository = appRepository;
    }

    @Override
    protected Flowable buildUseCaseObservable(RequestValues requestValues) {
        return mAppRepository.getUserList();
    }

    public static class RequestValues implements UseCase.RequestValues {

    }
}
