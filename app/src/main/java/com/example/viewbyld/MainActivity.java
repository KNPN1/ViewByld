package com.example.viewbyld;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    private Button button;
    private int clickCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCount++;

                if (clickCount == 1) {
                    button.setText("Кнопка нажата");
                } else if (clickCount == 3) {
                    button.setText("Вы нажали " + clickCount + " раза на кнопку");
                }
            }
        });
    }
}