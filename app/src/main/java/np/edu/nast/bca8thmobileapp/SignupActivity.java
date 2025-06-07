package np.edu.nast.bca8thmobileapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignupActivity extends AppCompatActivity {
    private Button btnLogin;
    private Button btnSignup;
    private EditText etFirstName, etLastName, etEmail;

    private RadioButton rdoMale,rdoFemale;

    private  EditText etPassword, etConfirmPassword;

    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        btnLogin = findViewById(R.id.btn_login);

        btnSignup = findViewById(R.id.btn_signup);
        etFirstName=findViewById(R.id.et_firstname);
        etLastName = findViewById(R.id.et_lastname);
        etEmail = findViewById(R.id.et_email);
        etPassword =findViewById(R.id.et_password);
        etConfirmPassword=findViewById(R.id.et_confirm_password);
        rdoMale = findViewById(R.id.rdo_male);
        rdoFemale = findViewById(R.id.rdo_fmale);
        tvResult=findViewById(R.id.tv_result);
        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String firstName = etFirstName.getText().toString();

                tvResult.setText(firstName);
            }
        });


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignupActivity.this,LoginActivity.class);
                startActivity(intent);
                //finish()
            }
        });
    }
}