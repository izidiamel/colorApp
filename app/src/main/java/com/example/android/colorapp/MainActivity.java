package com.example.android.colorapp;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    SeekBar SR_R,SR_B,SR_G,SR_A;
    TextView txt,RedV,GreenV,BlueV,AlphaV;
    View view;
    int pr_r=0,pr_g=0,pr_b=0,pr_a=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SR_R =(SeekBar)findViewById(R.id.SeekBar_R);
        SR_G=(SeekBar)findViewById(R.id.SeekBar_G);
        SR_B=(SeekBar)findViewById(R.id.SeekBar_B);
        SR_A=(SeekBar)findViewById(R.id.SeekBar_alpha);
        txt=    (TextView) findViewById(R.id.white_rect);
        RedV=   (TextView) findViewById(R.id.Red_val);
        GreenV= (TextView) findViewById(R.id.Green_val);
        BlueV=  (TextView) findViewById(R.id.Blue_val);
        AlphaV=  (TextView) findViewById(R.id.Alpha_val);


        SR_A.setOnSeekBarChangeListener(onSBL1);

        SR_R.setOnSeekBarChangeListener(onSBL2);

        SR_G.setOnSeekBarChangeListener(onSBL3);

        SR_B.setOnSeekBarChangeListener(onSBL4);

    }

    public  SeekBar.OnSeekBarChangeListener onSBL1 = new SeekBar.OnSeekBarChangeListener() {
        int progressChangedValue = 0;

        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            pr_a = progress;
            txt.setBackgroundColor(Color.argb(pr_a,pr_r,pr_g,pr_b));
            AlphaV.setText(""+pr_a);

        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    };

    public  SeekBar.OnSeekBarChangeListener onSBL2 = new SeekBar.OnSeekBarChangeListener() {
        int progressChangedValue = 0;

        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            pr_r = progress;
            txt.setBackgroundColor(Color.argb(pr_a,pr_r,pr_g,pr_b));
            RedV.setText(""+pr_r);

        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    };
    public  SeekBar.OnSeekBarChangeListener onSBL3 = new SeekBar.OnSeekBarChangeListener() {
        int progressChangedValue = 0;

        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            pr_g = progress;
            txt.setBackgroundColor(Color.argb(pr_a,pr_r,pr_g,pr_b));
            GreenV.setText(""+pr_g);

        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    };

    public  SeekBar.OnSeekBarChangeListener onSBL4 = new SeekBar.OnSeekBarChangeListener() {
        int progressChangedValue = 0;

        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            pr_b = progress;
            txt.setBackgroundColor(Color.argb(pr_a,pr_r,pr_g,pr_b));
            BlueV.setText(""+pr_b);
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    };

}
