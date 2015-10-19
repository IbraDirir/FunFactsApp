package com.moringaschool.funfacts;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

import static android.graphics.Color.*;


public class FunFactsActivity extends Activity {
    private FactBook mFactBoook;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);
    // declare our view variable and assign them the views from the layout files
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        Button showFactButton = (Button) findViewById(R.id.showFactButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fact = mFactBoook.getFact();
             //Update the label with our dynamic fact
                factLabel.setText(fact);
                relativeLayout.setBackgroundColor(Color.RED);

            }
        };
        showFactButton.setOnClickListener(listener);
    }
}
