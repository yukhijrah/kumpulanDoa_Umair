package decloudius.app.kumpulandoa.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Umair on 11/1/2018.
 */


public class ContainerAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> fragments = new ArrayList<>();
    private List<String> labels = new ArrayList<>(); // TODO(Optional LOL)

    public ContainerAdapter(FragmentManager fm) {
        super(fm);
    }

    public void addFragment(Fragment fragment, String label){
        fragments.add(fragment);
        labels.add(label);
    }

    public String getLabel(int position){
        return labels.get(position);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
