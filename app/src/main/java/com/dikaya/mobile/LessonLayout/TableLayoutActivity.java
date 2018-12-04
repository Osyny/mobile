package com.dikaya.mobile.LessonLayout;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

//import com.dikaya.mobile.LessonLayout;

public class TableLayoutActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(getTableLayout(this));

    }
    protected View getTableLayout(Context context){

        TableLayout layout = new TableLayout(context);

        TextView lbl1 = new TextView(context);
        lbl1.setText("lbl1");

        TextView lbl2 = new TextView(context);
        lbl1.setText("lbl2");

        TextView lbl3 = new TextView(context);
        lbl1.setText("lbl3");

        TextView lbl4 = new TextView(context);
        lbl1.setText("lbl4");

        TableRow row1 = new TableRow(context);
        TableRow row2 = new TableRow(context);

        row2.setBackgroundColor(0xffcccccc);

        row1.addView(lbl1);
        row1.addView(lbl2);
        row1.addView(lbl3);

        TableRow.LayoutParams lbl4TableLayoutParameters = new TableRow.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, 300);
        lbl4TableLayoutParameters.span = 3;
        lbl4.setGravity(Gravity.CENTER_HORIZONTAL);
        row2.addView(lbl4, lbl4TableLayoutParameters);



        TableLayout.LayoutParams row1TableLayoutParameters = new TableLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);


        row1TableLayoutParameters.setMargins(50, 50, 50, 50);

        layout.addView(row1, row1TableLayoutParameters);
        layout.addView(row2);

        return  layout;
    }
}
