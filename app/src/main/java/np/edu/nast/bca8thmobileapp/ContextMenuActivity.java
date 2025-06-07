package np.edu.nast.bca8thmobileapp;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ContextMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_menu);

        EditText etUsername = findViewById(R.id.et_username);
        registerForContextMenu(etUsername);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        if (v.getId() == R.id.et_username) {
            getMenuInflater().inflate(R.menu.ctx_menu, menu);
        }
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.m_cut) {
            Toast.makeText(this, "Cut Clicked", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.m_copy) {
            Toast.makeText(this, "Copy Clicked", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.m_paste) {
            Toast.makeText(this, "Paste Clicked", Toast.LENGTH_SHORT).show();
        }
        return super.onContextItemSelected(item);
    }
}