package ulabcse.awesometodolist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    LinearLayout signup_id,signin_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);


        signup_id = (LinearLayout) findViewById(R.id.signup);
        signup_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signup_intent = new Intent(Home.this,SignUp.class);
                startActivity(signup_intent);
            }
        });


        signin_id= (LinearLayout) findViewById(R.id.signin);
        signin_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signup_intent = new Intent(Home.this,Signin.class);
                startActivity(signup_intent);
            }
        });


    }
}
