package com.example.quiz3uniclubz;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface ModelDao {
    @Insert
    void insert(Model model);

    @Update
    void update(Model model);

    @Delete
    void delete(Model model);

    @Query("DELETE FROM student_table")
    void deleteAllModels();

    @Query("SELECT * FROM student_table ORDER BY priority DESC")
    LiveData<List<Model>> getAllNotes();


}
