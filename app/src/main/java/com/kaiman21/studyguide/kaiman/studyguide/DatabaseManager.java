package com.kaiman21.studyguide.kaiman.studyguide;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Kaiman on 1/20/15.
 */
public class DatabaseManager extends SQLiteOpenHelper {

    DatabaseManager(Context context) {
        super(context, "questionBank.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase database) {
        String query = "CREATE TABLE " + "QuestionBank"
                + " (" + UID + "INTEGER PRIMARY KEY AUTOINCREMENT, " + "question" + "TEXT, "
                + "ans0" + " TEXT, " + "ans1" + " TEXT, " + "ans2" + " TEXT, " + "ans3" + " TEXT, "
                + "answer" + " TEXT, " + "category" + " TEXT, " + "explanation" + " TEXT, "
                + "correct" + " TEXT" + ")";
        database.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion) {
        String query = "DROP TABLE IF EXITS QUESTIONBANK";
        database.execSQL(query);
    }






    private static final String DATABASE_NAME = "questionBank.db";
    private static final String TABLE_NAME = "Question Bank";
    private static final int DATABASE_VERSION = 1;
    private static final String UID = "_id";
    private static final String QUESTION = "question";
    private static final String ANS0 = "ans0";
    private static final String ANS1 = "ans1";
    private static final String ANS2 = "ans2";
    private static final String ANS3 = "ans3";
    private static final String ANSWER = "answer";
    private static final String CATEGORY = "category";
    private static final String EXPLANATION = "explanation";
    private static final String CORRECT = "correct";
    private static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME
            + " (" + UID + "INTEGER PRIMARY KEY AUTOINCREMENT, " + QUESTION + "TEXT, "
            + ANS0 + " TEXT, " + ANS1 + " TEXT, " + ANS2 + " TEXT, " + ANS3 + " TEXT, "
            + ANSWER + " TEXT, " + CATEGORY + " TEXT, " + EXPLANATION + " TEXT, "
            + CORRECT + " TEXT" + ")";
    private static final String DROP_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;
}
