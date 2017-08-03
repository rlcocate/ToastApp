package br.com.rodrigococate.toastapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import br.com.rodrigococate.minhabiblioteca.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomToast customToast = new CustomToast();
        if (BuildConfig.REPORT_CRASH)
            customToast.showToast(this, "Report Crash");
        else
            customToast.showToast(this, "Oi Mundo!");

    }
}
