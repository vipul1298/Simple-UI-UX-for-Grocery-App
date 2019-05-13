package android.example.groceryapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Signup extends AppCompatActivity {
    TextView alreadyUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        alreadyUser = (TextView)findViewById(R.id.already_user);

        alreadyUser.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent UserIntent = new Intent(Signup.this, SignIn.class);

                // Start the new activity
                startActivity(UserIntent);
            }
        });
    }
}
