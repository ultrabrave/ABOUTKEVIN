package cl.enexo.aboutkevin;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ContactActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        TextView tvlink = (TextView) findViewById(R.id.tv_linkedin);
        TextView tvfont = (TextView) findViewById(R.id.tv_phone);
        tvlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("http://cl.linkedin.com/in/kevin-fernandez-75bb97111"));
                startActivity(i);
                //https://www.linkedin.com
            }
        });
        tvfont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent i = new Intent(Intent.ACTION_CALL);
                i.setData(Uri.parse("tel: +56971856022"));
                startActivity(i);
            }
        });
    }
}
