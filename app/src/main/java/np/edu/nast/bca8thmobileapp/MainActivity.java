package np.edu.nast.bca8thmobileapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText eName;
    private Button btnGreet, btnCalculator;

    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        eName = findViewById(R.id.et_name);
        btnGreet = findViewById(R.id.btn_greet);
        btnCalculator = findViewById(R.id.btn_calculator);
        tvResult = findViewById(R.id.tv_result);
        btnGreet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = eName.getText().toString();
                tvResult.setText("Welcome, " + name);
            }
        });

        btnCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, CalculatorActivity.class);
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.m_setting) {
            Toast.makeText(this, "Setting", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.m_change) {
            Toast.makeText(this, "Change Password", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.m_profile) {
            Toast.makeText(this, "Profile", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.m_logout) {

            Toast.makeText(this, "Logout", Toast.LENGTH_SHORT).show();
        } else {

            Toast.makeText(this, "Sorry Not item found", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}