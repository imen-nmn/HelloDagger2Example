package com.imennmn.hellodagger2example.presenterInjection;

import com.imennmn.hellodagger2example.HomeActivity;

import dagger.Component;

/**
 * Created by imen_nmn on 27/12/17.
 */

@Component (modules = PresenterModule.class)
public interface PresenterComponent {

    void inject(HomeActivity activity) ;
}
