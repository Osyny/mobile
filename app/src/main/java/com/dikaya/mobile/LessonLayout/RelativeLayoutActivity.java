package com.dikaya.mobile.LessonLayout;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class RelativeLayoutActivity extends AppCompatActivity {
    public void onCreate(Bundle stage)
    {
        super.onCreate(stage);

        setContentView(getRelativeLayout(this));
    }
// 2.
    protected View getRelativeLayout(Context context){

        //protected View getRelativeLayout(Sender sender){
       // RelativeLayout layout = new RelativeLayout(sender)}

        RelativeLayout layout = new RelativeLayout(context);

        layout.setMinimumHeight(300);
        layout.setMinimumWidth(300);

        // Lable
        TextView lblName = new TextView(context);
        lblName.setId(1);
        lblName.setText("Name: ");

        EditText txtName = new EditText(context);
        txtName.setId(2);


        Button btnSend = new Button(context);
        btnSend.setId(3);
        btnSend.setText("Send: ");

        // араметри для компонентов
        RelativeLayout.LayoutParams lblLayoutParams =new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        // 3. По центру радителя
       // lblLayoutParams.addRule(RelativeLayout.CENTER_IN_PARENT);
        lblLayoutParams.addRule(RelativeLayout.CENTER_VERTICAL);
        lblName.setLayoutParams(lblLayoutParams);

        //4 .txt
        RelativeLayout.LayoutParams txtLayoutParams = new RelativeLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT);

        txtLayoutParams.addRule(RelativeLayout.ALIGN_BASELINE, lblName.getId());
        txtLayoutParams.addRule(RelativeLayout.RIGHT_OF, lblName.getId());
        txtLayoutParams.addRule(RelativeLayout.ALIGN_PARENT_END);

        txtName.setLayoutParams(txtLayoutParams);


        // btn
        RelativeLayout.LayoutParams btnParameters = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        btnParameters.addRule(RelativeLayout.CENTER_HORIZONTAL);
        btnParameters.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);

        btnParameters.setMargins(40, 40, 40,40);
       // btnSend.setLayoutParams(btnParameters);

        layout.addView(lblName);
        layout.addView(txtName);
        layout.addView(btnSend, btnParameters);

        return layout;

    }
}
