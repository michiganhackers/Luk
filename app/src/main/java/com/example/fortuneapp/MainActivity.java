package com.example.fortuneapp;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void givefortune(View view){
        ArrayList<String> fortunes = new ArrayList<String>(20);
        fortunes.add("You are awesome");
        fortunes.add("You will be a billionaire");
        fortunes.add("Your days are numbered");
        fortunes.add("You will be jacked");
        fortunes.add("You will be fat");
        fortunes.add("You will fail your easiest class");
        fortunes.add("You will go to Ohio State");
        fortunes.add("I see money in your future... it is not yours though");
        fortunes.add("Ignore next fortune");
        fortunes.add("You will marry a professional athlete - \nIf competitive eating can be considered a sport");
        fortunes.add("I'm watching you. Yeah. YOU.");
        fortunes.add("You will go on a date with someone beautiful. They could do so much better");
        fortunes.add("run.");
        fortunes.add("The waiter coughed on your food.");
        fortunes.add("....");
        fortunes.add("You are sexy...jk");
        fortunes.add("You can slap your professor now.");
        fortunes.add("Ask not what I can do for you but what you can do for me.");
        fortunes.add("Enjoy yourself!\nWhile you can...");
        fortunes.add("You are not illiterate.");
        fortunes.add("Eeh ehr");
        Random rand = new Random();
        int random = rand.nextInt(fortunes.size());
        Toast.makeText(this, fortunes.get(random) ,Toast.LENGTH_SHORT).show();

    }

}
