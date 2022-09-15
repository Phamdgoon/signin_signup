package dgoon.mobile.ui_flow_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Sign_up extends AppCompatActivity {

    TextView txtSignin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        txtSignin = (TextView) findViewById(R.id.textviewSignin);
        txtSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivitySignin();
            }
        });
    }

    public void openActivitySignin() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}