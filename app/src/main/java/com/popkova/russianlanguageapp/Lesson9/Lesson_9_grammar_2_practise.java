package com.popkova.russianlanguageapp.Lesson9;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import com.popkova.russianlanguageapp.MainActivity;
import com.popkova.russianlanguageapp.R;

public class Lesson_9_grammar_2_practise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_9_grammar_2_practise);
    }

    public void Check_L9_grammar_2 (View view) {
        EditText l9_g2_answer0 = (EditText)findViewById(R.id.l9_g2_answer0);
        EditText l9_g2_answer1 = (EditText)findViewById(R.id.l9_g2_answer1);
        EditText l9_g2_answer2 = (EditText)findViewById(R.id.l9_g2_answer2);
        EditText l9_g2_answer3 = (EditText)findViewById(R.id.l9_g2_answer3);
        EditText l9_g2_answer4 = (EditText)findViewById(R.id.l9_g2_answer4);
        EditText l9_g2_answer5 = (EditText)findViewById(R.id.l9_g2_answer5);
        EditText l9_g2_answer6 = (EditText)findViewById(R.id.l9_g2_answer6);
        EditText l9_g2_answer7 = (EditText)findViewById(R.id.l9_g2_answer7);
        EditText l9_g2_answer8 = (EditText)findViewById(R.id.l9_g2_answer8);
        EditText l9_g2_answer9 = (EditText)findViewById(R.id.l9_g2_answer9);

        Intent intent = new Intent(Lesson_9_grammar_2_practise.this, Lesson_9_grammar_2_results.class);

        intent.putExtra("L9G2A0", l9_g2_answer0.getText().toString());
        intent.putExtra("L9G2A1", l9_g2_answer1.getText().toString());
        intent.putExtra("L9G2A2", l9_g2_answer2.getText().toString());
        intent.putExtra("L9G2A3", l9_g2_answer3.getText().toString());
        intent.putExtra("L9G2A4", l9_g2_answer4.getText().toString());
        intent.putExtra("L9G2A5", l9_g2_answer5.getText().toString());
        intent.putExtra("L9G2A6", l9_g2_answer6.getText().toString());
        intent.putExtra("L9G2A7", l9_g2_answer7.getText().toString());
        intent.putExtra("L9G2A8", l9_g2_answer8.getText().toString());
        intent.putExtra("L9G2A9", l9_g2_answer9.getText().toString());

        startActivity(intent);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_main_page) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
