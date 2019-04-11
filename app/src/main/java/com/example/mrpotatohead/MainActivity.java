package com.example.mrpotatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        ImageView arms = findViewById(R.id.arms);
        ImageView ears = findViewById(R.id.ears);
        ImageView eyebrows = findViewById(R.id.eyebrows);
        ImageView eyes = findViewById(R.id.eyes);
        ImageView glasses = findViewById(R.id.glasses);
        ImageView hat = findViewById(R.id.hat);
        ImageView mouth = findViewById(R.id.mouth);
        ImageView mustache = findViewById(R.id.mustache);
        ImageView nose = findViewById(R.id.nose);
        ImageView shoes = findViewById(R.id.shoes);

        outState.putInt("arms", arms.getVisibility());
        outState.putInt("ears", ears.getVisibility());
        outState.putInt("eyebrows", eyebrows.getVisibility());
        outState.putInt("eyes", eyes.getVisibility());
        outState.putInt("glasses", glasses.getVisibility());
        outState.putInt("hat", hat.getVisibility());
        outState.putInt("mouth", mouth.getVisibility());
        outState.putInt("mustache", mustache.getVisibility());
        outState.putInt("nose", nose.getVisibility());
        outState.putInt("shoes", shoes.getVisibility());

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        findViewById(R.id.arms).setVisibility(savedInstanceState.getInt("arms"));
        findViewById(R.id.ears).setVisibility(savedInstanceState.getInt("ears"));
        findViewById(R.id.eyebrows).setVisibility(savedInstanceState.getInt("eyebrows"));
        findViewById(R.id.eyes).setVisibility(savedInstanceState.getInt("eyes"));
        findViewById(R.id.glasses).setVisibility(savedInstanceState.getInt("glasses"));
        findViewById(R.id.hat).setVisibility(savedInstanceState.getInt("hat"));
        findViewById(R.id.mouth).setVisibility(savedInstanceState.getInt("mouth"));
        findViewById(R.id.mustache).setVisibility(savedInstanceState.getInt("mustache"));
        findViewById(R.id.nose).setVisibility(savedInstanceState.getInt("nose"));
        findViewById(R.id.shoes).setVisibility(savedInstanceState.getInt("shoes"));

    }

    public void checkClicked(View v){
        switch (v.getId()){
            case R.id.checkBox_arms :
                ImageView arms = findViewById(R.id.arms);
                if ((((CheckBox) v).isChecked())) {
                    arms.setVisibility(View.VISIBLE);
                }
                else {
                    arms.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBox_ears :
                ImageView ears = findViewById(R.id.ears);
                if ((((CheckBox) v).isChecked())) {
                    ears.setVisibility(View.VISIBLE);
                }
                else {
                    ears.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBox_eyebrows :
                ImageView eyebrows = findViewById(R.id.eyebrows);
                if ((((CheckBox) v).isChecked())) {
                    eyebrows.setVisibility(View.VISIBLE);
                }
                else {
                    eyebrows.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBox_eyes :
                ImageView eyes = findViewById(R.id.eyes);
                if ((((CheckBox) v).isChecked())) {
                    eyes.setVisibility(View.VISIBLE);
                }
                else {
                    eyes.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBox_glasses :
                ImageView glasses = findViewById(R.id.glasses);
                if ((((CheckBox) v).isChecked())) {
                    glasses.setVisibility(View.VISIBLE);
                }
                else {
                    glasses.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBox_hat :
                ImageView hat = findViewById(R.id.hat);
                if ((((CheckBox) v).isChecked())) {
                    hat.setVisibility(View.VISIBLE);
                }
                else {
                    hat.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBox_mouth :
                ImageView mouth = findViewById(R.id.mouth);
                if ((((CheckBox) v).isChecked())) {
                    mouth.setVisibility(View.VISIBLE);
                }
                else {
                    mouth.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBox_mustache :
                ImageView mustache = findViewById(R.id.mustache);
                if ((((CheckBox) v).isChecked())) {
                    mustache.setVisibility(View.VISIBLE);
                }
                else {
                    mustache.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBox_nose :
                ImageView nose = findViewById(R.id.nose);
                if ((((CheckBox) v).isChecked())) {
                    nose.setVisibility(View.VISIBLE);
                }
                else {
                    nose.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBox_shoes :
                ImageView shoes = findViewById(R.id.shoes);
                if ((((CheckBox) v).isChecked())) {
                    shoes.setVisibility(View.VISIBLE);
                }
                else {
                    shoes.setVisibility(View.INVISIBLE);
                }
                break;

        }


    }


}
