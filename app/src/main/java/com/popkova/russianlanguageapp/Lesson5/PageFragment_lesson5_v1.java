package com.popkova.russianlanguageapp.Lesson5;

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
 * Created by User on 23.04.2017.
 */

public class PageFragment_lesson5_v1 extends Fragment {
    private SoundPool mSoundPool;
    private AssetManager mAssetManager;
    private int mStreamID;
    private int mSound;
    private String songName;
    private float rightVolume= 1;
    private float leftVolume= 1;

    static final String ARGUMENT_PAGE_NUMBER = "arg_page_number";
    String [] Examples = {
            "Европа",
            "Азия",
            "Африка",
            "Австралия ",
            "Южная Америка ",
            "Северная Америка",
            "север",
            "юг",
            "запад",
            "восток ",
            "страна",
            "самолет",
            "поезд",
            "корабль ",
            "путешествие ",
            "билет ",
            "паспорт ",
            "рейс "
    };

    String [] Examples_translation = {
            "Europe",
            "Asia ",
            "Africa",
            "Australia",
            "South America",
            "North America ",
            "North ",
            "South",
            "West",
            "East",
            "country",
            "plane",
            "train",
            "ship ",
            "trip ",
            "ticket",
            "passport ",
            "flight "
    };

    int [] images = {
            R.drawable.l5_1,
            R.drawable.l5_2,
            R.drawable.l5_3,
            R.drawable.l5_4,
            R.drawable.l5_5,
            R.drawable.l5_6,
            R.drawable.l5_7,
            R.drawable.l5_8,
            R.drawable.l5_9,
            R.drawable.l5_10,
            R.drawable.l5_11,
            R.drawable.l5_12,
            R.drawable.l5_13,
            R.drawable.l5_14,
            R.drawable.l5_15,
            R.drawable.l5_16,
            R.drawable.l5_17,
            R.drawable.l5_18,
    };



    int pageNumber;

    public static PageFragment_lesson5_v1 newInstance(int page) {
        PageFragment_lesson5_v1 pageFragment = new PageFragment_lesson5_v1();
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

        songName = "lesson5/" + pageNumber + ".m4a";
        mSound = loadSound(songName);
    }

    @Override
    public void onPause() {
        super.onPause();
        mSoundPool.release();
        mSoundPool = null;
    }

}
