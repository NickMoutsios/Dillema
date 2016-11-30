package com.example.dillemas;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class DisplayGameActivity extends AppCompatActivity {

    private Intent intent;
    private TextView dillemaTextView,scoreTextView, firstAnswerTextView, secondAnswerTextView;
    private Button nextButton;
    private String passedCategory;
    private Populating popObj = new Populating();
    private String[] categoriesList,dillemaArray,answersArray;
    private Integer[] checkArray;
    private InputStream streamForDillema, streamForAnswers;
    private BufferedReader readerForDillema, readerForAnswers;
    private ArrayList<String> dillemaList = new ArrayList<>();
    private ArrayList<String> answersList = new ArrayList<>();
    private int currentDillemaQuestion;
    private int score = 0;
    private HashMap<String, String> hashMapForAnswer1, hashMapForAnswer2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_game);

        intent = getIntent();
        passedCategory = intent.getStringExtra(DisplayOptionsActivity.PASS_THE_CATEGORY);
        categoriesList = popObj.getCategories();
        populateIds();
        pickRightCategory();
    }

    private void populateIds() {
        dillemaTextView = (TextView) findViewById(R.id.dillemaTextView);
        scoreTextView = (TextView) findViewById(R.id.numberOfDillTextView);
        firstAnswerTextView = (TextView) findViewById(R.id.firstAnswerTextView);
        secondAnswerTextView = (TextView) findViewById(R.id.secondAnswerTextView);
        nextButton = (Button) findViewById(R.id.nextDillemaButton);
    }

    private void pickRightCategory() {
        //Picking the right category and opening the right .txt file
        //to fill the dillemaArray with the chosen dillemas

        if (passedCategory.equals(categoriesList[0])) {
            try {
                streamForDillema = getAssets().open("Asteia.txt");
                readerForDillema = new BufferedReader(new InputStreamReader(streamForDillema));
                streamForAnswers = getAssets().open("AsteiaAnswers.txt");
                readerForAnswers = new BufferedReader(new InputStreamReader(streamForAnswers));
                String dillema, answers;
                try {
                    while ((dillema = readerForDillema.readLine()) != null) {
                        dillemaList.add(dillema);
                    }
                    while ((answers = readerForAnswers.readLine()) != null) {
                        answersList.add(answers);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        streamForDillema.close();
                        streamForAnswers.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            initializeDillemaAndAnswers();

        } else if (passedCategory.equals(categoriesList[1])) {
            try {
                streamForDillema = getAssets().open("Diafora.txt");
                readerForDillema = new BufferedReader(new InputStreamReader(streamForDillema));
                streamForAnswers = getAssets().open("DiaforaAnswers.txt");
                readerForAnswers = new BufferedReader(new InputStreamReader(streamForAnswers));
                String dillema, answers;
                try {
                    while ((dillema = readerForDillema.readLine()) != null) {
                        dillemaList.add(dillema);
                    }
                    while ((answers = readerForAnswers.readLine()) != null) {
                        answersList.add(answers);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        streamForDillema.close();
                        streamForAnswers.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            initializeDillemaAndAnswers();
        } else if (passedCategory.equals(categoriesList[2])) {
            try {
                streamForDillema = getAssets().open("Perierga.txt");
                readerForDillema = new BufferedReader(new InputStreamReader(streamForDillema));
                streamForAnswers = getAssets().open("PeriergaAnswers.txt");
                readerForAnswers = new BufferedReader(new InputStreamReader(streamForAnswers));
                String dillema, answers;
                try {
                    while ((dillema = readerForDillema.readLine()) != null) {
                        dillemaList.add(dillema);
                    }
                    while ((answers = readerForAnswers.readLine()) != null) {
                        answersList.add(answers);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        streamForDillema.close();
                        streamForAnswers.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            initializeDillemaAndAnswers();
        } else if (passedCategory.equals(categoriesList[3])) {
            try {
                streamForDillema = getAssets().open("Thanatou.txt");
                readerForDillema = new BufferedReader(new InputStreamReader(streamForDillema));
                streamForAnswers = getAssets().open("ThanatouAnswers.txt");
                readerForAnswers = new BufferedReader(new InputStreamReader(streamForAnswers));
                String dillema, answers;
                try {
                    while ((dillema = readerForDillema.readLine()) != null) {
                        dillemaList.add(dillema);
                    }
                    while ((answers = readerForAnswers.readLine()) != null) {
                        answersList.add(answers);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        streamForDillema.close();
                        streamForAnswers.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            initializeDillemaAndAnswers();
        } else {
            try {
                streamForDillema = getAssets().open("Avola.txt");
                readerForDillema = new BufferedReader(new InputStreamReader(streamForDillema));
                streamForAnswers = getAssets().open("AvolaAnswers.txt");
                readerForAnswers = new BufferedReader(new InputStreamReader(streamForAnswers));
                String dillema, answers;
                try {
                    while ((dillema = readerForDillema.readLine()) != null) {
                        dillemaList.add(dillema);
                    }
                    while ((answers = readerForAnswers.readLine()) != null) {
                        answersList.add(answers);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        streamForDillema.close();
                        streamForAnswers.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            initializeDillemaAndAnswers();
        }
    }

    public void nextDillema(View view) {
        if(score < dillemaArray.length){scoreUpdate();}
        currentDillemaAndAnswersUpdate();
    }

    public void goBackToCategories(View view) {
        this.finish();
    }

    private void scoreUpdate() {
        score++;
        scoreTextView.setText(score+"");
    }

    private void currentDillemaAndAnswersUpdate() {
        currentDillemaQuestion++;
        if(currentDillemaQuestion == dillemaArray.length) {
            nextButton.setClickable(false);
            nextButton.setEnabled(false);
            nextButton.getBackground().setColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY);
        }
        try {
            dillemaTextView.setText(dillemaArray[currentDillemaQuestion]);
            firstAnswerTextView.setText(hashMapForAnswer1.get(dillemaArray[currentDillemaQuestion]));
            secondAnswerTextView.setText(hashMapForAnswer2.get(dillemaArray[currentDillemaQuestion]));
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    private void initializeDillemaAndAnswers() {

        currentDillemaQuestion = 0;
        dillemaArray = dillemaList.toArray(new String[0]);
        answersArray = answersList.toArray(new String[0]);
        hashMapForAnswer1 = new HashMap<>();
        hashMapForAnswer2 = new HashMap<>();
        int j =0;
        for(int i =0;i<dillemaArray.length;i++) {
            hashMapForAnswer1.put(dillemaArray[i],answersArray[j]);
            hashMapForAnswer2.put(dillemaArray[i],answersArray[j+1]);
            j+=2;
        }
        Collections.shuffle(dillemaList);
        dillemaArray = dillemaList.toArray(new String[0]);
        dillemaTextView.setText(dillemaArray[currentDillemaQuestion]);
        firstAnswerTextView.setText(hashMapForAnswer1.get(dillemaArray[currentDillemaQuestion]));
        secondAnswerTextView.setText(hashMapForAnswer2.get(dillemaArray[currentDillemaQuestion]));
    }

    }
