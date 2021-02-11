package net.cronos.app;

import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {
    private TextView textView_folio;
    private TextView textView_alfanum;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView_folio = (TextView)findViewById(R.id.textView_folio);
        textView_alfanum = (TextView)findViewById(R.id.textView_alfanum);

        int fol=Integer.parseInt(getIntent().getStringExtra("folio"));
        String a= String.format("%06d",fol);
        textView_folio.setText("Folio: "+a);
    }





}