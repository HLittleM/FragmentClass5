package com.concordia.cejv669.fragmentclass5;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioGroup loginRadioGroup=findViewById(R.id.loginRadioGroup);
        loginRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.loginEmailRadioButton){
                    FragmentManager fragmentManager= getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
                    FragmentLoginEmail emailLoginFragment = new FragmentLoginEmail();
                    fragmentTransaction.replace(R.id.login_frame, emailLoginFragment);
                    fragmentTransaction.commit();
                }
                if(checkedId == R.id.loginPINradioButton){
                    FragmentManager fragmentManager= getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
                    FragmentLoginPIN pinLoginFragment = new FragmentLoginPIN();
                    fragmentTransaction.replace(R.id.login_frame, pinLoginFragment);
                    fragmentTransaction.commit();
                }
            }
        });
    }
}
