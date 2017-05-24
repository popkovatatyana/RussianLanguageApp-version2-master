package com.popkova.russianlanguageapp.Lesson10;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import com.popkova.russianlanguageapp.MainActivity;
import com.popkova.russianlanguageapp.R;

public class Lesson_10_grammar_2_practise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_10_grammar_2_practise);
    }

    public void Check_L10_grammar_2 (View view) {
        EditText l10_g2_answer0 = (EditText)findViewById(R.id.l10_g2_answer0);
        EditText l10_g2_answer1 = (EditText)findViewById(R.id.l10_g2_answer1);
        EditText l10_g2_answer2 = (EditText)findViewById(R.id.l10_g2_answer2);
        EditText l10_g2_answer3 = (EditText)findViewById(R.id.l10_g2_answer3);
        EditText l10_g2_answer4 = (EditText)findViewById(R.id.l10_g2_answer4);
        EditText l10_g2_answer5 = (EditText)findViewById(R.id.l10_g2_answer5);
        EditText l10_g2_answer6 = (EditText)findViewById(R.id.l10_g2_answer6);
        EditText l10_g2_answer7 = (EditText)findViewById(R.id.l10_g2_answer7);
        EditText l10_g2_answer8 = (EditText)findViewById(R.id.l10_g2_answer8);
        EditText l10_g2_answer9 = (EditText)findViewById(R.id.l10_g2_answer9);

        Intent intent = new Intent(Lesson_10_grammar_2_practise.this, Lesson_10_grammar_2_results.class);

        intent.putExtra("L10G2A0", l10_g2_answer0.getText().toString());
        intent.putExtra("L10G2A1", l10_g2_answer1.getText().toString());
        intent.putExtra("L10G2A2", l10_g2_answer2.getText().toString());
        intent.putExtra("L10G2A3", l10_g2_answer3.getText().toString());
        intent.putExtra("L10G2A4", l10_g2_answer4.getText().toString());
        intent.putExtra("L10G2A5", l10_g2_answer5.getText().toString());
        intent.putExtra("L10G2A6", l10_g2_answer6.getText().toString());
        intent.putExtra("L10G2A7", l10_g2_answer7.getText().toString());
        intent.putExtra("L10G2A8", l10_g2_answer8.getText().toString());
        intent.putExtra("L10G2A9", l10_g2_answer9.getText().toString());


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
