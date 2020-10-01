package polinema.ac.id.dtschapter03_starter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import polinema.ac.id.dtschapter03_starter.MainPage.WelcomeBack;
import polinema.ac.id.dtschapter03_starter.MainPage.WelcomeSlideSuperHero;

public class WelcomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcom);
    }
    public void clickGetStarted(View view) {
        Intent i = new Intent(WelcomActivity.this, WelcomeSlideSuperHero.class);
        startActivity(i);
    }

    public void clickLogin(View view) {
        Intent i = new Intent(WelcomActivity.this, WelcomeBack.class);
        startActivity(i);
    }
}