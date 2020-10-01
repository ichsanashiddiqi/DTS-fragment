package polinema.ac.id.dtschapter03_starter.MainPage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import polinema.ac.id.dtschapter03_starter.R;
import polinema.ac.id.dtschapter03_starter.WelcomActivity;

public class ResetPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);
    }
    public void postChangePassword(View view) {
        Intent i = new Intent(ResetPassword.this, SuccessActivity.class);
        startActivity(i);
    }
}