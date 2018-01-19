package com.foo;

import com.foo.api.ApiInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public class UnnamedStart {
    public static void main(String[] args) {
        ServiceLoader<ApiInterface> services = ServiceLoader.load(ApiInterface.class);
        List<ApiInterface> list = new ArrayList<>();
        services.iterator().forEachRemaining(list::add);
        System.out.println(list);
    }
}
