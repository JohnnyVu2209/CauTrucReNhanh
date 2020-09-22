package com.apple.cautrucrenhanh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText numberA,numberB;
    TextView result;
    Button compare;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberA = (EditText)findViewById(R.id.etS1);
        numberB = (EditText)findViewById(R.id.etS2);
        result  = (TextView)findViewById(R.id.tvKQ);
        compare = (Button)findViewById(R.id.btnSoSanh);

        compare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a, b;
                a = Double.parseDouble(numberA.getText().toString());
                b = Double.parseDouble(numberB.getText().toString());
                if(a > b)
                {
                    result.setText(a +">"+ b );
                }
                else if(a < b)
                {
                    result.setText(a +"<"+ b);
                }
                else {
                    result.setText(a +"=" + b);
                }
            }
        });
    }

}
