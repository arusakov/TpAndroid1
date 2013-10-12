package technopark.TpAndroid1.otherpages;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import technopark.TpAndroid1.R;

public class ActivityPage3 extends Activity implements View.OnClickListener {

	private Button btnDlg;
	private boolean showDlg;
	private Dialog dialog;
	private CheckBox box;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.page3);

		showDlg = true;

		btnDlg = (Button)findViewById(R.id.page3dialogbtn);
		btnDlg.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		int id = v.getId();

		switch(id) {
			case R.id.page3dialogbtn:
				if (showDlg) {
					showDialog();
				}
				break;
			case R.id.page3BtnOk:
				CheckBox box = (CheckBox) dialog.findViewById(R.id.page3checkbox);
				if (box.isChecked()) {
					showDlg = false;
				}
			case R.id.page3BtnCancel:
				dialog.dismiss();
				break;
		}
	}

	private void showDialog() {
		dialog = new Dialog(this);

		dialog.setTitle(R.string.main_dialog_title);
		dialog.setContentView(R.layout.page3_dialog);

		dialog.findViewById(R.id.page3BtnOk).setOnClickListener(this);
		dialog.findViewById(R.id.page3BtnCancel).setOnClickListener(this);

		dialog.show();
	}
}