package eu.siacs.conversations.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import eu.siacs.conversations.R;
import eu.siacs.conversations.utils.ThemeHelper;

import static eu.siacs.conversations.ui.XmppActivity.configureActionBar;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setTheme(ThemeHelper.find(this));

        setContentView(R.layout.activity_about);
        setSupportActionBar(findViewById(R.id.toolbar));
        configureActionBar(getSupportActionBar());
    }

    public void myUpdate(View view) {
        //Intent myIntent = new Intent(this, ShowNote.class);
        //   Intent myIntent = new Intent(this, eu.siacs.conversations.ShowNote);
        //   myIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        //   startActivity(myIntent);
    }
}