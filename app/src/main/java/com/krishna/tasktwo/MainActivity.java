package com.krishna.tasktwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button_continue;
    private TextView textView;
    private int f=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_continue = (Button) findViewById(R.id.button_continue);
        textView = (TextView) findViewById(R.id.textView);

        button_continue.setOnClickListener(this);
    }

    public void toggleText()
    {
        f=f*(-1);

        if(f==1) {
            textView.setText("Hello World!");
        }
        else{
            textView.setText("Goodbye World!");
        }

    }

    @Override
    public void onClick(View v) {
        toggleText();
    }
}
