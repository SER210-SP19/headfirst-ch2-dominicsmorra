package edu.quinnipiac.findbeeractivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFindBeer(View view) {
        TextView brands = (TextView) findViewById(R.id.brands);
        brands.setText("Gottle of geer");
        Spinner color = (Spinner) findViewById(R.id.color);
        String.valueOf(color.getSelectedItem());

    }


}
