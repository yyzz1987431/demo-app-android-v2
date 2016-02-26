package io.rong.app.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;
import io.rong.app.db.DaoSession;


// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * DAO for table FRIEND.
*/
public class FriendDao extends AbstractDao<Friend, String> {

    public static final String TABLENAME = "FRIEND";

    /**
     * Properties of entity Friend.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property UserId = new Property(0, String.class, "userId", true, "USER_ID");
        public final static Property Name = new Property(1, String.class, "name", false, "NAME");
        public final static Property PortraitUri = new Property(2, String.class, "portraitUri", false, "PORTRAIT_URI");
        public final static Property DisplayName = new Property(3, String.class, "displayName", false, "DISPLAY_NAME");
        public final static Property Status = new Property(4, String.class, "status", false, "STATUS");
        public final static Property Timestamp = new Property(5, Long.class, "timestamp", false, "TIMESTAMP");
    };


    public FriendDao(DaoConfig config) {
        super(config);
    }
    
    public FriendDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'FRIEND' (" + //
                "'USER_ID' TEXT PRIMARY KEY NOT NULL ," + // 0: userId
                "'NAME' TEXT," + // 1: name
                "'PORTRAIT_URI' TEXT," + // 2: portraitUri
                "'DISPLAY_NAME' TEXT," + // 3: displayName
                "'STATUS' TEXT," + // 4: status
                "'TIMESTAMP' INTEGER);"); // 5: timestamp
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'FRIEND'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Friend entity) {
        stmt.clearBindings();
        stmt.bindString(1, entity.getUserId());
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
 
        String portraitUri = entity.getPortraitUri();
        if (portraitUri != null) {
            stmt.bindString(3, portraitUri);
        }
 
        String displayName = entity.getDisplayName();
        if (displayName != null) {
            stmt.bindString(4, displayName);
        }
 
        String status = entity.getStatus();
        if (status != null) {
            stmt.bindString(5, status);
        }
 
        Long timestamp = entity.getTimestamp();
        if (timestamp != null) {
            stmt.bindLong(6, timestamp);
        }
    }

    /** @inheritdoc */
    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.getString(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Friend readEntity(Cursor cursor, int offset) {
        Friend entity = new Friend( //
            cursor.getString(offset + 0), // userId
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // name
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // portraitUri
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // displayName
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // status
            cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5) // timestamp
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Friend entity, int offset) {
        entity.setUserId(cursor.getString(offset + 0));
        entity.setName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setPortraitUri(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setDisplayName(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setStatus(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setTimestamp(cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5));
     }
    
    /** @inheritdoc */
    @Override
    protected String updateKeyAfterInsert(Friend entity, long rowId) {
        return entity.getUserId();
    }
    
    /** @inheritdoc */
    @Override
    public String getKey(Friend entity) {
        if(entity != null) {
            return entity.getUserId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}