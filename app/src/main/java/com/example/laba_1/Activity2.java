package com.example.laba_1;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity2 extends AppCompatActivity {
    private EditText editText2;
    private TextView textViewFromActivity1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        textViewFromActivity1 = findViewById(R.id.textView2);
        editText2 = findViewById(R.id.editText2);
        Button buttonReturn = findViewById(R.id.button2);

        Intent intent = getIntent();
        String text_1 = intent.getStringExtra("text1");
        textViewFromActivity1.setText(text_1);

        buttonReturn.setOnClickListener(view -> {
            String newText = editText2.getText().toString();
            String combinedText = text_1 + " " + newText;

            Intent resultIntent = new Intent();
            resultIntent.putExtra("combinedText", combinedText);
            setResult(RESULT_OK, resultIntent);
            finish();
        });
    }
}