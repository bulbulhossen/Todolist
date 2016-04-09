package ulabcse.awesometodolist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Signin extends AppCompatActivity {

    TextView tvforget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);

        TextView text_signin = (TextView) findViewById(R.id.bulbul);
        text_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Signin.this, "Successfully login", Toast.LENGTH_SHORT).show();

                Intent sign = new Intent(Signin.this,Dashborad.class);
                startActivity(sign);
            }
        });


        tvforget = (TextView) findViewById(R.id.forget_password);
        tvforget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Signin.this, "Forget password", Toast.LENGTH_SHORT).show();
                Intent forget = new Intent(Signin.this,Forget_password.class);
                startActivity(forget);
            }
        });


    }
}
