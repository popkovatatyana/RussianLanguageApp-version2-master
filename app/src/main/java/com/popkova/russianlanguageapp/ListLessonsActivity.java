package com.popkova.russianlanguageapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
            "Давайте познакомимся!Род, число, падеж",
            "Моя семья",
            "Мир вокруг",
            "Город",
            "Путешествия",
            "Профессии",
            "Мой день",
            "Хобби",
            "Покупки",
            "Праздники"
    } ;

    Integer[] imageId = {
            R.drawable.l1_1,
            R.drawable.l2_1,
            R.drawable.l3_1,
            R.drawable.l3_1,
            R.drawable.l3_1,
            R.drawable.l3_1,
            R.drawable.l3_1,
            R.drawable.l3_1,
            R.drawable.l3_1,
            R.drawable.l3_1
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
//                if (position == 0){
//                    Intent intent = new Intent( ListLessonsActivity.this, Lesson_1.class);
//                    startActivity(intent);
//                }
//                if (position == 1){
//                    Intent intent = new Intent( ListLessonsActivity.this, Lesson_2.class);
//                    startActivity(intent);
//                }
//                if (position == 2){
//                    Intent intent = new Intent( ListLessonsActivity.this, Lesson_3.class);
//                    startActivity(intent);
//                }
//                if (position == 3){
//                    Intent intent = new Intent( ListLessonsActivity.this, Lesson_4.class);
//                    startActivity(intent);
//                }
//                if (position == 4){
//                    Intent intent = new Intent( ListLessonsActivity.this, Lesson_5.class);
//                    startActivity(intent);
//                }
//                if (position == 5){
//                    Intent intent = new Intent( ListLessonsActivity.this, Lesson_6.class);
//                    startActivity(intent);
//                }
//                if (position == 6){
//                    Intent intent = new Intent( ListLessonsActivity.this, Lesson_7.class);
//                    startActivity(intent);
//                }
//                if (position == 7){
//                    Intent intent = new Intent( ListLessonsActivity.this, Lesson_8.class);
//                    startActivity(intent);
//                }
//                if (position == 8){
//                    Intent intent = new Intent( ListLessonsActivity.this, Lesson_9.class);
//                    startActivity(intent);
//                }
//                if (position == 9){
//                    Intent intent = new Intent( ListLessonsActivity.this, Lesson_10.class);
//                    startActivity(intent);
//                }

            }
        });
    }
}
