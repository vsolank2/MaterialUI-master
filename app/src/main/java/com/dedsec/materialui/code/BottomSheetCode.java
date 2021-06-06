package com.dedsec.materialui.code;

import android.os.Handler;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.dedsec.materialui.R;
import com.dedsec.materialui.adapter.SectionPagerAdapter;
import com.dedsec.materialui.fragment.JAVACodeFrag;
import com.dedsec.materialui.fragment.XMLCodeFrag;
import com.dedsec.materialui.utils.Tools;

import java.io.IOException;
import java.io.InputStream;

import io.github.kbiakov.codeview.classifier.CodeProcessor;

public class BottomSheetCode extends AppCompatActivity {

    private ViewPager view_pager;
    private TabLayout tab_layout;
    private SectionPagerAdapter mAdapter;

    // UI references
    View parentView;
    private String codeXML, codeJAVA;
    private TextView txtTitle, txtType;

    // For Fragment
    private XMLCodeFrag xmlCodeFrag;
    private JAVACodeFrag javaCodeFrag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_sheet_code);
        CodeProcessor.init(this);

        parentView = findViewById(android.R.id.content);

        // Create Object For tab fragment
        xmlCodeFrag = new XMLCodeFrag();
        javaCodeFrag = new JAVACodeFrag();

        initToolbar();
        initComponent();

    }

    private void initToolbar() {
        final Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        txtTitle = findViewById(R.id.txt_title);
        txtType = findViewById(R.id.txt_type);
        txtTitle.setText("Bottom Sheet");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Tools.setSystemBarColor(this, R.color.colorPrimaryDark);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                toolbar.showOverflowMenu();
            }
        }, 1000);
    }

    private void initComponent() {
        view_pager = findViewById(R.id.view_pager);
        mAdapter = new SectionPagerAdapter(getSupportFragmentManager());
        view_pager.setAdapter(mAdapter);

        tab_layout = findViewById(R.id.tab_layout);
        tab_layout.setupWithViewPager(view_pager);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add("Basic");
        menu.add("List");
        menu.add("Map");
        menu.add("Floating");
        menu.add("Full");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home)
            finish();
        else if (item.getTitle() == "Basic") {
            txtType.setText(item.getTitle());
            xmlCodeFrag.setData(parentView, this,  codeCollectorXML(item));
            javaCodeFrag.setData(parentView, this, codeCollectorJAVA(item));
        } else if (item.getTitle() == "List") {
            txtType.setText(item.getTitle());
            xmlCodeFrag.setData(parentView, this, codeCollectorXML(item));
            javaCodeFrag.setData(parentView, this, codeCollectorJAVA(item));
        } else if (item.getTitle() == "Map") {
            txtType.setText(item.getTitle());
            xmlCodeFrag.setData(parentView, this, codeCollectorXML(item));
            javaCodeFrag.setData(parentView, this, codeCollectorJAVA(item));
        } else if (item.getTitle() == "Floating") {
            txtType.setText(item.getTitle());
            xmlCodeFrag.setData(parentView, this, codeCollectorXML(item));
            javaCodeFrag.setData(parentView, this, codeCollectorJAVA(item));
        } else if (item.getTitle() == "Full") {
            txtType.setText(item.getTitle());
            xmlCodeFrag.setData(parentView, this, codeCollectorXML(item));
            javaCodeFrag.setData(parentView, this, codeCollectorJAVA(item));
        }
        return super.onOptionsItemSelected(item);
    }



    // All Code Collector Method -------------------------------------------------------------------
    public String codeCollectorXML(MenuItem item) {
        if (item.getTitle() == "Basic") {
            try {
                InputStream is = getAssets().open("bottomsheetBasicXML.xml");
                int size = is.available();
                byte[] buffer = new byte[size];
                is.read(buffer);
                is.close();
                codeXML = new String(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            } return codeXML;
        } else if (item.getTitle() == "List") {
            try {
                InputStream is = getAssets().open("bottomsheetListXML.xml");
                int size = is.available();
                byte[] buffer = new byte[size];
                is.read(buffer);
                is.close();
                codeXML = new String(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            } return codeXML;
        } else if (item.getTitle() == "Map") {
            try {
                InputStream is = getAssets().open("bottomsheetMapXML.xml");
                int size = is.available();
                byte[] buffer = new byte[size];
                is.read(buffer);
                is.close();
                codeXML = new String(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            } return codeXML;
        } else if (item.getTitle() == "Floating") {
            try {
                InputStream is = getAssets().open("bottomsheetFloatingXML.xml");
                int size = is.available();
                byte[] buffer = new byte[size];
                is.read(buffer);
                is.close();
                codeXML = new String(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            } return codeXML;
        } else if (item.getTitle() == "Full") {
            try {
                InputStream is = getAssets().open("bottomsheetFullXML.xml");
                int size = is.available();
                byte[] buffer = new byte[size];
                is.read(buffer);
                is.close();
                codeXML = new String(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            } return codeXML;
        }
        return codeXML;
    }

    public String codeCollectorJAVA(MenuItem item) {
        if (item.getTitle() == "Basic") {
            try {
                InputStream is = getAssets().open("bottomsheetBasicJAVA.java");
                int size = is.available();
                byte[] buffer = new byte[size];
                is.read(buffer);
                is.close();
                codeJAVA = new String(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            } return codeJAVA;
        } else if (item.getTitle() == "List") {
            try {
                InputStream is = getAssets().open("bottomsheetListJAVA.java");
                int size = is.available();
                byte[] buffer = new byte[size];
                is.read(buffer);
                is.close();
                codeJAVA = new String(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            } return codeJAVA;
        } else if (item.getTitle() == "Map") {
            try {
                InputStream is = getAssets().open("bottomsheetMapJAVA.java");
                int size = is.available();
                byte[] buffer = new byte[size];
                is.read(buffer);
                is.close();
                codeJAVA = new String(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            } return codeJAVA;
        } else if (item.getTitle() == "Floating") {
            try {
                InputStream is = getAssets().open("bottomsheetFloatingJAVA.java");
                int size = is.available();
                byte[] buffer = new byte[size];
                is.read(buffer);
                is.close();
                codeJAVA = new String(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            } return codeJAVA;
        } else if (item.getTitle() == "Full") {
            try {
                InputStream is = getAssets().open("bottomsheetFullJAVA.java");
                int size = is.available();
                byte[] buffer = new byte[size];
                is.read(buffer);
                is.close();
                codeJAVA = new String(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            } return codeJAVA;
        }
        return codeJAVA;
    }

}
