package com.popkova.russianlanguageapp.Lesson2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.SimpleExpandableListAdapter;

import com.popkova.russianlanguageapp.MainActivity;
import com.popkova.russianlanguageapp.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Lesson_2 extends AppCompatActivity {

    private String[] mGroupsArray = new String[]{"Vocabulary", "Grammar"};
    private String[] mVocabulary = new String[]{"Моя семья|My Family", "Национальности|Nationalities", "Знакомство|Meeting People"};
    private String[] mGrammar = new String[]{"Личные местоимения|Personal Pronoun", "Притяжательные местоимения|Possessive Pronouns"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_2);
        setTitle("Моя семья");


        Map<String, String> map;
        ArrayList<Map<String, String>> groupDataList = new ArrayList<>();
        for (String group : mGroupsArray) {
            map = new HashMap<>();
            map.put("groupName", group);
            groupDataList.add(map);
        }

        String groupFrom[] = new String[]{"groupName"};
        // список ID view-элементов, в которые будет помещены атрибуты групп
        int groupTo[] = new int[]{android.R.id.text1};

        // создаем общую коллекцию для коллекций элементов
        ArrayList<ArrayList<Map<String, String>>> сhildDataList = new ArrayList<>();

        // в итоге получится сhildDataList = ArrayList<сhildDataItemList>

        // создаем коллекцию элементов для первой группы
        ArrayList<Map<String, String>> сhildDataItemList = new ArrayList<>();
        // заполняем список атрибутов для каждого элемента
        for (String vocabulary : mVocabulary) {
            map = new HashMap<>();
            map.put("Grammar", vocabulary); // название
            сhildDataItemList.add(map);
        }
        // добавляем в коллекцию коллекций
        сhildDataList.add(сhildDataItemList);


        // создаем коллекцию элементов для второй группы
        сhildDataItemList = new ArrayList<>();
        for (String grammar : mGrammar) {
            map = new HashMap<>();
            map.put("Grammar", grammar);
            сhildDataItemList.add(map);
        }
        сhildDataList.add(сhildDataItemList);


        // список атрибутов элементов для чтения
        String childFrom[] = new String[]{"Grammar"};
        // список ID view-элементов, в которые будет помещены атрибуты
        // элементов
        int childTo[] = new int[]{android.R.id.text1};

        SimpleExpandableListAdapter adapter = new SimpleExpandableListAdapter(
                this, groupDataList,
                android.R.layout.simple_expandable_list_item_1, groupFrom,
                groupTo, сhildDataList, android.R.layout.simple_list_item_1,
                childFrom, childTo);

        ExpandableListView expandableListView = (ExpandableListView) findViewById(R.id.expListView);
        expandableListView.setAdapter(adapter);

        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                if (groupPosition == 0 && childPosition == 0) {
                    Intent intent = new Intent(Lesson_2.this, Lesson_2_vocabulary_1.class);
                    startActivity(intent);
                }
                if (groupPosition == 0 && childPosition == 1) {
                    Intent intent = new Intent(Lesson_2.this, Lesson_2_vocabulary_2.class);
                    startActivity(intent);
                }
                if (groupPosition == 0 && childPosition == 2) {
                    Intent intent = new Intent(Lesson_2.this, Lesson_2_vocabulary_3.class);
                    startActivity(intent);
                }
                if (groupPosition == 1 && childPosition == 0) {
                    Intent intent = new Intent(Lesson_2.this, Lesson_2_grammar_1.class);
                    startActivity(intent);
                }
                if (groupPosition == 1 && childPosition == 1) {
                    Intent intent = new Intent(Lesson_2.this, Lesson_2_grammar_2.class);
                    startActivity(intent);
                }
                return false;
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
