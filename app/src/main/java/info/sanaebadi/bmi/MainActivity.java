package info.sanaebadi.bmi;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import info.sanaebadi.bmi.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.buttonCalculate.setOnClickListener(view -> {

            Double height = Double.parseDouble(binding.edittextHeight.getText().toString());
            Double weight = Double.parseDouble(binding.edittextWeight.getText().toString());

            Double result = (height * height) / weight;

            if (result < 18.5) {
                Toast.makeText(this, "Underweight", Toast.LENGTH_SHORT).show();
            } else if (result >= 18.5 && result <= 24.5) {
                Toast.makeText(this, "Healthy weight", Toast.LENGTH_SHORT).show();
            } else if (result <= 25 && result <= 29.5) {
                Toast.makeText(this, "At risk of overweight", Toast.LENGTH_SHORT).show();
            } else if (result >= 30) {
                Toast.makeText(this, "Fat", Toast.LENGTH_SHORT).show();
            }

        });
    }
}