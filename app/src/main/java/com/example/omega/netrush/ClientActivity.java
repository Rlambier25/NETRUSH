package com.example.omega.netrush;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;

public class ClientActivity extends AppCompatActivity {
    private String[] clients = new String[] {"BenchMade", "Big Agnes", "Leathermen", "Eno", "Enzyme Science", "EASTWEST BOTTLERS", "INNATE", "DO ALL OUTDOORS", "BOOMBOTIX", "Manuka Health", "LED LENSER", "Natural Factors", "NORDIC NATURALS", "PETTURA", "PETZL", "RESERVAGE Nutrition", "SHWOOD","SUNWARRIOR", "MegaFood", "ASTI", "Bob's Red Mill", "EDELRID"};

    @Bind(R.id.listView) ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client);

        mListView = (ListView) findViewById(R.id.listView);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, clients);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String restaurant = ((TextView)view).getText().toString();
                Toast.makeText(ClientActivity.this, restaurant, Toast.LENGTH_LONG).show();
            }
        });
    }
}
