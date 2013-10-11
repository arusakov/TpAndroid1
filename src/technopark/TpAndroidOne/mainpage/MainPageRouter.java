package technopark.TpAndroidOne.mainpage;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import technopark.TpAndroidOne.otherpages.ActivityPage1;
import technopark.TpAndroidOne.otherpages.ActivityPage2;
import technopark.TpAndroidOne.otherpages.ActivityPage3;
import technopark.TpAndroidOne.R;

public class MainPageRouter implements View.OnClickListener {

	Activity activity;

	public MainPageRouter(Activity a) {
		activity = a;
	}

	@Override
	public void onClick(View view) {
		int id = view.getId();
		Intent intent = new Intent();

		switch (id) {
			case R.id.mainLeftBtn:
				intent.setClass(activity, ActivityPage1.class);
				break;
			case R.id.mainCenterBtn:
				intent.setClass(activity, ActivityPage2.class);
				break;
			case R.id.mainRightBtn:
				intent.setClass(activity, ActivityPage3.class);
				break;
			default:
				return;
		}
		activity.startActivity(intent);
	}
}
