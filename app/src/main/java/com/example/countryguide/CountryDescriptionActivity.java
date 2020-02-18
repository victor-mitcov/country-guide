package com.example.countryguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class CountryDescriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_description);

        CountriesDataManager countriesDataManager = new CountriesDataManager();

        Intent intent = getIntent();
        int countryId = intent.getIntExtra("country_id", -1);

        TextView countryDescriptionView = findViewById(R.id.countryDescription);

        countryDescriptionView.setText(countriesDataManager.getCountriesDescriptions().get(countryId));
    }
}
