package com.example.quiz3uniclubz;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.lifecycle.ComputableLiveData;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.InvalidationTracker.Observer;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@SuppressWarnings("unchecked")
public final class ModelDao_Impl implements ModelDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfModel;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfModel;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfModel;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllModels;

  public ModelDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfModel = new EntityInsertionAdapter<Model>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `student_table`(`id`,`name`,`nid`,`priority`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Model value) {
        stmt.bindLong(1, value.id);
        if (value.name == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.name);
        }
        if (value.nid == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.nid);
        }
        if (value.priority == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.priority);
        }
      }
    };
    this.__deletionAdapterOfModel = new EntityDeletionOrUpdateAdapter<Model>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `student_table` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Model value) {
        stmt.bindLong(1, value.id);
      }
    };
    this.__updateAdapterOfModel = new EntityDeletionOrUpdateAdapter<Model>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `student_table` SET `id` = ?,`name` = ?,`nid` = ?,`priority` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Model value) {
        stmt.bindLong(1, value.id);
        if (value.name == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.name);
        }
        if (value.nid == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.nid);
        }
        if (value.priority == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.priority);
        }
        stmt.bindLong(5, value.id);
      }
    };
    this.__preparedStmtOfDeleteAllModels = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM student_table";
        return _query;
      }
    };
  }

  @Override
  public void insert(Model model) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfModel.insert(model);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(Model model) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfModel.handle(model);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(Model model) {
    __db.beginTransaction();
    try {
      __updateAdapterOfModel.handle(model);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAllModels() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllModels.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAllModels.release(_stmt);
    }
  }

  @Override
  public LiveData<List<Model>> getAllNotes() {
    final String _sql = "SELECT * FROM student_table ORDER BY priority DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new ComputableLiveData<List<Model>>(__db.getQueryExecutor()) {
      private Observer _observer;

      @Override
      protected List<Model> compute() {
        if (_observer == null) {
          _observer = new Observer("student_table") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
          final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
          final int _cursorIndexOfNid = _cursor.getColumnIndexOrThrow("nid");
          final int _cursorIndexOfPriority = _cursor.getColumnIndexOrThrow("priority");
          final List<Model> _result = new ArrayList<Model>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Model _item;
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpNid;
            _tmpNid = _cursor.getString(_cursorIndexOfNid);
            final String _tmpPriority;
            _tmpPriority = _cursor.getString(_cursorIndexOfPriority);
            _item = new Model(_tmpName,_tmpNid,_tmpPriority);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    }.getLiveData();
  }
}
