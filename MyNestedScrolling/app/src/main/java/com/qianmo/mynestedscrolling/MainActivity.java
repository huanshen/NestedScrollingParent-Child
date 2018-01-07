package com.qianmo.mynestedscrolling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private SimpleAdapter simAdapt;
    private ListView listView;
    private List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*        for (int i = 0; i < 20; i++) {
            Map<String, Object> item = new HashMap<String, Object>();
            item.put("touxiang", R.drawable.ic_launcher);
            item.put("name", "某某" + i);
            item.put("message", "今晚我请客吃饭");
            data.add(item);
        }

        listView = (ListView) findViewById(R.id.listview);

        simAdapt = new SimpleAdapter(
                this,
                data,
                R.layout.item,
                new String[]{"touxiang", "name", "message"},// 与下面数组元素要一一对应
                new int[]{R.id.touxiang, R.id.tv_name, R.id.tv_message});

        listView.setAdapter(simAdapt);
        listView.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        // 触摸按下时的操作
                        Log.i("shenjiaqidown", listView.getScrollX()+"");

                        break;
                    case MotionEvent.ACTION_MOVE:
                        // 触摸移动时的操作
                        Log.i("shenjiaqimove", listView.getScrollX()+"");


                        break;
                    case MotionEvent.ACTION_UP:
                        // 触摸抬起时的操作
                        Log.i("shenjiaqiup", listView.getScrollX()+"");


                        break;
                }
                return false;
            }
        });*/
    }
}
