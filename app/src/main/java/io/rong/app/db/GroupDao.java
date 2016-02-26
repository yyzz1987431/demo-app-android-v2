package io.rong.app.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;


// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * DAO for table GROUP.
*/
public class GroupDao extends AbstractDao<Group, String> {

    public static final String TABLENAME = "GROUP";

    /**
     * Properties of entity Group.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property GroupId = new Property(0, String.class, "groupId", true, "GROUP_ID");
        public final static Property Name = new Property(1, String.class, "name", false, "NAME");
        public final static Property PortraitUri = new Property(2, String.class, "portraitUri", false, "PORTRAIT_URI");
        public final static Property DisplayName = new Property(3, String.class, "displayName", false, "DISPLAY_NAME");
        public final static Property Role = new Property(4, String.class, "role", false, "ROLE");
        public final static Property Timestamp = new Property(5, Long.class, "timestamp", false, "TIMESTAMP");
    };


    public GroupDao(DaoConfig config) {
        super(config);
    }

    public GroupDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'GROUP' (" + //
                "'GROUP_ID' TEXT PRIMARY KEY NOT NULL ," + // 0: groupId
                "'NAME' TEXT," + // 1: name
                "'PORTRAIT_URI' TEXT," + // 2: portraitUri
                "'DISPLAY_NAME' TEXT," + // 3: displayName
                "'ROLE' TEXT," + // 4: role
                "'TIMESTAMP' INTEGER);"); // 5: timestamp
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'GROUP'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Group entity) {
        stmt.clearBindings();
        stmt.bindString(1, entity.getGroupId());

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

        String role = entity.getRole();
        if (role != null) {
            stmt.bindString(5, role);
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
    public Group readEntity(Cursor cursor, int offset) {
        Group entity = new Group( //
            cursor.getString(offset + 0), // groupId
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // name
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // portraitUri
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // displayName
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // role
            cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5) // timestamp
        );
        return entity;
    }

    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Group entity, int offset) {
        entity.setGroupId(cursor.getString(offset + 0));
        entity.setName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setPortraitUri(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setDisplayName(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setRole(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setTimestamp(cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5));
     }

    /** @inheritdoc */
    @Override
    protected String updateKeyAfterInsert(Group entity, long rowId) {
        return entity.getGroupId();
    }
    
    /** @inheritdoc */
    @Override
    public String getKey(Group entity) {
        if(entity != null) {
            return entity.getGroupId();
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