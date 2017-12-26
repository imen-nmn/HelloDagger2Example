package com.imennmn.hellodagger2example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject // this keyword of request dependency . At compiling process, dagger will look at all of these annotations
            //to create the exact dependency
    Data data ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.textview) ;

        textView.setText("Before injection data= "+data);
        DaggerDataComponent.create().inject(this);
        textView.setText(textView.getText().toString()+"\n"+"After injection data= "+data);

    }
}
