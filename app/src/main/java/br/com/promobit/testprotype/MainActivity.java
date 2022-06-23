package br.com.promobit.testprotype;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.google.android.material.switchmaterial.SwitchMaterial;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SwitchMaterial sw1 = findViewById(R.id.switch1);
        SwitchMaterial sw2 = findViewById(R.id.switch2);

        sw1.setOnCheckedChangeListener((compoundButton, checked) -> {
            Toast.makeText(getApplicationContext(), "Switch1 " + checked, Toast.LENGTH_SHORT).show();

            sw2.setEnabled(!checked);
        });


        sw2.setOnCheckedChangeListener((compoundButton, checked) -> {
            Toast.makeText(getApplicationContext(), "Switch2 " + checked, Toast.LENGTH_SHORT).show();
            sw1.setEnabled(!checked);
        });
    }
}