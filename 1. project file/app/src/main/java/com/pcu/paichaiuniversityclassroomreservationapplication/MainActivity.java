package com.pcu.paichaiuniversityclassroomreservationapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    ImageButton imageStart1, imageStart2, imageStart3, imageStart4, imageStart5, imageStart6;

    //뒤로가기 버튼을 눌렀을 경우 처리하는 함수
    @Override
    public void onBackPressed() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

        imageStart1 = (ImageButton)findViewById(R.id.ImageStart1);
        imageStart2 = (ImageButton)findViewById(R.id.ImageStart2);
        imageStart3 = (ImageButton)findViewById(R.id.ImageStart3);
        imageStart4 = (ImageButton)findViewById(R.id.ImageStart4);
        imageStart5 = (ImageButton)findViewById(R.id.ImageStart5);
        imageStart6 = (ImageButton)findViewById(R.id.ImageStart6);

        imageStart1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //다음 액티비티로 가는 것
                //Intent
                Intent intent = new Intent(MainActivity.this,DaytimeActivity.class);
                startActivity(intent);//다음 액티비티 화면에 출력
            }
        });

        imageStart2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //다음 액티비티로 가는 것
                //Intent
                Intent intent = new Intent(MainActivity.this,DaytimeActivity.class);
                startActivity(intent);//다음 액티비티 화면에 출력
            }
        });

        imageStart3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //다음 액티비티로 가는 것
                //Intent
                Intent intent = new Intent(MainActivity.this,DaytimeActivity.class);
                startActivity(intent);//다음 액티비티 화면에 출력
            }
        });

        imageStart4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //다음 액티비티로 가는 것
                //Intent
                Intent intent = new Intent(MainActivity.this,DaytimeActivity.class);
                startActivity(intent);//다음 액티비티 화면에 출력
            }
        });

        imageStart5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //다음 액티비티로 가는 것
                //Intent
                Intent intent = new Intent(MainActivity.this,DaytimeActivity.class);
                startActivity(intent);//다음 액티비티 화면에 출력
            }
        });

        imageStart6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //다음 액티비티로 가는 것
                //Intent
                Intent intent = new Intent(MainActivity.this,DaytimeActivity.class);
                startActivity(intent);//다음 액티비티 화면에 출력
            }
        });

        if (user == null){
            myStartActivity(LoginActivity.class);
        }else {
            FirebaseFirestore db = FirebaseFirestore.getInstance();
            DocumentReference docRef = db.collection("users").document(user.getUid());
            docRef.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                @Override
                public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                    if (task.isSuccessful()) {
                        DocumentSnapshot document = task.getResult();
                        if (document != null) {
                            if (document.exists()) {
                                Log.d(TAG, "DocumentSnapshot data: " + document.getData());
                            } else {
                                Log.d(TAG, "No such document");
                                myStartActivity(MemberInitActivity.class);
                            }
                        }

                    } else {
                        Log.d(TAG, "get failed with ", task.getException());
                    }
                }
            });
        }

        findViewById(R.id.logoutButton).setOnClickListener(onClickListener);
    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.logoutButton:
                    FirebaseAuth.getInstance().signOut();
                    myStartActivity(LoginActivity.class);
                    break;
            }
        }
    };

    // 지정한 클래스의 엑티비티 화면으로 이동
    private void myStartActivity(Class c) {
        Intent intent = new Intent(this, c);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}