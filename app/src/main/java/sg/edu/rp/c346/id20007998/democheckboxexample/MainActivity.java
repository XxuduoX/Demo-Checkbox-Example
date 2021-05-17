package sg.edu.rp.c346.id20007998.democheckboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox cb;
    Button btnCheck;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb=findViewById(R.id.checkBoxDiscount);
        btnCheck=findViewById(R.id.checkButton);
        tv=findViewById(R.id.textView);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message="";
                Toast.makeText(MainActivity.this,"Button Click",Toast.LENGTH_LONG).show();

                if (cb.isChecked()){
                    message="The discount is given";

                }
                else{
                    message="The discount is not given";

                }

                tv.setText(message);




            }
        });


    }
}