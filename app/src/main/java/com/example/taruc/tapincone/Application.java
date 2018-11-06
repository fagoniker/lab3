package com.example.taruc.tapincone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Application extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_application);
        Button showmsg_btn = (Button) findViewById(R.id.add_btn);
        mShowCount = (TextView) findViewById(R.id.result_textview);
        //showmsg_btn.setOnClickListener();

    }

    public void showmsg(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void Inc1(View view) {
        ++mCount;
        if(mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }
}
