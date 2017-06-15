package kiitapp.com.rsf;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by user on 6/15/2017.
 */
public class pledgefrag extends Fragment{
    /**
     * Created by user on 6/15/2017.
     */

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

            View v = inflater.inflate(R.layout.pledge,container,false);
            return v;
        }
}
