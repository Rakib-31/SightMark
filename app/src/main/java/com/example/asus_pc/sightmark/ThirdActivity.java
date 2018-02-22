package com.example.asus_pc.sightmark;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText pass, email;
    private Button button, button2;
    public String string = new String();

    LoginClass loginHelper = new LoginClass(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        email = (EditText) findViewById(R.id.email);
        pass = (EditText) findViewById(R.id.pass);
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.button) {

            if (!validity()) {

                if (loginHelper.search(email.getText().toString(), pass.getText().toString())) {

                    email.setText("");
                    pass.setText("");
                    Intent inten = new Intent(ThirdActivity.this, FifthActivity.class);
                    startActivity(inten);

                } else
                    Toast.makeText(ThirdActivity.this, "incorrect username or passward", Toast.LENGTH_LONG).show();
            }
        } else if (v.getId() == R.id.button2) {
            Intent inten = new Intent(ThirdActivity.this, SecondActivity.class);
            startActivity(inten);
        }
    }

    private boolean validity() {
        if (email.getText().toString().trim().length() <= 0) {
            Toast.makeText(ThirdActivity.this, "Enter username", Toast.LENGTH_LONG).show();
            return true;
        } else if (pass.getText().toString().trim().length() <= 0) {
            Toast.makeText(ThirdActivity.this, "Enter passward", Toast.LENGTH_LONG).show();
            return true;
        } else
            return false;
    }
}
