package com.mediatechindo.wahyu.materialuikit.template.ActivityCategory.Style26;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.mediatechindo.wahyu.materialuikit.R;

import java.util.ArrayList;

public class ActivityStyle26Activity extends AppCompatActivity implements View.OnClickListener {
    ArrayList<ActivityStyle26Model> rowListItem;
    ActivityStyle26Adapter rcAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity26_layout);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowTitleEnabled(true);
            actionBar.setTitle("Remi Boucher");
        }

        rowListItem = getAllItemList();
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        RecyclerView rView = (RecyclerView) findViewById(R.id.recyclerView);
        rView.setHasFixedSize(false);
        rView.setLayoutManager(layoutManager);
        rView.setNestedScrollingEnabled(false);

        rcAdapter = new ActivityStyle26Adapter(this, rowListItem);
        rView.setAdapter(rcAdapter);

    }

    private ArrayList<ActivityStyle26Model> getAllItemList(){
        ArrayList<ActivityStyle26Model> allItems = new ArrayList<>();
        ActivityStyle26Model dt;

        dt = new ActivityStyle26Model(false, getResources().getString(R.string.lorem_ipsum2), false, "02:34");
        allItems.add(dt);
        dt = new ActivityStyle26Model(true, "Met me at 10 PM", false, "01:34");
        allItems.add(dt);

        dt = new ActivityStyle26Model(false, "", true, "02:34");
        allItems.add(dt);
        dt = new ActivityStyle26Model(true, "Wow that's great!", false, "01:34");
        allItems.add(dt);

        dt = new ActivityStyle26Model(false, getResources().getString(R.string.lorem_ipsum2), false, "02:34");
        allItems.add(dt);
        dt = new ActivityStyle26Model(true, "Ok", false, "01:34");
        allItems.add(dt);

        return  allItems;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                break;
            case R.id.action_settings:
                Toast.makeText(this, "action setting clicked!", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
        return true;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.buttonMore:
                Toast.makeText(this, "Button more clicked!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_attachment:
                Toast.makeText(this, "Button attachment clicked!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonSend:
                Toast.makeText(this, "Button send clicked!", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}
