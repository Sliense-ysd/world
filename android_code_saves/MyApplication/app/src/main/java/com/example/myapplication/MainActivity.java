package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.google.android.material.internal.ScrimInsetsFrameLayout;

import org.w3c.dom.Text;

//主函数不在这里，这里是被调用的一个类，所以this实际上是主函数中的“当前对象”
/*
* 实现功能：用java+xml编写帧布局*/
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  //表示将 activity_main.xml的内容显示在界面上

        Button bu1=(Button)findViewById(R.id.bu1);
        bu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(MainActivity.this,MainActivity2.class);//从这个主类到第二
                startActivity(i1);
            }
        });


    }
}
/*

    FrameLayout f1=new FrameLayout(this);
        f1.setBackgroundResource(R.drawable.ic_launcher_background); //设置背景
                setContentView(f1);      //设置显示帧布局对象
//----------------------------------------------------------------textview 1
                TextView t1=new TextView(this);
                t1.setText("t1显示的内容text");
                t1.setTextColor(Color.rgb(1,2,3));
                f1.addView(t1);
//----------------------------------------------------------------textview 2
                TextView t2 =new TextView(this);
                t2.setText("@string/t2");
        */
/*第一种：设置一个布局变量，在布局变量中编写t2的属性
          第二种：直接用t2.方法名去配置t2的属性*//*


                FrameLayout.LayoutParams params=new FrameLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.MATCH_PARENT);
                params.gravity= Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL;
                t2.setLayoutParams(params);
                t2.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        new AlertDialog.Builder(MainActivity.this).setTitle("系统提示")
        .setMessage("股市有风险,还要炒股？")
        .setPositiveButton("yes！",
        new DialogInterface.OnClickListener() {
@Override
public void onClick(DialogInterface dialog, int which) {
        Log.i("555","进入股市");
        }
        }).setNegativeButton("NO!",
        new DialogInterface.OnClickListener() {
@Override
public void onClick(DialogInterface dialog, int which) {
        Log.i("555","退出股市");
        finish();//退出app 结束activity
        }
        }).show();

        }
        });
        f1.addView(t2);




*/


