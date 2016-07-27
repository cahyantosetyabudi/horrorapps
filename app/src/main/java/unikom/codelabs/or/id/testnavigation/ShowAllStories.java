package unikom.codelabs.or.id.testnavigation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ShowAllStories extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_all_stories);

        ListActivity listActivity = new ListActivity();
        final ArrayAdapter arrayAdapter = new ArrayAdapter(this,R.layout.list,R.id.list_item,listActivity.arrayList);
        final ListView listView = (ListView) findViewById(R.id.listView_story);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedFromList = (String) listView.getItemAtPosition(position);
                Toast.makeText(ShowAllStories.this,selectedFromList,Toast.LENGTH_SHORT).show();
                Bundle bundle = new Bundle();
                bundle.putString("SelectedProperty",selectedFromList);
                Intent intent = new Intent(ShowAllStories.this,Chapter.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
