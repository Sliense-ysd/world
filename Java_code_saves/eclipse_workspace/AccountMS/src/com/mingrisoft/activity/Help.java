package com.mingrisoft.activity;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class Help extends Activity {
	EditText txtFlag;// ����EditText�������
	Button btnflagSaveButton;// ����Button�������
	Button btnflagCancelButton;// ����Button�������

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.help);
		WebView webview=(WebView)findViewById(R.id.webView1);//��ȡ���ֹ���������ӵ�WebView���
		//����һ���ַ�������������Ҫ��ʾ��HTML���ݷ����ڸù�������
		StringBuilder sb=new StringBuilder();
		sb.append("<div>����ͥ���ͨ��ʹ�ð�����</div>");
		sb.append("<ul>");
		sb.append("<li>�޸����룺ѡ��ϵͳ���á�ģ������޸ĵ�¼���룬��Ŀ����ʱ��Ĭ��û�����롣</li>");
		sb.append("<li>֧������ѡ������֧����ģ��������֧����Ϣ��ѡ���ҵ�֧����ģ����Բ鿴���޸Ļ�ɾ��֧����Ϣ��</li>");
		sb.append("<li>�������ѡ���������롱ģ��������������Ϣ��ѡ���ҵ����롱ģ����Բ鿴���޸Ļ�ɾ��������Ϣ��</li>");
		sb.append("<li>��ǩ����ѡ����֧��ǩ��ģ�������ӱ�ǩ��Ϣ��ѡ�����ݹ���ģ���еġ���ǩ��Ϣ����ť���Բ鿴���޸Ļ�ɾ����ǩ��Ϣ��</li>");
		sb.append("<li>�˳�ϵͳ��ѡ���˳���ģ������˳�����ͥ���ͨ����Ŀ��</li>");
		sb.append("</ul>");
		webview.loadDataWithBaseURL(null, sb.toString(),"text/html","utf-8",null);//��������
	}
}
