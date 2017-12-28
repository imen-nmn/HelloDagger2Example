package com.imennmn.hellodagger2example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import com.imennmn.hellodagger2example.presenterInjection.DaggerPresenterComponent;
import com.imennmn.hellodagger2example.presenterInjection.MainPresenter;
import com.imennmn.hellodagger2example.presenterInjection.MainView;
import com.imennmn.hellodagger2example.presenterInjection.PresenterModule;
import com.imennmn.hellodagger2example.simpleInjection.DaggerDataComponent;
import com.imennmn.hellodagger2example.simpleInjection.Data;

import javax.inject.Inject;

/**
 * Created by imen_nmn on 27/12/17.
 */

public class HomeActivity extends AppCompatActivity implements MainView {

    // this keyword of request dependency . At compiling process, dagger will look at all of these annotations
    //to create the exact dependency

    @Inject
    MainPresenter mainPresenter ;

    @Inject
    Data data ;

    TextView textView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textview) ;

        DaggerPresenterComponent.builder()
                .presenterModule(new PresenterModule(this))
                .dataComponent(DaggerDataComponent.create())
                .build().inject(this);

        textView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                mainPresenter.doThings(8555) ;
            }
        });

    }

    /**********************************/

    @Override
    public void invokeRandomViewMethod(String msg) {
        textView.setText(msg+data);
    }
}
