package com.example.z_relative_layout;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


/*在xml中实现 直接用onclick实现*/
    public void myclick_imagebutton(View view){
        Toast toast =new Toast(this);
        TextView tv1=new TextView(this);

        tv1.setText("服务器未连接");


        toast.setView(tv1);
        toast.show();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //---------------------/*设置image_button1  实验室预约 为监听器*/----------------------------------------------
        ImageButton act_ib1=(ImageButton)findViewById(R.id.imageButton1);
        act_ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(MainActivity.this,house.class);
                startActivity(i1);
            }
        });

//---------------------/*设置image_button2 荣誉榜 为监听器*/----------------------------------------------

        ImageButton image_button2=(ImageButton)findViewById(R.id.imageButton2);
        /*给按钮2设置点击监听器，使用匿名内部类onclicklistener*/
        image_button2.setOnClickListener(new View.OnClickListener() {

            /*实例化匿名内部类，默认重写onclick方法，也可以重写其他的方法*/
            @Override
            public void onClick(View v) {


                /*匿名内部类可使用：new 父类.子类()
                .方法()
                .方法()....
                .方法()*/


                new AlertDialog.Builder(MainActivity.this) //实例化  onclick后弹出警告对话框

                        /*方法 设置标题*/
                        .setTitle("系统提示")
                        /*方法 设置信息*/
                        .setMessage("服务器未连接，是否继续")

                        /*方法 设置积极按钮*/
                        .setPositiveButton("是的", new DialogInterface.OnClickListener() {
                         @Override
                            public void onClick(DialogInterface dialog, int which) {
                                 Log.i("3.2","yes");
                             }
                        })

                        /*方法 设置消极按钮*/
                        .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Log.i("3.2", "No");
                                finish();
                            }
                        })

                        /*方法 show，返回值是builder类型*/
                        .show();
            }
        });//image_button2调用“设置监听器”方法结束


        //---------------------/*设置image_button4  设备报修工具为监听器*/----------------------------------------------
        ImageButton act_ib4=(ImageButton)findViewById(R.id.imageButton4);
        act_ib4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4=new Intent(MainActivity.this,tool.class);
                startActivity(i4);
            }
        });


        //---------------------/*设置image_button8  考勤登记  平时分和签到分 为监听器*/----------------------------------------------
        ImageButton act_ib8=(ImageButton)findViewById(R.id.imageButton8);
        act_ib8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i8=new Intent(MainActivity.this,identity.class);
                startActivity(i8);
            }
        });







    }
}