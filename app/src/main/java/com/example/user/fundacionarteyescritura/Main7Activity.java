package com.example.user.fundacionarteyescritura;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main7Activity extends AppCompatActivity {

    String url7 = "https://fundacionarte.blogspot.com/p/pagos.html";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        //PaginaWeb**********************************************************************
        WebView web = (WebView) findViewById(R.id.web7);
        web.setWebViewClient(new MyWebViewClient());
        WebSettings settings = web.getSettings();
        settings.setJavaScriptEnabled(true);
        web.loadUrl(url7);
    }

    private class MyWebViewClient extends WebViewClient {

        public boolean shouldOverrideUrlLoading(WebView view, String url7){
            view.loadUrl(url7);
            return true;

        }
    }

    //*********************************************************************************

    //***************************************************************************************
    // Menu desplegable
    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if(id == R.id.inicio){

            Intent intenthomeee = new Intent(Main7Activity.this, MainActivity.class );
            startActivity(intenthomeee);
            return true;
        }


        if(id == R.id.quienessomos){

            Intent intenthomeee = new Intent(Main7Activity.this, Main2Activity.class );
            startActivity(intenthomeee);
            return true;
        }

        if(id == R.id.servicios){

            Intent intenthomeee = new Intent(Main7Activity.this, Main3Activity.class );
            startActivity(intenthomeee);
            return true;
        }

        if(id == R.id.contactar){

            Intent intenthomeee = new Intent(Main7Activity.this, Main4Activity.class );
            startActivity(intenthomeee);
            return true;
        }

        if(id == R.id.noticias){

            Intent intenthomeee = new Intent(Main7Activity.this, Main5Activity.class );
            startActivity(intenthomeee);
            return true;
        }


        if(id == R.id.donaciones){

            Intent intenthomeee = new Intent(Main7Activity.this, Main6Activity.class );
            startActivity(intenthomeee);
            return true;
        }

        if(id == R.id.pagos){

            Intent intenthomeee = new Intent(Main7Activity.this, Main7Activity.class );
            startActivity(intenthomeee);
            return true;
        }


        return true;

    }
//***************************************************************************************

}
