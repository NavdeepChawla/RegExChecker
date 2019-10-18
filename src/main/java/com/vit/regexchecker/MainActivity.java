package com.vit.regexchecker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText reget=findViewById(R.id.editText2);
        final EditText staet=findViewById(R.id.editText);
        Button button=findViewById(R.id.button);
        View.OnClickListener a=new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                String RegEx=reget.getText().toString();
                String Statement=staet.getText().toString();
                if((RegEx.equalsIgnoreCase("")))
                {
                    Toast.makeText(getApplicationContext(), "Invalid Input", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Pattern p=Pattern.compile(RegEx);
                    Matcher m=p.matcher(Statement);

                    if(m.matches())
                    {
                        Toast.makeText(getApplicationContext(), "Matched", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(), "Not Matched", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        };
        button.setOnClickListener(a);
    }
}
