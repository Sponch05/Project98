package za.co.sponchware.www.connectedyouth.dummy;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static android.R.attr.version;

/**
 * Created by Mothupii_ on 2017-08-26.
 */

public class DatabaseHelper extends SQLiteOpenHelper
{
    //Database Content
    private static final String DATABASE_NAME="DatabaseContent.db";
    private static final int DATABASE_VERSION =1;

    public static final String TABLE_DATABASE ="User Information";
    public static final String COLUMN_ID="User_ID";
    public static final String COLUMN_NAME="Full Name/s";
    public static final String COLUMN_EMAIL="Email Adress";
    public static final String COLUMN_INTRESTS="Interests";

    //Creating database SQL statements
    private static final String LOCATION_TABLE_CREATE ="create table"
            +TABLE_DATABASE +"("+COLUMN_ID
            +"integrity primary key autoincrement,"+ COLUMN_ID
            +"text not null,"+ COLUMN_NAME
            +"text not null,"+COLUMN_INTRESTS
            +"text not null,"+COLUMN_EMAIL
            +"integer)";
    public DatabaseHelper(Context context)
    {
      super (context,DATABASE_NAME, null, DATABASE_VERSION);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase)
    {
        SQLiteDatabase db = null;
        db.execSQL("create table" + TABLE_DATABASE+"(USER_ID INTEGER PRIMARY KEY AUTOINCREMENT, FULL NAMES TEXT, EMAIL ADDRESS TEXT, CAREER TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1)
    {
        //Updating database
        SQLiteDatabase db = null;
        db.execSQL("Drop table if exist"+TABLE_DATABASE);
        onCreate(db);
    }

    //Insert Data
    public boolean insertDatat(String User_ID, String Full_Names, String Email, String Interests)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(COLUMN_NAME,Full_Names);
        contentValues.put(COLUMN_EMAIL,Email);
        contentValues.put(COLUMN_INTRESTS,Interests);

        long result = db.insert(TABLE_DATABASE,null, contentValues);
        if(result ==-1)
            return false;
        else
            return true;

    }
}
