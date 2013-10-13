package technopark.TpAndroid1.mainpage;

import android.app.Dialog;
import android.view.View;
import android.widget.EditText;
import technopark.TpAndroid1.R;

public class MainDialogListener implements View.OnClickListener {

	private Dialog dialog;
	private EditText dest;

	public MainDialogListener(Dialog d, EditText dst) {
		dialog = d;
		dest =  dst;

		dialog.findViewById(R.id.dlgBtnOk).setOnClickListener(this);
		dialog.findViewById(R.id.dlgBtnCancel).setOnClickListener(this);
	}

	@Override
	public void onClick (View v) {
		if (v.getId() == R.id.dlgBtnOk) {
			EditText source = (EditText) dialog.findViewById(R.id.dlgText);
			String str = source.getText().toString();
			if (str.length() == 0) {
				str = dialog.getOwnerActivity().getResources().getString(R.string.NOT_TEXT);
			}
			dest.setText(str);
		}
		dialog.dismiss();
	}
}
