package org.fossasia.openevent.app.common.contract;

import android.support.annotation.NonNull;

public interface Function<T, R> {
    @NonNull
    R apply(@NonNull T var1);
}
