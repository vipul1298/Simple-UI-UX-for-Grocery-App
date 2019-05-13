package android.example.groceryapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignIn extends AppCompatActivity {
    TextView forgotPassword,createAcc;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        btn = (Button)findViewById(R.id.loginBtn);

        forgotPassword = (TextView)findViewById(R.id.forgot_password);
        createAcc = (TextView)findViewById(R.id.createAccount);

        // Set a click listener on that View
        forgotPassword.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent forgotPwdIntent = new Intent(SignIn.this, forgotPassword.class);

                // Start the new activity
                startActivity(forgotPwdIntent);
            }
        });

         btn.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent homeIntent = new Intent(SignIn.this, home.class);

                // Start the new activity
                startActivity(homeIntent);
            }
        });

        createAcc.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent createIntent = new Intent(SignIn.this, Signup.class);

                // Start the new activity
                startActivity(createIntent);
            }
        });

    }
}
