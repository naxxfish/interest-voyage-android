package net.naxxfish.interestvoyage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickFindTrains(View v) {
       TextView statusTextView = findViewById(R.id.statusTextView);
       statusTextView.setVisibility(View.VISIBLE);
    }

    public void onClickStartingStation(View v) {
        Intent intent = new Intent(this, StationPicker.class);
        startActivity(intent);
    }

}
