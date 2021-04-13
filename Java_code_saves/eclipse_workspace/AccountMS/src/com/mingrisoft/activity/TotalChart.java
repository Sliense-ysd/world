package com.mingrisoft.activity;
import java.util.Map;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import com.mingrisoft.dao.InaccountDAO;
import com.mingrisoft.dao.OutaccountDAO;

public class TotalChart extends Activity {
	private float[] money=new float[]{600,1000,600,300,1500};	//�������Ĭ��ֵ
	private int[] color=new int[]{Color.GREEN,Color.YELLOW,Color.RED,Color.MAGENTA,Color.BLUE};	//������ɫ
	private final int WIDTH = 30;	//���͵Ŀ��
	private final int OFFSET = 15;	//���
	private int x =70;	//���x
	private int y=329;	//�յ�y
	private int height=220;	//�߶�
	String[] type=null;		//��������
	private String passType="";	//��¼��������Ϣ����֧����Ϣ
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chart);		//����ʹ�õĲ����ļ�
		Intent intent=getIntent();		//��ȡIntent����
		Bundle bundle=intent.getExtras();		//��ȡ���ݵ����ݰ�
		passType=bundle.getString("passType");
		Resources res=getResources();	//��ȡResources����
		if("outinfo".equals(passType)){
			type=res.getStringArray(R.array.outtype);	//��ȡ֧����������
			
		}else if("ininfo".equals(passType)){
			type=res.getStringArray(R.array.intype);	//��ȡ������������
		}
		
		
		
		
		
		
		
		FrameLayout ll=(FrameLayout)findViewById(R.id.canvas);//��ȡ�����ļ�����ӵ�֡���ֹ�����
		ll.addView(new MyView(this));				//���Զ����MyView��ͼ��ӵ�֡���ֹ�������
		
	}
	public class MyView extends View{
		public MyView(Context context) {
			super(context);
		}
		@Override
		protected void onDraw(Canvas canvas) {
			super.onDraw(canvas);
			canvas.drawColor(Color.WHITE);					//ָ�������ı���ɫΪ��ɫ
			Paint paint=new Paint();						//��������Ĭ�����õĻ���
			paint.setAntiAlias(true);						//ʹ�ÿ���ݹ���
			/***********����������**********************/
			paint.setStrokeWidth(1);						//���ñʴ��Ŀ��
			paint.setColor(Color.BLACK);		//���ñʴ�����ɫ
			canvas.drawLine(50, 330, 300, 330, paint);	//��
			canvas.drawLine(50, 100, 50, 330, paint);	//��
			/******************************************/
			/***********��������**********************/
			paint.setStyle(Style.FILL);					//���������ʽΪ���
			int left=0;	//ÿ�����͵����X����
			money=getMoney(passType);						//�»�ȡ�Ľ��******************
			float max=maxMoney(money);
			for(int i=0;i<money.length;i++){
				paint.setColor(color[i]);		//���ñʴ�����ɫ
				left=x+i*(OFFSET+WIDTH);	//����ÿ���������X����
				canvas.drawRect(left, y-height/max*money[i], left+WIDTH, y, paint);	
			}
			/******************************************/
			/***********��������Ŀ̶�**********************/
			paint.setColor(Color.BLACK);		//���ñʴ�����ɫ
			int tempY=0;
			for(int i=0;i<11;i++){
				tempY=y-height+height/10*i+1;
				canvas.drawLine(47,tempY , 50, tempY, paint);
				paint.setTextSize(12);	//���������С
				canvas.drawText(String.valueOf((int)(max/10*(10-i))), 15,tempY+5, paint);	//����������ע	
			}
			/******************************************/
			/***********����˵������**********************/
			paint.setColor(Color.BLACK);		//���ñʴ�����ɫ
			paint.setTextSize(21);	//���������С
			/******************���Ʊ���*********************************/
			if("outinfo".equals(passType)){
				canvas.drawText("��ͥ���ͨ��֧��ͳ��ͼ", 40,55, paint);	//���Ʊ���
			}else if("ininfo".equals(passType)){
				canvas.drawText("��ͥ���ͨ������ͳ��ͼ", 40,55, paint);	//���Ʊ���
			}	
			/***********************************************************/
			paint.setTextSize(16);	//���������С

			String str_type="";
			for(int i=0;i<type.length;i++){
				str_type+=type[i]+"   ";
			}
			canvas.drawText(str_type, 68,350, paint);	//���ƺ�����ע
		}
	}
	//���������
	float maxMoney(float[] money){
		float max=money[0];	//����һ������Ԫ�ظ�ֵ������max
		for(int i=0;i<money.length-1;i++){
			if(max<money[i+1]){
				max=money[i+1];		//����max
			}
		}
		return max;
	}
	//��ȡ��֧����
	float[] getMoney(String flagType){
		Map mapMoney=null;
		System.out.println(flagType);
		if("ininfo".equals(flagType)){
			InaccountDAO inaccountinfo = new InaccountDAO(TotalChart.this);// ����TotalChart����
			mapMoney=inaccountinfo.getTotal();  //��ȡ���������Ϣ			
		}else if("outinfo".equals(flagType)){
			OutaccountDAO outaccountinfo = new OutaccountDAO(TotalChart.this);// ����TotalChart����
			mapMoney=outaccountinfo.getTotal();	//��ȡ֧��������Ϣ
		}	
		int size=type.length;
		float[] money1=new float[size];
		for(int i=0;i<size;i++){
			money1[i]=( mapMoney.get(type[i])!=null?((Float) mapMoney.get(type[i])):0);
		}
		return money1;
	}
}
