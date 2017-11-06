package com.imennmn.hellodagger2example;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by imen_nmn on 06/11/17.
 */

@Module
public class ParamModule {
    @Provides
    @Named("first_text") String getText(){
        return "First Text" ;
    }
}
