package com.example.doctorconsultantapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class ManageGalleryActivity extends AppCompatActivity {
   TabLayout tb1;
   ViewPager vp111;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_gallery);
        tb1= findViewById(R.id.tb1);
        vp111= findViewById(R.id.vp111);

        tb1.addTab(tb1.newTab().setText("ADD"));
        tb1.addTab(tb1.newTab().setText("VIEW"));

        myadapter myad = new myadapter(getSupportFragmentManager());
        vp111.setAdapter(myad);

        tb1.setupWithViewPager(vp111);

    }

    ///Inner class///
    class myadapter extends FragmentPagerAdapter
    {
        myadapter(FragmentManager frm)
        {
            super(frm);

        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            if (position==0)
            {
                return (new AddFrag());

            }
            else
               return (new ViewFrag());
        }

        @Override
        public int getCount() {
            return 2;
        }

        @Nullable
        @Override

        public CharSequence getPageTitle(int position){
            if (position == 0)
            {
                return "Add";

            }
          else
              return "View";
        }





    }

}
