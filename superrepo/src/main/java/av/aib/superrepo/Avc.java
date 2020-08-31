package av.aib.superrepo;

import android.content.Context;
import android.widget.Toast;

public class Avc {

    public static void toast(Context context, String content) {
        Toast.makeText(context, content, Toast.LENGTH_LONG).show();
    }
}
