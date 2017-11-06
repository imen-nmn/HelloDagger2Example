package com.imennmn.hellodagger2example;

import javax.inject.Inject;

/**
 * Created by imen_nmn on 06/11/17.
 */

public class Data {
    public String content ="Hello dagger" ;
    public String param = null;

    @Inject
    public Data(String param) {
        this.param = param;
    }

    @Override
    public String toString() {
        return "Data{" +
                "content='" + content + '\'' +
                ", param='" + param + '\'' +
                '}';
    }
}
