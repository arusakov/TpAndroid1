package technopark.TpAndroid1.mainpage;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;
import technopark.TpAndroid1.R;

public class ActivityMain extends Activity implements View.OnClickListener {

	private Button btn1, btn2, btnDlg;
	private ImageButton btnLeft, btnCenter, btnRight;
	private EditText editText;
	private MainPageRouter pageRouter;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		pageRouter = new MainPageRouter(this);

		editText = (EditText) findViewById(R.id.mainEditText);

		btn1 = (Button) findViewById(R.id.mainBtn1);
		btn2 = (Button) findViewById(R.id.mainBtn2);
		btnDlg = (Button) findViewById(R.id.mainBtnDlg);

		btn1.setOnClickListener(this);
		btn2.setOnClickListener(this);
		btnDlg.setOnClickListener(this);

		btnLeft = (ImageButton) findViewById(R.id.mainLeftBtn);
		btnCenter = (ImageButton) findViewById(R.id.mainCenterBtn);
		btnRight = (ImageButton) findViewById(R.id.mainRightBtn);

		btnLeft.setOnClickListener(pageRouter);
		btnCenter.setOnClickListener(pageRouter);
		btnRight.setOnClickListener(pageRouter);
	}

	public String getText() {
		return editText.getText().toString();
	}

	@Override
	public void onClick(View view) {
		int id = view.getId();
		switch(id) {
			case R.id.mainBtn1:
			case R.id.mainBtn2:
				Toast.makeText(this, R.string.main_btn_press, Toast.LENGTH_SHORT).show();
				break;
			case R.id.mainBtnDlg:
				showDialog();
				break;
		}
	}

	private void showDialog() {
		Dialog dialog = new Dialog(this);

		dialog.setTitle(R.string.main_dialog_title);
		dialog.setContentView(R.layout.main_dialog);

		dialog.setOwnerActivity(this);
		new MainDialogListener(dialog, editText);
		dialog.show();
	}
}
