package comceleluengo.fb.mismapas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.maps.model.LatLng;

public class MainActivity extends AppCompatActivity {

    public static LatLng coor ;
    public static String nomLugar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irMapa1(View v){
        Intent i = new Intent(this, MapsActivity.class);
        coor =  new LatLng(-34.85748580372549, -61.54986010339894);
        nomLugar = "Situado en Parque G. San Martín";

        startActivity(i);
    }

    public void irMapa2(View v){
        Intent i = new Intent(this, MapsActivity.class);
        coor =  new LatLng(-34.86804653820206, -61.52931170013585);
        nomLugar = "Situado en Plaza Rivadavia";

        startActivity(i);
    }

    public void irMapa3(View v){
        Intent i = new Intent(this, MapsActivity.class);
        coor =  new LatLng(-34.86779566095405, -61.530170007020615);
        nomLugar = "Situado en la Municipalidad de Lincoln";

        startActivity(i);
    }

    public void irMapa4(View v){
        Intent i = new Intent(this, MapsActivity.class);
        coor =  new LatLng(-34.865969911757944, -61.52796321955361);
        nomLugar = "Situado en Cine Club J. Newbery";
        startActivity(i);
    }

}
