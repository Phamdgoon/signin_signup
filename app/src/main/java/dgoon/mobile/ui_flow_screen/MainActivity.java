package dgoon.mobile.ui_flow_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnSignin;
    TextView txtSignup;
    EditText edtEmail, edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSignin = (Button) findViewById(R.id.btnSignin);
        txtSignup = (TextView) findViewById(R.id.textViewsignup);
        edtEmail = (EditText) findViewById(R.id.editTextEmail);
        edtPassword = (EditText) findViewById(R.id.editTextPassword);


        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = edtEmail.getText().toString();
                String password = edtPassword.getText().toString();
                if(password.equals("")==true||username.equals("")==true) {
                    Toast.makeText(MainActivity.this, "Nhập mail và Password", Toast.LENGTH_SHORT).show();
                }else {
                    if(username.equals("gon@gmail.com")==true && password.equals("1")==true) {
                        Intent intent=new Intent(getApplicationContext(),Profile.class);
                        intent.putExtra("Email",username);
                        intent.putExtra("Password", password);
                        startActivity(intent);
                    }else {
                        Toast.makeText(MainActivity.this, "Tài Khoản Sai", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });

        txtSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivitySignup();
            }
        });
    }
    public void openActivitySignup() {
        Intent intent = new Intent(this, Sign_up.class);
        startActivity(intent);
    }
}