package com.mingrisoft.activity;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.mingrisoft.dao.FlagDAO;
import com.mingrisoft.dao.InaccountDAO;
import com.mingrisoft.dao.OutaccountDAO;
import com.mingrisoft.model.Tb_flag;
import com.mingrisoft.model.Tb_inaccount;
import com.mingrisoft.model.Tb_outaccount;

public class Showinfo extends Activity {
	public static final String FLAG = "id";// ����һ��������������Ϊ������
	Button btnoutinfo, btnininfo, btnflaginfo;// ����3��Button����
	ListView lvinfo;// ����ListView����
	String strType = "";// �����ַ�������¼��������

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.showinfo);// ���ò����ļ�

		lvinfo = (ListView) findViewById(R.id.lvinfo);// ��ȡ�����ļ��е�ListView���
		btnoutinfo = (Button) findViewById(R.id.btnoutinfo);// ��ȡ�����ļ��е�֧����Ϣ��ť
		btnininfo = (Button) findViewById(R.id.btnininfo);// ��ȡ�����ļ��е�������Ϣ��ť
		btnflaginfo = (Button) findViewById(R.id.btnflaginfo);// ��ȡ�����ļ��еı�ǩ��Ϣ��ť

		//ShowInfo(R.id.btnoutinfo);// Ĭ����ʾ֧����Ϣ

		btnoutinfo.setOnClickListener(new OnClickListener() {// Ϊ֧����Ϣ��ť���ü����¼�
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						ShowInfo(R.id.btnoutinfo);// ��ʾ֧����Ϣ
					}
				});

		btnininfo.setOnClickListener(new OnClickListener() {// Ϊ������Ϣ��ť���ü����¼�
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						ShowInfo(R.id.btnininfo);// ��ʾ������Ϣ
					}
				});
		btnflaginfo.setOnClickListener(new OnClickListener() {// Ϊ��ǩ��Ϣ��ť���ü����¼�
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						ShowInfo(R.id.btnflaginfo);// ��ʾ��ǩ��Ϣ
					}
				});

		lvinfo.setOnItemClickListener(new OnItemClickListener(){// ΪListView�������¼�
			// ��дonItemClick����
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				String strInfo = String.valueOf(((TextView) view).getText());// ��¼����������Ϣ
				String strid = strInfo.substring(0, strInfo.indexOf('|'));// ������Ϣ�н�ȡ���
				Intent intent = null;// ����Intent����
				if (strType == "btnflaginfo") {// �ж�����Ǳ�ǩ��Ϣ
					intent = new Intent(Showinfo.this, FlagManage.class);// ʹ��FlagManage���ڳ�ʼ��Intent����
					intent.putExtra(FLAG, strid);// ����Ҫ���ݵ�����
					startActivity(intent);// ִ��Intent������Ӧ��Activity
				}
			}
		});
	}

	private void ShowInfo(int intType) {// �������ݴ���Ĺ������ͣ���ʾ��Ӧ����Ϣ
		String[] strInfos = null;// �����ַ������飬�����洢������Ϣ
		ArrayAdapter<String> arrayAdapter = null;// ����ArrayAdapter����
		Intent intent = null;// ����Intent����
		switch (intType) {// ��intTypeΪ���������ж�
		case R.id.btnoutinfo:// �����֧����ťbtnoutinfo
			strType = "outinfo";// ΪstrType������ֵ
			intent = new Intent(Showinfo.this, TotalChart.class);// ʹ��TotalChart���ڳ�ʼ��Intent����
			intent.putExtra("passType", strType);// ����Ҫ���ݵ�����
			startActivity(intent);// ִ��Intent������Ӧ��Activity
			break;
		case R.id.btnininfo:// ��������밴ťbtnininfo
			
			strType = "ininfo";// ΪstrType������ֵ
			intent = new Intent(Showinfo.this, TotalChart.class);// ʹ��TotalChart���ڳ�ʼ��Intent����
			intent.putExtra("passType", strType);// ����Ҫ���ݵ�����
			startActivity(intent);// ִ��Intent������Ӧ��Activity
			break;
		case R.id.btnflaginfo:// �����btnflaginfo��ť
			strType = "btnflaginfo";// ΪstrType������ֵ
			FlagDAO flaginfo = new FlagDAO(Showinfo.this);// ����FlagDAO����
			// ��ȡ���б�ǩ��Ϣ�����洢��List���ͼ�����
			List<Tb_flag> listFlags = flaginfo.getScrollData(0,
					(int) flaginfo.getCount());
			strInfos = new String[listFlags.size()];// �����ַ�������ĳ���
			int n = 0;// ����һ����ʼ��ʶ
			for (Tb_flag tb_flag : listFlags) {// ����List���ͼ���
				// ����ǩ�����Ϣ��ϳ�һ���ַ������洢���ַ����������Ӧλ��
				strInfos[n] = tb_flag.getid() + "|" + tb_flag.getFlag();
				if (strInfos[n].length() > 30)// �жϱ�ǩ��Ϣ�ĳ����Ƿ����30
					strInfos[n] = strInfos[n].substring(0, 30) + "����";// ��λ�ô���30֮����ַ����á�������
				n++;// ��ʶ��1
			}
			
			// ʹ���ַ��������ʼ��ArrayAdapter����
			arrayAdapter = new ArrayAdapter<String>(this,
					android.R.layout.simple_list_item_1, strInfos);
			lvinfo.setAdapter(arrayAdapter);// ΪListView�б���������Դ
			break;
		}
	}

}
