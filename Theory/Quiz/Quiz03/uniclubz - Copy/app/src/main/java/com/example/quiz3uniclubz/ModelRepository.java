package com.example.quiz3uniclubz;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import java.util.List;

public class ModelRepository {
    private ModelDao modelDao;
  private LiveData<List<Model>> allmodel;


    public ModelRepository(Application application) {
       ModelDatabase database = ModelDatabase.getInstance(application);
        modelDao = database.modelDao();
        allmodel =modelDao.getAllNotes();
    }


    public void insert(Model model) {
        new InsertModelAsyncTask(modelDao).execute(model);
    }

    public void update(Model model) {
        new UpdateModelAsyncTask(modelDao).execute(model);
    }

    public void delete(Model model) {
        new DeleteModelAsyncTask(modelDao).execute(model);
    }

    public void deleteAllNotes() {
        new DeleteAllModelsAsyncTask(modelDao).execute();
    }

    public LiveData<List<Model>> getAllNotes() {
        return allmodel;
    }


    private static class InsertModelAsyncTask extends AsyncTask<Model, Void, Void> {
        private ModelDao modelDao;

        private InsertModelAsyncTask(ModelDao modelDao) {
            this.modelDao = modelDao;
        }


        @Override
        protected Void doInBackground(Model... models) {
            modelDao.insert(models[0]);
            return null;
        }

    }

    private static class UpdateModelAsyncTask extends AsyncTask<Model, Void, Void> {
        private ModelDao modelDao;

        private UpdateModelAsyncTask(ModelDao modelDao) {
            this.modelDao = modelDao;
        }


        @Override
        protected Void doInBackground(Model... models) {
            modelDao.update(models[0]);
            return null;
        }

    }



    private static class DeleteModelAsyncTask extends AsyncTask<Model, Void, Void> {
        private ModelDao modelDao;

        private DeleteModelAsyncTask(ModelDao modelDao) {
            this.modelDao = modelDao;
        }


        @Override
        protected Void doInBackground(Model... models) {
            modelDao.delete(models[0]);
            return null;
        }
    }

        private static class DeleteAllModelsAsyncTask extends AsyncTask<Model, Void, Void> {
            private ModelDao modelDao;

            private DeleteAllModelsAsyncTask(ModelDao modelDao) {
                this.modelDao = modelDao;
            }


            @Override
            protected Void doInBackground(Model... models) {
                modelDao.deleteAllNotes();
                return null;
            }
    }


















}
