package com.example.asus_pc.sightmark;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class FifthActivity extends AppCompatActivity implements View.OnClickListener{

    Button bt1,b24,b25,b26,b27,b28,b29,b30,b31,b32;
    ImageButton bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10;


    DatabaseStore loginHelper = new DatabaseStore(this);
    final static String[] string = new String[10];

    private static final String fbt24 = "button24";
    private static final String fbt25 = "button25";
    private static final String fbt26 = "button26";
    private static final String fbt27 = "button27";
    private static final String fbt28 = "button28";
    private static final String fbt29 = "button29";
    private static final String fbt30 = "button30";
    private static final String fbt31 = "button31";
    private static final String fbt32 = "button32";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        bt2 = (ImageButton) findViewById(R.id.button2);
        bt3 = (ImageButton) findViewById(R.id.button3);
        bt4 = (ImageButton) findViewById(R.id.button4);
        bt5 = (ImageButton) findViewById(R.id.button5);
        bt6 = (ImageButton) findViewById(R.id.button6);
        bt7 = (ImageButton) findViewById(R.id.button7);
        bt8 = (ImageButton) findViewById(R.id.button8);
        bt9 = (ImageButton) findViewById(R.id.button9);
        bt10 = (ImageButton) findViewById(R.id.button10);
        bt1 = (Button) findViewById(R.id.button1);
        b24 = (Button) findViewById(R.id.button24);
        b25 = (Button) findViewById(R.id.button25);
        b26 = (Button) findViewById(R.id.button26);
        b27 = (Button) findViewById(R.id.button27);
        b28 = (Button) findViewById(R.id.button28);
        b29 = (Button) findViewById(R.id.button29);
        b30 = (Button) findViewById(R.id.button30);
        b31 = (Button) findViewById(R.id.button31);
        b32 = (Button) findViewById(R.id.button32);

        permission();

        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        bt5.setOnClickListener(this);
        bt6.setOnClickListener(this);
        bt7.setOnClickListener(this);
        bt8.setOnClickListener(this);
        bt9.setOnClickListener(this);
        bt10.setOnClickListener(this);

        bt1.setOnClickListener(this);
        b24.setOnClickListener(this);
        b25.setOnClickListener(this);
        b26.setOnClickListener(this);
        b27.setOnClickListener(this);
        b28.setOnClickListener(this);
        b29.setOnClickListener(this);
        b30.setOnClickListener(this);
        b31.setOnClickListener(this);
        b32.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.button1){
            Intent inten = new Intent(FifthActivity.this, SixthActivity.class);
            startActivity(inten);
        }

        else if(v.getId() == R.id.button2){
            loginHelper.updateData("1","","");
            permission();
            //Log.d("tag",p);
        }

        else if(v.getId() == R.id.button3){
            loginHelper.updateData("2","","");
            permission();
        }

        else if(v.getId() == R.id.button4){
            loginHelper.updateData("3","","");
            permission();
        }

        else if(v.getId() == R.id.button5){
            loginHelper.updateData("4","","");
            permission();
        }

        else if(v.getId() == R.id.button6){
            loginHelper.updateData("5","","");
            permission();
        }

        else if(v.getId() == R.id.button7){
            loginHelper.updateData("6","","");
            permission();
        }

        else if(v.getId() == R.id.button8){
            loginHelper.updateData("7","","");
            permission();
        }

        else if(v.getId() == R.id.button9){
            loginHelper.updateData("8","","");
            permission();
        }

        else if(v.getId() == R.id.button10){
            loginHelper.updateData("9","","");
            permission();
        }

        else if(v.getId() == R.id.button24){
            Intent inten = new Intent(FifthActivity.this, FourthActivity.class);
            inten.putExtra("KEY",string[0]);
            startActivity(inten);
        }

        else if(v.getId() == R.id.button25){
            Intent inten = new Intent(FifthActivity.this, FourthActivity.class);
            inten.putExtra("KEY",string[1]);
            startActivity(inten);
        }

        else if(v.getId() == R.id.button26){
            Intent inten = new Intent(FifthActivity.this, FourthActivity.class);
            inten.putExtra("KEY",string[2]);
            startActivity(inten);
        }

        else if(v.getId() == R.id.button27){
            Intent inten = new Intent(FifthActivity.this, FourthActivity.class);
            inten.putExtra("KEY",string[3]);
            startActivity(inten);
        }

        else if(v.getId() == R.id.button28){
            Intent inten = new Intent(FifthActivity.this, FourthActivity.class);
            inten.putExtra("KEY",string[4]);
            startActivity(inten);
        }

        else if(v.getId() == R.id.button29){
            Intent inten = new Intent(FifthActivity.this, FourthActivity.class);
            inten.putExtra("KEY",string[5]);
            startActivity(inten);
        }

        else if(v.getId() == R.id.button30){
            Intent inten = new Intent(FifthActivity.this, FourthActivity.class);
            inten.putExtra("KEY",string[6]);
            startActivity(inten);
        }

        else if(v.getId() == R.id.button31){
            Intent inten = new Intent(FifthActivity.this, FourthActivity.class);
            inten.putExtra("KEY",string[7]);
            startActivity(inten);
        }

        else if(v.getId() == R.id.button32){
            Intent inten = new Intent(FifthActivity.this, FourthActivity.class);
            inten.putExtra("KEY",string[8]);
            startActivity(inten);
        }
    }

    private void permission(){

        String str = loginHelper.search(1);
        string[0] = loginHelper.search1(1);
        b24.setText(str);

        String str1 = loginHelper.search(2);
        string[1] = loginHelper.search1(2);
        b25.setText(str1);

        String str2 = loginHelper.search(3);
        string[2] = loginHelper.search1(3);
        b26.setText(str2);

        String str3 = loginHelper.search(4);
        string[3] = loginHelper.search1(4);
        b27.setText(str3);

        String str4 = loginHelper.search(5);
        string[4] = loginHelper.search1(5);
        b28.setText(str4);

        String str5 = loginHelper.search(6);
        string[5] = loginHelper.search1(6);
        b29.setText(str5);

        String str6 = loginHelper.search(7);
        string[6] = loginHelper.search1(7);
        b30.setText(str6);

        String str7 = loginHelper.search(8);
        string[7] = loginHelper.search1(8);
        b31.setText(str7);

        String str8 = loginHelper.search(9);
        string[8] = loginHelper.search1(9);
        b32.setText(str8);
    }
}

