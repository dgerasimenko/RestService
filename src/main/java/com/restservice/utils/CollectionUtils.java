package com.restservice.utils;

import java.util.Collection;

public class CollectionUtils {

    public static final boolean isNullOrEmpty(Collection collection) {
        return collection == null || collection.isEmpty();
    }

    public static final boolean isNotNullOrEmpty(Collection collection) {
        return !isNullOrEmpty(collection);
    }
}
