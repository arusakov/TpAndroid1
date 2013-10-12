package technopark.TpAndroid1.otherpages;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import technopark.TpAndroid1.R;

public class ActivityPage1 extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.page1);

		TextView text1 = (TextView) findViewById(R.id.page1text1);
		TextView text2 = (TextView) findViewById(R.id.page1text2);

		Bundle extras = getIntent().getExtras();
		char str[] = extras.getCharArray(getResources().getString(R.string.ROUTE_TEXT));
		if (str.length != 0) {
			text1.setText(str, 0, str.length);
			text2.setText(str, 0, str.length);
		}
	}
}