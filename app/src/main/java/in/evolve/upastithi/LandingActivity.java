package in.evolve.upastithi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

import in.evolve.upastithi.Teacher.Activities.TeacherLanding;
import in.evolve.upastithi.Utilities.Utils;

public class LandingActivity extends AppCompatActivity {

    private  Button student;
    private Button teacher;
    private Button admin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);

        student= (Button) findViewById(R.id.student);
        student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        teacher= (Button) findViewById(R.id.teacher);
        teacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LandingActivity.this, TeacherLanding.class);
                startActivity(intent);
            }
        });

        admin= (Button) findViewById(R.id.admin);
        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
