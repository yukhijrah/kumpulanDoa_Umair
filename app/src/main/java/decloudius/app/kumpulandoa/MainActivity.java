package decloudius.app.kumpulandoa;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import decloudius.app.kumpulandoa.adapter.ContainerAdapter;
import decloudius.app.kumpulandoa.fragment.DoaFragment;
import decloudius.app.kumpulandoa.fragment.HomeFragment;
import decloudius.app.kumpulandoa.fragment.ProfileFragment;
import decloudius.app.kumpulandoa.model.ModelAdzan;

/**
 * Created by Umair on 11/1/2018.
 */


public class MainActivity extends AppCompatActivity{

    private ViewPager vpMain;
    private Button btnHome, btnDoa, btnProfile;

    private ContainerAdapter adapter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //casting object(view)
        vpMain = (ViewPager) findViewById(R.id.view_pager_main);
        btnHome = (Button) findViewById(R.id.btn_home);
        btnDoa = (Button) findViewById(R.id.btn_doa);
        btnProfile = (Button) findViewById(R.id.btn_profile);

        setContainerPrepared(); //panggil method untuk prep fagment container
        onButtonClicked(); // panggil method agar button bisa di click
    }

    private void setContainerPrepared(){
        adapter = new ContainerAdapter(getSupportFragmentManager());
        adapter.addFragment(new HomeFragment(), getString(R.string.menu_home));
        adapter.addFragment(new DoaFragment(), getString(R.string.menu_doa));
        adapter.addFragment(new ProfileFragment(), getString(R.string.menu_profile));
        vpMain.setAdapter(adapter);
    }

    private void onButtonClicked(){
        //ini untuk handle click button pada btnHome
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vpMain.setCurrentItem(0);
            }
        });
        //ini untuk handle click button pada btnDoa
        btnDoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vpMain.setCurrentItem(1);
            }
        });
        //ini untuk handle click button pada btnProfile
        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vpMain.setCurrentItem(2);
            }
        });
    }
}
