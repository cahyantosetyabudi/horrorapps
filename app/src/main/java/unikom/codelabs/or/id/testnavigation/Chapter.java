package unikom.codelabs.or.id.testnavigation;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Chapter extends AppCompatActivity {
    public String selectedFromList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter);

        Bundle bundle = getIntent().getExtras();
        selectedFromList = bundle.getString("SelectedProperty");

        TextView textView = (TextView) findViewById(R.id.label_chapterList);
        textView.setText(selectedFromList);

        ListActivity listActivity = new ListActivity();
        final ArrayAdapter arrayAdapter = new ArrayAdapter(this,R.layout.list,R.id.list_item,listActivity.arrayChapter);
        final ListView listView = (ListView) findViewById(R.id.listView_chapter);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Bundle bundleStory = new Bundle();
                bundleStory.putString("SelectedProperty",selectedFromList);

                Intent intent = new Intent(Chapter.this,StoryText.class);
                intent.putExtras(bundleStory);
                startActivity(intent);
            }
        });
    }
}
