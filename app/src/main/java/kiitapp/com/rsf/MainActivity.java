package kiitapp.com.rsf;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import  com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.BottomBarTab;
import com.roughike.bottombar.OnMenuTabClickListener;

import android.view.Menu;

public class MainActivity extends AppCompatActivity {
    BottomBar mBottomBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBottomBar = (BottomBar) findViewById(R.id.mb);
        mBottomBar.setItemsFromMenu(R.menu.main, new OnMenuTabClickListener()
        {
            @Override
            public void onMenuTabSelected(@IdRes int menuItemId) {
                if( menuItemId == R.id.Bottombaritemone)
                {
                    aboutusfrag f =new aboutusfrag();
                    getFragmentManager().beginTransaction().replace(R.id.frame,f).commit();
                }
                else
                if( menuItemId == R.id.Bottombaritemtwo)
                {
                    projectsfrag f =new projectsfrag();
                    getFragmentManager().beginTransaction().replace(R.id.frame,f).commit();
                }
                else
                if( menuItemId == R.id.Bottombaritemthree)
                {
                    pledgefrag f =new pledgefrag();
                    getFragmentManager().beginTransaction().replace(R.id.frame,f).commit();
                }
                else
                if( menuItemId == R.id.Bottombaritemfour)
                {
                    ourteamfrag f =new ourteamfrag();
                    getFragmentManager().beginTransaction().replace(R.id.frame,f).commit();
                }
                else
                if( menuItemId == R.id.Bottombaritemfive)
                {
                    contactsfrag f =new contactsfrag();
                    getFragmentManager().beginTransaction().replace(R.id.frame,f).commit();
                }
                else
                if( menuItemId == R.id.Bottombaritemsix)
                {
                    morefreag f =new morefreag();
                    getFragmentManager().beginTransaction().replace(R.id.frame,f).commit();
                }




            }

            @Override
            public void onMenuTabReSelected(@IdRes int menuItemId) {

            }
        });

        mBottomBar.mapColorForTab(0,"#EE5543");
        mBottomBar.mapColorForTab(1,"#EE5543");
        mBottomBar.mapColorForTab(2,"#EE5543");
        mBottomBar.mapColorForTab(3,"#EE5543");
        mBottomBar.mapColorForTab(4,"#EE5543");
        mBottomBar.mapColorForTab(5,"#EE5543");
    }
}
