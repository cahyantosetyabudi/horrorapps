package unikom.codelabs.or.id.testnavigation;

import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class StoryText extends AppCompatActivity {
    protected String selectedFromList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_text);

        Bundle bundle = getIntent().getExtras();
        selectedFromList = bundle.getString("SelectedProperty");

        TextView textView = (TextView) findViewById(R.id.label_Story);
        textView.setText(selectedFromList);
    }

    @Nullable
    @Override
    public Intent getParentActivityIntent() {
        Bundle bundleStory = new Bundle();
        bundleStory.putString("SelectedProperty",selectedFromList);

        Intent intent = super.getParentActivityIntent();
        intent.putExtras(bundleStory);
        return intent;
    }
}