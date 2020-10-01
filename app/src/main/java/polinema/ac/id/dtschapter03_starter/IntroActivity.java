package polinema.ac.id.dtschapter03_starter;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import polinema.ac.id.dtschapter03_starter.MainPage.WelcomeBack;
import polinema.ac.id.dtschapter03_starter.MainPage.WelcomeSlideSuperHero;

public class IntroActivity extends AppCompatActivity {

    private ViewPager screenPager;
    IntroViewPageAdapter introViewPageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        List<ScreenItem> mList = new ArrayList<>();
        mList.add(new ScreenItem("Welcome to DTS VSGA","What is going to happen tomorrow ?",R.drawable.ic_eventlist));
        mList.add(new ScreenItem("Task and Assign","Task and Assign them to colleagues",R.drawable.ic_assign));
        mList.add(new ScreenItem("Work Happens","Get Notified When Work Happens",R.drawable.ic_superhero));

        screenPager =findViewById(R.id.screen_viewpager);
        introViewPageAdapter = new IntroViewPageAdapter(this,mList);
        screenPager.setAdapter(introViewPageAdapter);

    }

    public void clickGetStarted(View view) {
        Intent i = new Intent(IntroActivity.this, WelcomeSlideSuperHero.class);
        startActivity(i);
    }

    public void clickLogin(View view) {
        Intent i = new Intent(IntroActivity.this, WelcomeBack.class);
        startActivity(i);
    }
}
