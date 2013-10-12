package technopark.TpAndroid1.mainpage;

import android.content.Intent;
import android.view.View;
import technopark.TpAndroid1.otherpages.ActivityPage1;
import technopark.TpAndroid1.otherpages.ActivityPage2;
import technopark.TpAndroid1.otherpages.ActivityPage3;
import technopark.TpAndroid1.R;

public class MainPageRouter implements View.OnClickListener {

	private ActivityMain activity;

	public MainPageRouter(ActivityMain a) {
		activity = a;
	}

	@Override
	public void onClick(View view) {
		int id = view.getId();
		Intent intent = new Intent();

		switch (id) {
			case R.id.mainLeftBtn:
				intent.setClass(activity, ActivityPage1.class);
				char s[] = activity.getText().toCharArray();
				intent.putExtra(activity.getResources().getString(R.string.ROUTE_TEXT), s);
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
