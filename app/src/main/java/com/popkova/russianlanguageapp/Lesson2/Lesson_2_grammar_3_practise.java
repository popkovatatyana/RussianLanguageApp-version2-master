package com.popkova.russianlanguageapp.Lesson2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import com.popkova.russianlanguageapp.MainActivity;
import com.popkova.russianlanguageapp.R;

public class Lesson_2_grammar_3_practise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_2_grammar_3_practise);

    }

    public void Check_L2_grammar_3 (View view) {

        EditText l2_g2_answer0 = (EditText)findViewById(R.id.l2_g2_answer0);
        EditText l2_g2_answer1 = (EditText)findViewById(R.id.l2_g2_answer1);
        EditText l2_g2_answer2 = (EditText)findViewById(R.id.l2_g2_answer2);
        EditText l2_g2_answer3 = (EditText)findViewById(R.id.l2_g2_answer3);
        EditText l2_g2_answer4 = (EditText)findViewById(R.id.l2_g2_answer4);
        EditText l2_g2_answer5 = (EditText)findViewById(R.id.l2_g2_answer5);
        EditText l2_g2_answer6 = (EditText)findViewById(R.id.l2_g2_answer6);
        EditText l2_g2_answer7 = (EditText)findViewById(R.id.l2_g2_answer7);
        EditText l2_g2_answer8 = (EditText)findViewById(R.id.l2_g2_answer8);
        EditText l2_g2_answer9 = (EditText)findViewById(R.id.l2_g2_answer9);

        Intent intent = new Intent(Lesson_2_grammar_3_practise.this, Lesson_2_grammar_3_results.class);

        intent.putExtra("L2G3A0", l2_g2_answer0.getText().toString());
        intent.putExtra("L2G3A1", l2_g2_answer1.getText().toString());
        intent.putExtra("L2G3A2", l2_g2_answer2.getText().toString());
        intent.putExtra("L2G3A3", l2_g2_answer3.getText().toString());
        intent.putExtra("L2G3A4", l2_g2_answer4.getText().toString());
        intent.putExtra("L2G3A5", l2_g2_answer5.getText().toString());
        intent.putExtra("L2G3A6", l2_g2_answer6.getText().toString());
        intent.putExtra("L2G3A7", l2_g2_answer7.getText().toString());
        intent.putExtra("L2G3A8", l2_g2_answer8.getText().toString());
        intent.putExtra("L2G3A9", l2_g2_answer9.getText().toString());

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
