package ulabcse.awesometodolist;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;


public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        TextView text = (TextView) findViewById(R.id.todolist);
        Animation animation = new TranslateAnimation(0, 0, 200, 0);
        animation.setDuration(5000);
        animation.setRepeatMode(Animation.RESTART);
        animation.setRepeatCount(Animation.INFINITE);
        text.startAnimation(animation);
// applying animation to textview object..
        Thread t = new Thread() {

            public void run() {

                try {

                    sleep(3500);
                    finish();
                    Intent cv = new Intent(Splash.this, Home.class/*otherclass*/);
                    startActivity(cv);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t.start();
    }
}
