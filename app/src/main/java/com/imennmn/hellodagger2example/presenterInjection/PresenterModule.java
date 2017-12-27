package com.imennmn.hellodagger2example.presenterInjection;

import dagger.Module;
import dagger.Provides;

/**
 * Created by imen_nmn on 27/12/17.
 */

@Module
public class PresenterModule {

    private MainView mainView;

    public PresenterModule(MainView mainView) {
        this.mainView = mainView;
    }

    @Provides
        // this is the method that will provide the dependancy
    MainPresenter provideMainPresenter(){
        return new MainPresenter(mainView);
    }
}
