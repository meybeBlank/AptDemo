package com.example.fengz.aptdemoj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.fengz.apt_annotation.annotation.BindView;
import com.example.fengz.apt_library.lib.BindViewTools;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.tv)
    TextView mTextView;
    @BindView(R.id.btn)
    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BindViewTools.bind(this);
        mTextView.setText("bind TextView success");
        mButton.setText("bind Button success");
    }
}
