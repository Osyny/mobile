package com.dikaya.mobile.LessonLayout;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;

public class ScrollLayoutView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(getScrollView(this));

    }

    protected View getScrollView(Context context)
    {
        ScrollView layout = new ScrollView(context);

        TextView lblText = new TextView(context);

        lblText.setText("Коала — дрібний звір: довжина його тіла 60-82 см, вага від 5 до 16 кг. Хвіст дуже короткий, ззовні непомітний. Голова велика й широка, зі сплющеною мордою. Вуха великі, закруглені, вкриті густим хутром. Очі маленькі. Спинка носа безволоса, чорна. Є щічні мішки.\n" +
                "\n" +
                "Волосяний покрив у коали густий і м'який, міцний; на спині забарвлення змінюється від світло-сірого до темно-сірого, іноді рудувате або червонувате, черево світліше.\n" +
                "\n" +
                "Кінцівки коали пристосовані до лазіння — великий і вказівний пальці передніх і задніх кінцівок протиставлені іншим, що дозволяє звірові обхоплювати гілки дерев. Кігті сильні й гострі, здатні витримувати вагу тварини. На великому пальці задніх кінцівок кіготь відсутній. Коали — одні з небагатьох не-приматів, що мають папілярний візерунок на подушечках пальців. Відбитки пальців коали не відрізняються від відбитків пальця людини навіть під електронним мікроскопом.[3]");

        lblText.setTextSize(70);
//...
       return layout;
    }

}
