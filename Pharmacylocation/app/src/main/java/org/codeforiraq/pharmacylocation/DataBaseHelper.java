package org.codeforiraq.pharmacylocation;

/**
 * Created by Abbas on 02/09/2018.
 */
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;


public class DataBaseHelper extends SQLiteOpenHelper {

    private static final int DataBaseVersion = 1;
    private static final String DatabaseName = "MyDatabase";
    //table
    private static final String TableName = "LocationInfoTable";
    private static final String KeyID = "id";
    private static final String KeyPlaceName = "PlaceName";
    private static final String KeyPlaceCity = "PlaceCity";
    private static final String Keylongitude = "Keylongitude";
    private static final String Keylatitude = "Keylatitude";

    public DataBaseHelper(Context context) {
        super(context, DatabaseName, null, DataBaseVersion);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE = "create table "
                + TableName + " ("
                + KeyID + " integer primary key  autoincrement , "
                + KeyPlaceName + " TEXT, "
                + KeyPlaceCity + " TEXT, "
                + Keylongitude + " TEXT, "
                + Keylatitude + " TEXT " + ")";

        db.execSQL(CREATE_TABLE);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists " + TableName);

        onCreate(db);
    }

    public void InsertLocation(LocationInfo info) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KeyPlaceName, info.getPlaceName());
        values.put(KeyPlaceCity, info.getPlaceCity());
        values.put(Keylongitude, info.getLongitude());
        values.put(Keylatitude, info.getLatitude());
        db.insert(TableName, null, values);
        db.close();
    }



    public int UpdateLocation(LocationInfo info) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KeyPlaceName, info.getPlaceName());
        values.put(KeyPlaceCity, info.getPlaceCity());
        values.put(Keylongitude, info.getLongitude());
        values.put(Keylatitude, info.getLatitude());
        return db.update(TableName, values, KeyID + " =?", new String[]{String.valueOf(info.getID())});
    }

    public void LocationDelete(LocationInfo info) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TableName, KeyID + " =?", new String[]{String.valueOf(info.getID())});
        db.close();
    }


    public LocationInfo GetLocation(int ID) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(TableName, new String[]{KeyID, KeyPlaceName, KeyPlaceCity, Keylongitude, Keylatitude}, KeyID + " =?", new String[]{String.valueOf(ID)}, null, null, null, null);
        if (cursor != null) {
            cursor.moveToFirst();
        }
        return new LocationInfo(cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4));
    }



    public List<LocationInfo> GetAllLocation() {
        List<LocationInfo> locationInfos = new ArrayList<>();
        String SelectQuery = "Select * from " + TableName;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(SelectQuery, null);
        if (cursor.moveToFirst()) {
            do {
                LocationInfo locationInfo = new LocationInfo();
                locationInfo.setPlaceName(cursor.getString(1));
                locationInfo.setPlaceCity(cursor.getString(2));
                locationInfo.setLongitude(cursor.getString(3));
                locationInfo.setLatitude(cursor.getString(4));
                locationInfos.add(locationInfo);
            }
            while (cursor.moveToNext());

        }
        return locationInfos;
    }
}
