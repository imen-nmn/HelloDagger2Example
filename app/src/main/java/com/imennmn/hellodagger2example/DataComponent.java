package com.imennmn.hellodagger2example;

import javax.inject.Named;

import dagger.Component;

/**
 * Created by imen_nmn on 06/11/17.
 */
@Component(modules=DataModule.class) // the component is a bridge to make the @Inject and @Module knowing each other
public interface DataComponent {
    void inject(MainActivity activity) ;

    @Named("first_text") String takeText() ;
}
