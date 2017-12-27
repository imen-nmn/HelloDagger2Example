package com.imennmn.hellodagger2example.presenterInjection;

import java.util.Random;

import javax.inject.Inject;

/**
 * Created by imen_nmn on 26/12/17.
 */

public class MainPresenter {

    private MainView mainView ;

    @Inject
    public MainPresenter(MainView mainView) {
        this.mainView = mainView;
    }

    public void doThings(int value){
        Random random = new Random();
        int rand= random.nextInt(value) ;
        if(mainView != null){
            mainView.invokeRandomViewMethod("You random number is "+rand);
        }
    }
}
