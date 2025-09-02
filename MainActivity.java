package Prak1_00000094067.com;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Mengubah judul Action Bar.
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Aplikasi Pertamaku");
        }

        // Mengakses TextView dari layout menggunakan ID-nya.
        TextView textView = findViewById(R.id.textViewCentered);

        // Mengubah teks dari "Halo UMN..." menjadi "Halo Jonathan_Chandra".
        textView.setText("Halo Jonathan_Chandra");
    }
}