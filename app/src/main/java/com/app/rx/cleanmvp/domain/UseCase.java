package com.app.rx.cleanmvp.domain;

import org.reactivestreams.Subscriber;

import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.subscribers.DisposableSubscriber;

/**
 * Created by sarath on 4/10/17.
 */

public abstract class UseCase<R extends UseCase.RequestValues> {

    private final Scheduler threadExecutor;
    private final Scheduler postExecutionThread;

    protected UseCase(Scheduler threadExecutor,
                      Scheduler postExecutionThread) {
        this.threadExecutor = threadExecutor;
        this.postExecutionThread = postExecutionThread;
    }

    /**
     * Builds an {@link rx.Observable} which will be used when executing the current {@link UseCaseRx}.
     */
    protected abstract Flowable buildUseCaseObservable(R requestValues);

    /**
     * Executes the current use case.
     *
     * @param useCaseSubscriber The guy who will be listen to the observable build
     *                          with {@link #buildUseCaseObservable(R requestValues)}.
     */
    @SuppressWarnings("unchecked")
    public Subscriber execute(R requestValues, DisposableSubscriber useCaseSubscriber) {
        return this.buildUseCaseObservable(requestValues)
                .subscribeOn(threadExecutor)
                .observeOn(postExecutionThread)
                .subscribeWith(useCaseSubscriber);


    }


    /**
     * Data passed to a request.
     */
    public interface RequestValues {
    }
}
