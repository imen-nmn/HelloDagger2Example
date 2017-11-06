package com.imennmn.hellodagger2example;

import dagger.Module;
import dagger.Provides;

/**
 * Created by imen_nmn on 06/11/17.
 */

@Module // It is a class provides dependancy object and help dagger to find where is the dependancy
public class DataModule {

    @Provides // this is the method that will provide the dependancy
    Data getData(){
       return new Data() ;
    }
}
