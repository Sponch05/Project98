package za.co.sponchware.www.connectedyouth.dummy;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
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

    //user credential database
    public static final String TABLE_DATABASE ="Crowed Funding";
    public static final String COLUMN_ID="Project ID";
    public static final String COLUMN_NAME="Project Name";
    public static final String COLUMN_DESCRIPTION="Project Description";
    public static final String COLUMN_FUNDS="Amount";

    //Creating database SQL statements
    private static final String LOCATION_TABLE_CREATE ="create table"
            +TABLE_DATABASE +"("+COLUMN_ID
            +"integrity primary key autoincrement,"+ COLUMN_ID
            +"text not null,"+ COLUMN_NAME
            +"text not null,"+COLUMN_DESCRIPTION
            +"text not null,"+COLUMN_FUNDS
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
    public boolean insertDatat(String User_ID, String Full_Names, String Project_Description, double Amount)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(COLUMN_NAME,Full_Names);
        contentValues.put(COLUMN_DESCRIPTION,Project_Description);
        contentValues.put(COLUMN_FUNDS,Amount);

        long result = db.insert(TABLE_DATABASE,null, contentValues);
        if(result ==-1)
            return false;
        else
            return true;

    }
    //SQL statements
    public Cursor getAllData()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from"+TABLE_DATABASE,null);
        return res;
    }
    public boolean updateData(String User_ID, String Full_Names, String Project_Description, double Amount)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(COLUMN_NAME,Full_Names);
        contentValues.put(COLUMN_DESCRIPTION,Project_Description);
        contentValues.put(COLUMN_FUNDS,Amount);

        long result = db.insert(TABLE_DATABASE,null, contentValues);
        if(result ==-1)
            return false;
        else
            return true;
    }
    //Deleting values from database
    public Integer deleteData(String User_ID)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_DATABASE,"User_ID=?", new String[] {});

    }
}
