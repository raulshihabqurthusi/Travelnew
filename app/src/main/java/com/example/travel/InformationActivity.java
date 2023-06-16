package com.example.travel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class InformationActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView buttonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        buttonBack = findViewById(R.id.buttonBackInformation);
        buttonBack.setOnClickListener(this);
    }

    public void whatsapp(View view) {
        int viewID = view.getId();
        String number = null;
        switch (viewID){
            case R.id.wa_Raul:
                number = "62895610441428";
                break;
            case R.id.wa_tessa:
                number = "6288902844473";
                break;
            case R.id.wa_alpha:
                number = "6281322810220";
                break;
            default:
                break;
        }
        String url = "https://api.whatsapp.com/send?phone="+number;
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void github(View view) {
        int viewID = view.getId();
        String name = null;
        switch (viewID){
            case R.id.gitRaul:
                name = "raulshihabqurthusi";
                break;
            case R.id.gittessa:
                name = "TessalonicaPutryAvrylya";
                break;
            case R.id.gitalpha:
                name = "AlphaP45";
                break;
            default:
                break;
        }
        String url = "https://github.com/"+name;
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public void onClick(View view) {
        onBackPressed();
    }
}