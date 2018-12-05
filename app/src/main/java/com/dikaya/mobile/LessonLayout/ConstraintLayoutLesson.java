package com.dikaya.mobile.LessonLayout;

import android.content.Context;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dikaya.mobile.R;

public class ConstraintLayoutLesson extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getConstraintLayout(this));

        //setContentView(R.layout.activity_constraint_layout_lesson);
        //setContentView(R.layout.activity_constraint_layout_lesson);



    }

    protected View getConstraintLayout(Context context) {

        ConstraintLayout layout = new ConstraintLayout(context);

        layout.setMinHeight(300);
        layout.setMinWidth(300);
        layout.setId(1000);

        TextView constUs = new TextView(context);
        constUs.setText("Contact us");
        constUs.setTextSize(25);
        constUs.setId(1);

        ConstraintLayout.LayoutParams contactUsParams = new ConstraintLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        constUs.setLayoutParams(contactUsParams);
        contactUsParams.setMargins(50, 50, 50, 50);

        ConstraintSet rules = new ConstraintSet();
        rules.clone(layout);

        rules.connect(constUs.getId(), ConstraintSet.TOP, layout.getId(), ConstraintSet.TOP, 20);
        rules.connect(constUs.getId(), ConstraintSet.LEFT, layout.getId(), ConstraintSet.LEFT, 10);
//        rules.connect(constUs.getId(), ConstraintSet.BOTTOM, layout.getId(), ConstraintSet.BOTTOM, 10);
//        rules.connect(constUs.getId(), ConstraintSet.RIGHT, layout.getId(), ConstraintSet.RIGHT, 10);

        rules.applyTo((layout));
        layout.addView(constUs);
        return layout;
    }
}


