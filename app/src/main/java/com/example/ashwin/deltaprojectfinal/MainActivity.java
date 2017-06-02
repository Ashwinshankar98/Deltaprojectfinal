package com.example.ashwin.deltaprojectfinal;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
   Button b1,b2,b3;
    TextView t1,t2,t3;
    int count1=0,count2=0,count3=0;
    LinearLayout ll;
    int a=35,b=35,c=35;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button)findViewById(R.id.button4);
        b2=(Button)findViewById(R.id.button5);
        b3=(Button)findViewById(R.id.button6);
        ll=(LinearLayout)findViewById(R.id.activity_main);
        t1=(TextView)findViewById(R.id.textView);
        t2=(TextView)findViewById(R.id.textView2);
        t3=(TextView)findViewById(R.id.textView3);
        t1.setText(String.valueOf(count1));
        t2.setText(String.valueOf(count2));
        t3.setText(String.valueOf(count3));


    }

    public void onClickGreen(View view) {
        if(b==255)
        { b=35;
         count2=0;
        }
        ll.setBackgroundColor(Color.rgb(0,b,0));

        b=b+22;
        t2.setText("(0,"+String.valueOf(b)+",0)");
        t2.setTextColor(Color.rgb(255,0,255));

    }

    public void onClickRed(View view) {
        if(a==255)
        {a=35;
            count1=0;
        }
        ll.setBackgroundColor(Color.rgb(a,0,0));

        a=a+22;
        t1.setText("("+String.valueOf(a)+",0,0)");
         t1.setTextColor(Color.rgb(0,255,255));
    }

    public void onClickBlue(View view) {
        if(c==255)
        {c=35;
            count3=0;
        }
        ll.setBackgroundColor(Color.rgb(0,0,c));

        c= c+22;
        t3.setText("(0,0,"+String.valueOf(c)+")");
        t3.setTextColor(Color.rgb(255,255,0));

    }
}
