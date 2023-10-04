package com.example.a04_10_23;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Declarar variables
    TextView textView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //enlazar variables con las id
        textView = findViewById(R.id.textView);
        imageView = findViewById(R.id.imageView);

        //instancio el metodo asincrono y la inicio
        MyAsyncTask asyncTask = new MyAsyncTask();
        asyncTask.execute();

    }
    public class MyAsyncTask extends AsyncTask<Void, Void, String>{

        @Override
        protected String doInBackground (Void...voids){

            try {
                Thread.sleep(5000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            return "SIUUUUUUUUUUUUU";
        }


        @Override
        protected void onPostExecute(String result){
            //actualizar la interfaz con el estado
            textView.setText(result);
            //mostrar imagen
            imageView.setVisibility(imageView.VISIBLE);
        }

        }

    }