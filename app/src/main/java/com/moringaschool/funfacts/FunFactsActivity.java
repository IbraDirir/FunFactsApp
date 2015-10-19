package com.moringaschool.funfacts;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class FunFactsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);
    // declare our view variable and assign them the views from the layout files
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        Button showFactButton = (Button) findViewById(R.id.showFactButton);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            // the button was clicked, so update  the fact label with a new fact.
                String fact = "";
                //Randomly select a fact
                Random randomGenerator = new Random(); // Construct a new Random number genereator
                int randomNumber = randomGenerator.nextInt(3);
                /* convert the RandomNumber to a text fact
                *0 = Ants stretch when they wake up in the morning.
                *1 = Ostriches can run faster than horses.
                *2 = Olympic gold medals are actually  made mostly of silver
                 */
                //if random Number equals to zero then
                if(randomNumber==0){
                    // set fact equals to ant fact
                    fact = "Ants stretch when they wake up in the morning.";
                }
                //Update the label with our dynamic fact
                factLabel.setText(fact);
            }
        };
        showFactButton.setOnClickListener(listener);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.fun_facts, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
