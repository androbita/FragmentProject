package com.example.fragmentproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fragmentproject.fragment.FirstFragment;
import com.example.fragmentproject.fragment.SecondFragment;

public class FragmentDinamis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_dinamis);
//        loadFragment(new FirstFragment());

//        Button btn1, btn2;
//        btn1 = findViewById(R.id.btn_first_fr);
//        btn2 = findViewById(R.id.btn_second_fr);

        Configuration config = getResources().getConfiguration();

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//               Fragment frag = new FirstFragment();
//               getSupportFragmentManager().popBackStackImmediate();
//               loadFragment(frag);
//            }
//        });
//
//        btn2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Fragment frag = new SecondFragment();
//                getSupportFragmentManager().popBackStackImmediate();
//                loadFragment(frag);
//            }
//        });

        if (config.orientation == Configuration.ORIENTATION_PORTRAIT){
            //mode landscape
            FirstFragment first = new FirstFragment();
            fragmentTransaction.replace(R.id.new_frame, first);
        }else {
            //mode portrait
            SecondFragment secondFragment = new SecondFragment();
            fragmentTransaction.replace(R.id.new_frame, secondFragment);
        }
        fragmentTransaction.commit();
    }

//    private void loadFragment(Fragment fragment) {
//        getSupportFragmentManager().beginTransaction().replace(R.id.new_frame, fragment).commit();
//    }
}