package com.popkova.russianlanguageapp.Lesson7;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import com.popkova.russianlanguageapp.MainActivity;
import com.popkova.russianlanguageapp.R;

public class Lesson_7_grammar_1_practise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_7_grammar_1_practise);
    }

    public void Check_L7_grammar_1(View view) {
        EditText l7_g1_answer0 = (EditText)findViewById(R.id.l7_g1_answer0);
        EditText l7_g1_answer1 = (EditText)findViewById(R.id.l7_g1_answer1);
        EditText l7_g1_answer2 = (EditText)findViewById(R.id.l7_g1_answer2);
        EditText l7_g1_answer3 = (EditText)findViewById(R.id.l7_g1_answer3);
        EditText l7_g1_answer4 = (EditText)findViewById(R.id.l7_g1_answer4);
        EditText l7_g1_answer5 = (EditText)findViewById(R.id.l7_g1_answer5);
        EditText l7_g1_answer6 = (EditText)findViewById(R.id.l7_g1_answer6);
        EditText l7_g1_answer7 = (EditText)findViewById(R.id.l7_g1_answer7);
        EditText l7_g1_answer8 = (EditText)findViewById(R.id.l7_g1_answer8);
        EditText l7_g1_answer9 = (EditText)findViewById(R.id.l7_g1_answer9);

        Intent intent = new Intent(Lesson_7_grammar_1_practise.this, Lesson_7_grammar_1_results.class);

        intent.putExtra("L7G1A0", l7_g1_answer0.getText().toString());
        intent.putExtra("L7G1A1", l7_g1_answer1.getText().toString());
        intent.putExtra("L7G1A2", l7_g1_answer2.getText().toString());
        intent.putExtra("L7G1A3", l7_g1_answer3.getText().toString());
        intent.putExtra("L7G1A4", l7_g1_answer4.getText().toString());
        intent.putExtra("L7G1A5", l7_g1_answer5.getText().toString());
        intent.putExtra("L7G1A6", l7_g1_answer6.getText().toString());
        intent.putExtra("L7G1A7", l7_g1_answer7.getText().toString());
        intent.putExtra("L7G1A8", l7_g1_answer8.getText().toString());
        intent.putExtra("L7G1A9", l7_g1_answer9.getText().toString());

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
