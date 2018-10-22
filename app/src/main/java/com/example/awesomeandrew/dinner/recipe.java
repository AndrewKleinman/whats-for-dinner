package com.example.awesomeandrew.dinner;

import android.content.Intent;
import android.graphics.drawable.Icon;
import android.media.Image;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class recipe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);



        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {

            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view,
                                           int position, long id) {
                Intent intent = new Intent(getApplicationContext(),newDish.class);
                TextView textView = (TextView) findViewById(R.id.textView30);
                intent.putExtra("1",(String)textView.getText());
                textView = (TextView) findViewById(R.id.textView7);
                intent.putExtra("3",(String)textView.getText());
                textView = (TextView) findViewById(R.id.textView6);
                intent.putExtra("2",(String)textView.getText());
                startActivity(intent);
                return true;
            }

        });
listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            Intent intent = new Intent(getApplicationContext(),meals.class);
            TextView textView = (TextView) findViewById(R.id.textView30);
            intent.putExtra("1",(String)textView.getText());
        };

    });
TextView textView30 = (TextView) findViewById(R.id.textView30);
textView30.setText(handleSendText(getIntent()));
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageDrawable(handleSentImage(getIntent()));
        TextView textView6 = (TextView) findViewById(R.id.textView6);
        for(int i =0;i<10;i++)
        {
            textView6.setText(textView6.getText()+handleSendText(getIntent())+"\n");
        }
        TextView textView31 = (TextView) findViewById(R.id.textView31);
        textView31.setText("nutrition value:\n"+handleSendText(getIntent()));
        TextView textView7 = (TextView) findViewById(R.id.textView7);
        textView7.setText("Directions:\n"+handleSendText(getIntent()));


};
    @Override
    public Intent getIntent() {
        return super.getIntent();
    }

    private String handleSendText(Intent intent) {
        return intent.getStringExtra(Intent.EXTRA_TEXT);
        // Update UI to reflect text being shared
    }
    private Parcelable[] handleSentImage(Intent intent)
    {
        return intent.getParcelableArrayExtra(Intent.EXTRA_STREAM);
    }

}
