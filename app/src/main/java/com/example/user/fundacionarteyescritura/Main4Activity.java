package com.example.user.fundacionarteyescritura;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main4Activity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

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

            Intent intenthomeee = new Intent(Main4Activity.this, MainActivity.class );
            startActivity(intenthomeee);
            return true;
        }


        if(id == R.id.quienessomos){

            Intent intenthomeee = new Intent(Main4Activity.this, Main2Activity.class );
            startActivity(intenthomeee);
            return true;
        }

        if(id == R.id.servicios){

            Intent intenthomeee = new Intent(Main4Activity.this, Main3Activity.class );
            startActivity(intenthomeee);
            return true;
        }

        if(id == R.id.contactar){

            Intent intenthomeee = new Intent(Main4Activity.this, Main4Activity.class );
            startActivity(intenthomeee);
            return true;
        }

        if(id == R.id.noticias){

            Intent intenthomeee = new Intent(Main4Activity.this, Main5Activity.class );
            startActivity(intenthomeee);
            return true;
        }


        if(id == R.id.donaciones){

            Intent intenthomeee = new Intent(Main4Activity.this, Main6Activity.class );
            startActivity(intenthomeee);
            return true;
        }

        if(id == R.id.pagos){

            Intent intenthomeee = new Intent(Main4Activity.this, Main7Activity.class );
            startActivity(intenthomeee);
            return true;
        }


        return true;

    }
//***************************************************************************************

    public void open(View view){

        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://scharss.github.io/oficinadeproyectos/chat.html"));
        startActivity(browserIntent);
    }

}
