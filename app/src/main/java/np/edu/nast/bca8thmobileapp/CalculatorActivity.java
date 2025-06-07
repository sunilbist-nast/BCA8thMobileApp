package np.edu.nast.bca8thmobileapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class CalculatorActivity extends Activity {
 private EditText etFirst, etSecond;
 private Button btnAdd,btnSub, btnMul, btnDiv, btnMod;
 private TextView tvResult;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        etFirst = findViewById(R.id.et_frist_no);
        etSecond = findViewById(R.id.et_second_no);

        btnAdd = findViewById(R.id.btn_add);
        btnSub = findViewById(R.id.btn_sub);
        btnMul = findViewById(R.id.btn_mul);
        btnDiv = findViewById(R.id.btn_div);
        btnMod = findViewById(R.id.btn_mod);

        tvResult = findViewById(R.id.tv_result);

        //i am using java 1.8 feature i.e lamda expression for event handing
        btnAdd.setOnClickListener(view -> {
            Double n1=Double.parseDouble(etFirst.getText().toString());
            Double n2=Double.parseDouble(etSecond.getText().toString());
            tvResult.setText("Sum: "+(n1+n2));
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}
