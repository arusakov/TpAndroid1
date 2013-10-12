package technopark.TpAndroidOne.mainpage;

import android.app.Dialog;
import android.view.View;
import android.widget.EditText;
import technopark.TpAndroidOne.R;

public class MainDialogListener implements View.OnClickListener {

	Dialog dialog;
	EditText source, dest;

	public MainDialogListener(Dialog d, EditText s, EditText dst) {
		dialog = d;
		source = s;
		dest =  dst;
	}

	@Override
	public void onClick (View v) {
		if (v.getId() == R.id.dlgBtnOk && source.getText().length() != 0) {
			dest.setText(source.getText().toString());
		}
		dialog.dismiss();
	}
}
