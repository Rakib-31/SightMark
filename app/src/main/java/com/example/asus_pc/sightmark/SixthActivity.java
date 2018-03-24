package com.example.asus_pc.sightmark;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SixthActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText url,name;
    Button button;
    DatabaseStore myDatabaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);

        url = (EditText) findViewById(R.id.URL);
        name = (EditText) findViewById(R.id.name);
        button = (Button) findViewById(R.id.button);

        myDatabaseHelper = new DatabaseStore(this);
        SQLiteDatabase sqLiteDatabase = myDatabaseHelper.getWritableDatabase();

        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(!validity()){
            String string = url.getText().toString().trim();
            String str = name.getText().toString().trim();

            myDatabaseHelper.insertData(str,string);

            url.setText("");
            name.setText("");

            Intent inten = new Intent(SixthActivity.this, FifthActivity.class);
            startActivity(inten);
        }
    }

    private boolean validity()
    {
        if(url.getText().toString().trim().length() <= 0)
        {
            Toast.makeText(SixthActivity.this,"Enter url",Toast.LENGTH_LONG).show();
            return true;
        }

        else if(name.getText().toString().trim().length() <= 0)
        {
            Toast.makeText(SixthActivity.this,"Enter app name",Toast.LENGTH_LONG).show();
            return true;
        }

        else
            return false;
    }

}
