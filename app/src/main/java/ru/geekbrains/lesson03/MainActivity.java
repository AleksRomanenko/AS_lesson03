package ru.geekbrains.lesson03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.key_1);
        Button button2 = findViewById(R.id.key_2);
        Button button3 = findViewById(R.id.key_3);
        Button button4 = findViewById(R.id.key_4);
        Button button5 = findViewById(R.id.key_5);
        Button button6 = findViewById(R.id.key_6);
        Button button7 = findViewById(R.id.key_7);
        Button button8 = findViewById(R.id.key_8);
        Button button9 = findViewById(R.id.key_9);
        Button button10 = findViewById(R.id.key_0);
        Button button11 = findViewById(R.id.key_reset);
        Button button12 = findViewById(R.id.key_brase);
        Button button13 = findViewById(R.id.key_percent);
        Button button14 = findViewById(R.id.key_div);
        Button button15 = findViewById(R.id.key_mult);
        Button button16 = findViewById(R.id.key_minus);
        Button button17 = findViewById(R.id.key_plus);
        Button button18 = findViewById(R.id.key_dot);
        Button button19 = findViewById(R.id.key_result);

        button1.setOnClickListener(onClickListener);
        button2.setOnClickListener(onClickListener);
        button3.setOnClickListener(onClickListener);
        button4.setOnClickListener(onClickListener);
        button5.setOnClickListener(onClickListener);
        button6.setOnClickListener(onClickListener);
        button7.setOnClickListener(onClickListener);
        button8.setOnClickListener(onClickListener);
        button9.setOnClickListener(onClickListener);
        button10.setOnClickListener(onClickListener);
        button11.setOnClickListener(onClickListener);
        button12.setOnClickListener(onClickListener);
        button13.setOnClickListener(onClickListener);
        button14.setOnClickListener(onClickListener);
        button15.setOnClickListener(onClickListener);
        button16.setOnClickListener(onClickListener);
        button17.setOnClickListener(onClickListener);
        button18.setOnClickListener(onClickListener);
        button19.setOnClickListener(onClickListener);

    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (view.getId() == R.id.key_1) {
                Toast.makeText(MainActivity.this, "Нажата кнопка 1",Toast.LENGTH_SHORT).show();
            } else if (view.getId() == R.id.key_2) {
                Toast.makeText(MainActivity.this, "Нажата кнопка 2",Toast.LENGTH_SHORT).show();
            } else if (view.getId() == R.id.key_3) {
                Toast.makeText(MainActivity.this, "Нажата кнопка 3",Toast.LENGTH_SHORT).show();
            } else if (view.getId() == R.id.key_4) {
                Toast.makeText(MainActivity.this, "Нажата кнопка 4",Toast.LENGTH_SHORT).show();
            } else if (view.getId() == R.id.key_5) {
                Toast.makeText(MainActivity.this, "Нажата кнопка 5",Toast.LENGTH_SHORT).show();
            } else if (view.getId() == R.id.key_6) {
                Toast.makeText(MainActivity.this, "Нажата кнопка 6",Toast.LENGTH_SHORT).show();
            } else if (view.getId() == R.id.key_7) {
                Toast.makeText(MainActivity.this, "Нажата кнопка 7",Toast.LENGTH_SHORT).show();
            } else if (view.getId() == R.id.key_8) {
                Toast.makeText(MainActivity.this, "Нажата кнопка 8",Toast.LENGTH_SHORT).show();
            } else if (view.getId() == R.id.key_9) {
                Toast.makeText(MainActivity.this, "Нажата кнопка 9",Toast.LENGTH_SHORT).show();
            } else if (view.getId() == R.id.key_0) {
                Toast.makeText(MainActivity.this, "Нажата кнопка 0",Toast.LENGTH_SHORT).show();
            } else if (view.getId() == R.id.key_reset) {
                Toast.makeText(MainActivity.this, "Нажата кнопка C",Toast.LENGTH_SHORT).show();
            } else if (view.getId() == R.id.key_brase) {
                Toast.makeText(MainActivity.this, "Нажата кнопка ()",Toast.LENGTH_SHORT).show();
            } else if (view.getId() == R.id.key_percent) {
                Toast.makeText(MainActivity.this, "Нажата кнопка %",Toast.LENGTH_SHORT).show();
            } else if (view.getId() == R.id.key_div) {
                Toast.makeText(MainActivity.this, "Нажата кнопка /",Toast.LENGTH_SHORT).show();
            } else if (view.getId() == R.id.key_mult) {
                Toast.makeText(MainActivity.this, "Нажата кнопка *",Toast.LENGTH_SHORT).show();
            } else if (view.getId() == R.id.key_minus) {
                Toast.makeText(MainActivity.this, "Нажата кнопка -",Toast.LENGTH_SHORT).show();
            } else if (view.getId() == R.id.key_plus) {
                Toast.makeText(MainActivity.this, "Нажата кнопка +",Toast.LENGTH_SHORT).show();
            } else if (view.getId() == R.id.key_result) {
                Toast.makeText(MainActivity.this, "Нажата кнопка =",Toast.LENGTH_SHORT).show();
            } else if (view.getId() == R.id.key_dot) {
                Toast.makeText(MainActivity.this, "Нажата кнопка .",Toast.LENGTH_SHORT).show();
            }
        }
    };
}