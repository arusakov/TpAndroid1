package technopark.TpAndroid1.otherpages;

import android.app.Activity;
import android.os.Bundle;
import technopark.TpAndroid1.R;

public class ActivityPage2 extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

//		requestWindowFeature(Window.FEATURE_NO_TITLE);
//		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//		                     WindowManager.LayoutParams.FLAG_FULLSCREEN);

		setContentView(R.layout.page2);
	}
}