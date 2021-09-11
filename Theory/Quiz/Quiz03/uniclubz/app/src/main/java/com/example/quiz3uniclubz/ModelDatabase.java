package com.example.quiz3uniclubz;


import android.content.Context;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

@Database(entities = {Model.class}, version = 1)

public  abstract class ModelDatabase extends RoomDatabase {

    private static ModelDatabase instance;

    public abstract ModelDao modelDao();

    public static synchronized ModelDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    ModelDatabase.class, "modeldata_database")
                    .fallbackToDestructiveMigration()
                    .addCallback(roomCallback)
                    .build();
        }
        return instance;
    }



    private static RoomDatabase.Callback roomCallback = new RoomDatabase.Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
            new PopulateDbAsyncTask(instance).execute();
        }
    };


    private static class PopulateDbAsyncTask extends AsyncTask<Void, Void, Void> {
        private ModelDao modelDao;

        private PopulateDbAsyncTask(ModelDatabase db) {
         modelDao = db.modelDao();
        }



        @Override
        protected Void doInBackground(Void... voids) {
            modelDao.insert(new Model("Title 1", "Description 1", "1"));
            modelDao.insert(new Model("Title 2", "Description 2", "2"));
            modelDao.insert(new Model("Title 3", "Description 3", "3"));
            return null;
        }
    }


}
