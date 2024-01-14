package com.pcu.paichaiuniversityclassroomreservationapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EndActivity extends Activity {

    TextView tvYear4, tvMonth4, tvDay4, tvHour4, tvMinute4;
    Button btnf; //다음 액티비티로 넘어가는 버튼

    //뒤로가기 버튼을 눌렀을 경우 처리하는 함수
    @Override
    public void onBackPressed() {
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.end);

        //예약 날 정보
        //이전 day time 변수들
        tvYear4 = (TextView) findViewById(R.id.tvYear4);
        tvMonth4 = (TextView) findViewById(R.id.tvMonth4);
        tvDay4 = (TextView) findViewById(R.id.tvDay4);
        tvHour4 = (TextView) findViewById(R.id.tvHour4);
        tvMinute4 = (TextView) findViewById(R.id.tvMinute4);

        tvYear4.setText(((DaytimeActivity) DaytimeActivity.DayContext).tvYear.getText());
        tvMonth4.setText(((DaytimeActivity) DaytimeActivity.DayContext).tvMonth.getText());
        tvDay4.setText(((DaytimeActivity) DaytimeActivity.DayContext).tvDay.getText());
        tvHour4.setText(((DaytimeActivity) DaytimeActivity.DayContext).tvHour.getText());
        tvMinute4.setText(((DaytimeActivity) DaytimeActivity.DayContext).tvMinute.getText());




        btnf = (Button) findViewById(R.id.Btnf);
        btnf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //다음 액티비티로 가는 것
                //Intent
                Intent intent = new Intent(EndActivity.this,MainActivity.class);
                startActivity(intent);//다음 액티비티 화면에 출력

            }
        });

    }
}
