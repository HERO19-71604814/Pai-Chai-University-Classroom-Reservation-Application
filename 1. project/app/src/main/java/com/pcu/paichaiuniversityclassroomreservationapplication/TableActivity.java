package com.pcu.paichaiuniversityclassroomreservationapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class TableActivity extends Activity {
    //Context로 다음 액티비티에서 정보 사용
    public static Context tableContext;
    //daytime 에서 가져올 변수
    TextView tvYear2, tvMonth2, tvDay2, tvHour2, tvMinute2;

    //변수
    TextView seat;//자리 버튼 선택시 1가지 정보
    Button btnNext; //다음 액티비티로 넘어가는 버튼

    Button[] numButtons = new Button[40];
    Integer[] numBtnIDs = { R.id.BtnNum0,R.id.BtnNum1,R.id.BtnNum2,R.id.BtnNum3,R.id.BtnNum4,
            R.id.BtnNum5,R.id.BtnNum6,R.id.BtnNum7,
            R.id.BtnNum8,R.id.BtnNum9, R.id.BtnNum10,R.id.BtnNum11,
            R.id.BtnNum12, R.id.BtnNum13, R.id.BtnNum14, R.id.BtnNum15,R.id.BtnNum16, R.id.BtnNum17, R.id.BtnNum18, R.id.BtnNum19, R.id.BtnNum20,
            R.id.BtnNum21, R.id.BtnNum22, R.id.BtnNum23, R.id.BtnNum24, R.id.BtnNum25,
            R.id.BtnNum26, R.id.BtnNum27, R.id.BtnNum28, R.id.BtnNum29, R.id.BtnNum30,
            R.id.BtnNum31, R.id.BtnNum32, R.id.BtnNum33, R.id.BtnNum34, R.id.BtnNum35,
            R.id.BtnNum36, R.id.BtnNum37, R.id.BtnNum38, R.id.BtnNum39};
    int i;

    //이전 Time Day 로 돌아가기
    Button btnReturn;

    //뒤로가기 버튼을 눌렀을 경우 처리하는 함수
    @Override
    public void onBackPressed() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.table);
        setTitle("강의실 자리 예약");

        //이전 day time 변수들
        tvYear2 = (TextView) findViewById(R.id.tvYear2);
        tvMonth2 = (TextView) findViewById(R.id.tvMonth2);
        tvDay2 = (TextView) findViewById(R.id.tvDay2);
        tvHour2 = (TextView) findViewById(R.id.tvHour2);
        tvMinute2 = (TextView) findViewById(R.id.tvMinute2);

        tvYear2.setText(((DaytimeActivity)DaytimeActivity.DayContext).tvYear.getText());
        tvMonth2.setText(((DaytimeActivity)DaytimeActivity.DayContext).tvMonth.getText());
        tvDay2.setText(((DaytimeActivity)DaytimeActivity.DayContext).tvDay.getText());
        tvHour2.setText(((DaytimeActivity)DaytimeActivity.DayContext).tvHour.getText());
        tvMinute2.setText(((DaytimeActivity)DaytimeActivity.DayContext).tvMinute.getText());

        //이전으로 돌아가기
        btnReturn =(Button)findViewById(R.id.BtnReturn3);
        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //Context
        tableContext = this;

        //좌석 버튼 관련 요소들 연결
        seat = (TextView) findViewById(R.id.Seat);
        for(i=0;i<numButtons.length;i++){
            numButtons[i] = (Button)findViewById(numBtnIDs[i]);
        }

        //버튼 번호따라 자리 선택된 정보 띄움
        for(i=0;i<numButtons.length;i++){
            final int index;
            index = i;
            numButtons[index].setOnClickListener(new View.OnClickListener(){
                public void onClick(View view){
                    //더 구현 : 클릭 시 색 바뀌는거
                    if (index<7){
                        seat.setText((index+1)+"번 자리"); //버튼 번호를 받아와 띄움
//                        personnel.setText("2인");
                        seat.setTextColor(Color.BLUE);
//                        personnel.setTextColor(Color.BLUE);
                        Toast.makeText(getApplicationContext(),
                                (index+1)+"번 좌석을 선택하셨습니다.",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        seat.setText((index+1)+"번 자리"); //버튼 번호를 받아와 띄움
//                        personnel.setText("4인");
                        seat.setTextColor(Color.BLUE);
//                        personnel.setTextColor(Color.BLUE);
                        Toast.makeText(getApplicationContext(),
                                (index+1)+"번 좌석을 선택하셨습니다.",Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }//for문 끝

        //다음 액티비티로..넘어가기전에 입력 정보들 확인 후 입력 안한것 하나라도 있으면 못넘어가게
        btnNext = (Button)findViewById(R.id.BtnNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(seat.length() <= 0){
                    if(seat.length() <= 0){
                        Toast.makeText(getApplicationContext(),"좌석을 선택하세요"
                                ,Toast.LENGTH_SHORT).show();
                    }

                }
                else {
                    //Intent
                    Intent intent = new Intent(TableActivity.this,ConfirmActivity.class);
                    startActivity(intent);//다음 액티비티 화면에 출력
                }

            }
        });

    }//onCreate 끝

}
