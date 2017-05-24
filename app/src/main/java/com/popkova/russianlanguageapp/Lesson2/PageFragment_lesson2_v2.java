package com.popkova.russianlanguageapp.Lesson2;

import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.popkova.russianlanguageapp.R;

import java.io.IOException;

/**
 * Created by User on 30.04.2017.
 */

public class PageFragment_lesson2_v2 extends Fragment{
    private SoundPool mSoundPool;
    private AssetManager mAssetManager;
    private int mStreamID;
    private int mSound;
    private String songName;
    private float rightVolume= 0.5f;
    private float leftVolume= 0.5f;


    static final String ARGUMENT_PAGE_NUMBER = "arg_page_number";

    String [] Examples = {"﻿Америка – американец, американка, американцы",
            "Канада – канадец, канадка, канадцы",
            "Мексика – мексиканец, мексиканка, мексиканцы",
            "Япония – японец, японка, японцы",
            "Испания – испанец, испанка, испанцы",
            "Италия – итальянец, итальянка, итальянцы ",
            "Германия – немец, немка, немцы",
            "Англия – англичанин, англичанка, англичане",
            "Россия – русский, русская, русские "
    };

    String [] Examples_translation = {
            "America – American (m, f, Pl)",
            "Canada – Canadian (m, f, Pl)",
            "Mexico – Mexican (m, f, Pl)",
            "Japan – Japanese (m, f, Pl)",
            "Spain – Spanish (m, f, Pl)",
            "Italy – Italian (m, f, Pl)",
            "Germany – German (m, f, Pl) ",
            "England – English (m, f, Pl)",
            "Russia – Russian (m, f, Pl)"
    };
    int [] images = {
            R.drawable.l2_2_1,
            R.drawable.l2_2_2,
            R.drawable.l2_2_3,
            R.drawable.l2_2_4,
            R.drawable.l2_2_5,
            R.drawable.l2_2_6,
            R.drawable.l2_2_7,
            R.drawable.l2_2_8,
            R.drawable.l2_2_9

    };



    int pageNumber;

    public static PageFragment_lesson2_v2 newInstance(int page) {
        PageFragment_lesson2_v2 pageFragment = new PageFragment_lesson2_v2();
        Bundle arguments = new Bundle();
        arguments.putInt(ARGUMENT_PAGE_NUMBER, page);
        pageFragment.setArguments(arguments);
        return pageFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageNumber = getArguments().getInt(ARGUMENT_PAGE_NUMBER);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.lesson_1_vocabulary_1_fragment, null);

        ImageButton sound = (ImageButton)view.findViewById(R.id.sound);
        sound.setOnClickListener(onClickListener);

        TextView tvPage = (TextView) view.findViewById(R.id.tvPage);
        TextView tvPage_translate = (TextView) view.findViewById(R.id.tvPage_translate);
        ImageView image = (ImageView) view.findViewById(R.id.photo);
        tvPage.setText(Examples[pageNumber]);
        tvPage_translate.setText(Examples_translation[pageNumber]);
        image.setImageResource(images[pageNumber]);

        return view;
    }
    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.sound:
                    playSound(mSound);
                    break;
            }
        }
    };

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    private void createNewSoundPool() {
        AudioAttributes attributes = new AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_GAME)
                .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                .build();
        mSoundPool = new SoundPool.Builder()
                .setAudioAttributes(attributes)
                .build();
    }

    @SuppressWarnings("deprecation")
    private void createOldSoundPool() {
        mSoundPool = new SoundPool(3, AudioManager.STREAM_MUSIC, 0);
    }

    private int playSound(int sound) {
        if (sound > 0) {
            mStreamID = mSoundPool.play(sound, leftVolume, rightVolume, 1, 0, 1);
        }
        return mStreamID;
    }

    private int loadSound(String fileName) {
        AssetFileDescriptor afd;
        try {
            afd = mAssetManager.openFd(fileName);
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
        return mSoundPool.load(afd, 1);
    }

    @Override
    public void onResume() {
        super.onResume();


        if (android.os.Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
            // Для устройств до Android 5
            createOldSoundPool();
        } else {
            // Для новых устройств
            createNewSoundPool();
        }

        mAssetManager = getContext().getAssets();

        songName = "lesson2_2/" + pageNumber + ".m4a";
        mSound = loadSound(songName);
    }

    @Override
    public void onPause() {
        super.onPause();
        mSoundPool.release();
        mSoundPool = null;
    }
}
