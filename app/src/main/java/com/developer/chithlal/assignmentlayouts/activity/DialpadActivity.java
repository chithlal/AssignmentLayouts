package com.developer.chithlal.assignmentlayouts.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.developer.chithlal.assignmentlayouts.R;
import com.developer.chithlal.assignmentlayouts.databinding.ActivityDialpadBinding;

public class DialpadActivity extends AppCompatActivity implements View.OnClickListener {

    ActivityDialpadBinding mBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityDialpadBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());
        mBinding.tv0.setOnClickListener(this);
        mBinding.tv1.setOnClickListener(this);
        mBinding.tv2.setOnClickListener(this);
        mBinding.tv3.setOnClickListener(this);
        mBinding.tv4.setOnClickListener(this);
        mBinding.tv5.setOnClickListener(this);
        mBinding.tv6.setOnClickListener(this);
        mBinding.tv7.setOnClickListener(this);
        mBinding.tv8.setOnClickListener(this);
        mBinding.tv9.setOnClickListener(this);
        mBinding.tvHash.setOnClickListener(this);
        mBinding.tvStar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id){

            case R.id.tv_0:updateTextView("0");
            break;
            case R.id.tv_1:updateTextView("1");
                break;
            case R.id.tv_2:updateTextView("2");
                break;
            case R.id.tv_3:updateTextView("3");
                break;
            case R.id.tv_4:updateTextView("4");
                break;
            case R.id.tv_5:updateTextView("5");
                break;
            case R.id.tv_6:updateTextView("6");
                break;
            case R.id.tv_7:updateTextView("7");
                break;
            case R.id.tv_8:updateTextView("8");
                break;
            case R.id.tv_9:updateTextView("9");
                break;
            case R.id.tv_hash:updateTextView("#");
                break;
            case R.id.tv_star:updateTextView("*");
                break;
            case R.id.button_clear:updateTextView("-1");
                break;
        }
    }
    void updateTextView(String number){
        if(number.equals("-1")){
           String out = mBinding.output.getText().toString();
           out = out.substring(0,out.length()-2);
           mBinding.output.setText(out);
        }
        else
        mBinding.output.append(number);
    }
}