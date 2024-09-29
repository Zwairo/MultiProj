package yavuz;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.multiproj.R;
import com.example.multiproj.databinding.ActivityYavuzBinding;

public class yavuz extends AppCompatActivity {

    private ActivityYavuzBinding tasarim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        tasarim = ActivityYavuzBinding.inflate(getLayoutInflater());
        setContentView(tasarim.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        tasarim.Yavuzbutton1.setOnClickListener(v -> {
            Intent yeniIntent = new Intent(yavuz.this,yavuzbutton1.class);
            startActivity(yeniIntent);
        });
        tasarim.Yavuzbutton1.setOnClickListener(v -> {
            Intent yeniIntent = new Intent(yavuz.this,yavuzbutton2.class);
            startActivity(yeniIntent);
        });
    }
}