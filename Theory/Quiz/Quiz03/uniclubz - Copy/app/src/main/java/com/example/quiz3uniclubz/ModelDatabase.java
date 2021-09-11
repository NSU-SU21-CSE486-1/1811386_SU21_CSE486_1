package com.example.quiz3uniclubz;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
@Database(entities = {Model.class},version = 1)
public abstract class ModelDatabase extends RoomDatabase {

    private static ModelDatabase instance;

    public abstract ModelDao modelDao();

    public static synchronized ModelDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    ModelDatabase.class, "model_databas")
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instance;
    }
}