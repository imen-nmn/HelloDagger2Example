package com.imennmn.hellodagger2example;

import dagger.Component;

/**
 * Created by imen_nmn on 06/11/17.
 */
@Component(modules={DataModule.class, ParamModule.class}) // the component is a bridge to make the @Inject and @Module knowing each other
public interface DataComponent {

    void inject(MainActivity activity) ;
}
