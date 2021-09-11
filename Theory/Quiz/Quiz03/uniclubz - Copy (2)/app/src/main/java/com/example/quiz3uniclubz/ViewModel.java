package com.example.quiz3uniclubz;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class ViewModel extends AndroidViewModel {
    private ModelRepository modelRepository;
    private LiveData<List<Model>> allmodels;

    public ViewModel(@NonNull Application application) {
        super(application);
        modelRepository = new ModelRepository(application);
        allmodels = modelRepository.getAllNotes();
    }

    public void insert(Model model) {
        modelRepository.insert(model);
    }

    public void update(Model model) {
        modelRepository.update(model);
    }

    public void delete(Model model) {
        modelRepository.delete(model);
    }

    public void deleteallmodels() {
        modelRepository.deleteAllModels();
    }

    public LiveData<List<Model>> getAllNotes() {
        return allmodels;
    }


}
