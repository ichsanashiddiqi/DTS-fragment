package polinema.ac.id.dtschapter03_starter.MainPage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import polinema.ac.id.dtschapter03_starter.R;

public class WelcomeSlideAssign extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_slide_assign);
    }
    public void clickGetStarted(View view) {
        Intent i = new Intent(WelcomeSlideAssign.this, WelcomeBack.class);
        startActivity(i);
    }

    public void clickLogin(View view) {
        Intent i = new Intent(WelcomeSlideAssign.this, WelcomeBack.class);
        startActivity(i);
    }
}