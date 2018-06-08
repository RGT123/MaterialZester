package com.example.rubenthomas.materialzester;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button bluebutton;
    Button greenbutton;
    Button redbutton;
    Button indigobutton;
    Button tealbutton;
    Button pinkbutton;
    Button defaultbutton;
    ConstraintLayout backlayout;
    TextView selectColor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bluebutton=findViewById(R.id.bluebutton);
        greenbutton=findViewById(R.id.greenbutton);
        redbutton=findViewById(R.id.redbutton);
        indigobutton=findViewById(R.id.indigobutton);
        tealbutton=findViewById(R.id.tealbutton);
        pinkbutton=findViewById(R.id.pinkbutton);
        backlayout=findViewById(R.id.backlayout);
        selectColor=findViewById(R.id.selectColor);
        defaultbutton=findViewById(R.id.defaultbutton);

        defaultbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backlayout.setBackgroundColor(Color.WHITE);
                selectColor.setText(getResources().getText(R.string.selectcolor));
                selectColor.setTextColor(Color.BLACK);
            }
        });

    }
    public void onClickBlue(View view){

        backlayout.setBackgroundColor(getResources().getColor(R.color.blue));
        selectColor.setText(getResources().getText(R.string.ruby_designs));
        selectColor.setTextColor(Color.WHITE);
    }
    public void onClickGreen(View view){
        backlayout.setBackgroundColor(getResources().getColor(R.color.green));
        selectColor.setText(getResources().getText(R.string.ruby_designs));
        selectColor.setTextColor(Color.WHITE);
    }
    public void onClickRed(View view){
        backlayout.setBackgroundColor(getResources().getColor(R.color.red));
        selectColor.setText(getResources().getText(R.string.ruby_designs));
        selectColor.setTextColor(Color.WHITE);
    }
    public void onClickIndigo(View view){
        backlayout.setBackgroundColor(getResources().getColor(R.color.indigo));
        selectColor.setText(getResources().getText(R.string.ruby_designs));
        selectColor.setTextColor(Color.WHITE);
    }
    public void onClickTeal(View view){
        backlayout.setBackgroundColor(getResources().getColor(R.color.teal));
        selectColor.setText(getResources().getText(R.string.ruby_designs));
        selectColor.setTextColor(Color.WHITE);
    }
    public void onClickPink(View view){
        backlayout.setBackgroundColor(getResources().getColor(R.color.pink));
        selectColor.setText(getResources().getText(R.string.ruby_designs));
        selectColor.setTextColor(Color.WHITE);
    }
}
