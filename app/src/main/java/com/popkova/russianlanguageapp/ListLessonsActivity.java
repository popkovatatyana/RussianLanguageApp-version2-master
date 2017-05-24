package com.popkova.russianlanguageapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.popkova.russianlanguageapp.Lesson1.Lesson_1;
import com.popkova.russianlanguageapp.Lesson10.Lesson_10;
import com.popkova.russianlanguageapp.Lesson2.Lesson_2;
import com.popkova.russianlanguageapp.Lesson3.Lesson_3;
import com.popkova.russianlanguageapp.Lesson4.Lesson_4;
import com.popkova.russianlanguageapp.Lesson5.Lesson_5;
import com.popkova.russianlanguageapp.Lesson6.Lesson_6;
import com.popkova.russianlanguageapp.Lesson7.Lesson_7;
import com.popkova.russianlanguageapp.Lesson8.Lesson_8;
import com.popkova.russianlanguageapp.Lesson9.Lesson_9;

public class ListLessonsActivity extends AppCompatActivity {
    ListView list;
    String[] web = {
            "Давайте познакомимся! \n Gender|Plural Number|Adjective agreement",
            "Моя семья\nPersonal Pronouns|Possessive Pronouns",
            "Мир вокруг\nPointing Things 'это' |Contrasting 'тот' and 'этот'|Talking about Languages",
            "Город\nPrepositional Case",
            "Путешествия\n Prepositions 'на','в','из'",
            "Профессии\nAccusative case",
            "Мой день\n Frequency Adverbs|Past Tense",
            "Хобби\nGenitive Case|Adverbs of Degree",
            "Покупки\nDative Case",
            "Праздники\nImpersonal Constructions"
    } ;

    Integer[] imageId = {
            R.drawable.l1_1,
            R.drawable.l2_14,
            R.drawable.l3_7,
            R.drawable.l4_13,
            R.drawable.l5_2,
            R.drawable.l6_13,
            R.drawable.l7_6,
            R.drawable.l8_8,
            R.drawable.l9_12,
            R.drawable.l10_8
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_lessons);
        LessonsAdapter adapter = new
                LessonsAdapter(ListLessonsActivity.this, web, imageId);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0){
                    Intent intent = new Intent( ListLessonsActivity.this, Lesson_1.class);
                    startActivity(intent);
                }
                if (position == 1){
                    Intent intent = new Intent( ListLessonsActivity.this, Lesson_2.class);
                    startActivity(intent);
                }
                if (position == 2){
                    Intent intent = new Intent( ListLessonsActivity.this, Lesson_3.class);
                    startActivity(intent);
                }
                if (position == 3){
                    Intent intent = new Intent( ListLessonsActivity.this, Lesson_4.class);
                    startActivity(intent);
                }
                if (position == 4){
                    Intent intent = new Intent( ListLessonsActivity.this, Lesson_5.class);
                    startActivity(intent);
                }
                if (position == 5){
                    Intent intent = new Intent( ListLessonsActivity.this, Lesson_6.class);
                    startActivity(intent);
                }
                if (position == 6){
                    Intent intent = new Intent( ListLessonsActivity.this, Lesson_7.class);
                    startActivity(intent);
                }
                if (position == 7){
                    Intent intent = new Intent( ListLessonsActivity.this, Lesson_8.class);
                    startActivity(intent);
                }
                if (position == 8){
                    Intent intent = new Intent( ListLessonsActivity.this, Lesson_9.class);
                    startActivity(intent);
                }
                if (position == 9){
                    Intent intent = new Intent( ListLessonsActivity.this, Lesson_10.class);
                    startActivity(intent);
                }

            }
        });
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
