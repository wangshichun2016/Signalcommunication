package chat.signal.com.signalcommunication;

import android.content.Context;
import android.widget.Toast;

/**
 * 作    者：高学军
 * 时    间：16/10/20
 * 描    述：
 * 修改时间：
 */
public class ToastUtil {



    public static Toast mToast;

    public static void show(Context context, String info) {
        if (null != context && null != info && !info.equals("")) {
            Toast.makeText(context, info, Toast.LENGTH_SHORT).show();
        }
    }
}
