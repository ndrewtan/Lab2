package com.taruc.lab2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void visitTARUC(View v)
    {
        String uri="http://www.tarc.edu.my";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(uri));
        startActivity(intent);
    }

    public void showMain(View v)
    {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        startActivity(intent);
    }

    public void showDial(View v)
    {
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+"0341451234"));
        startActivity(intent);
    }

    public void showSendTo(View v)
    {
        Intent intent = new Intent(Intent.ACTION_SENDTO);

        intent.setData(Uri.parse("mailto:"+"tankh!tarc.edu.my"));
        startActivity(intent);
    }
}
