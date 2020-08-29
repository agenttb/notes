package com.agenttb.code.rxjava;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.schedulers.Schedulers;

public class RxJavaSimple {
    public static void main(String[] args) {
        String[] array = {"hello", "tianbin", "test"};
        getDataB().subscribe(System.out::println);
        Flowable<String> a_merge_b = getDataA().mergeWith(getDataB());

        a_merge_b.subscribe(s -> System.out.println(s));

    }

    public static Single<String> getDataA() {
        return Single.<String> create(o -> {
            o.onSuccess("DataA");
        }).subscribeOn(Schedulers.io());
    }

    public static Single<String> getDataB() {
        return Single.just("DataB")
                .subscribeOn(Schedulers.io());
    }
}
