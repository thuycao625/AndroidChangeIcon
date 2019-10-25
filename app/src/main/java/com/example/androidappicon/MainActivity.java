package com.example.androidappicon;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

/* doi icon cho ung dung
  b1 : tai anh
  b2: chon mipmap
  b3: chon ic_launcher
  b4: click chuot phai / new / Image assets / doi path/ next/ finish
*/
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
