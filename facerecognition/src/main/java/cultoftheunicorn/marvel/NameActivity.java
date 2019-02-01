package cultoftheunicorn.marvel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.opencv.cultoftheunicorn.marvel.R;

public class NameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        final EditText name = (EditText) findViewById(R.id.name);
        final EditText age=(EditText)findViewById(R.id.age);
        final EditText gender=(EditText)findViewById(R.id.gender);
        Button nextButton = (Button) findViewById(R.id.nextButton);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!name.getText().toString().equals("")&& !age.getText().toString().equals("")&&!gender.getText().toString().equals("") ) {
                    Intent intent = new Intent(NameActivity.this, Training.class);
                    intent.putExtra("name", name.getText().toString().trim());
                    intent.putExtra("age",age.getText().toString().trim());
                    intent.putExtra("gender",gender.getText().toString().trim());
                    startActivity(intent);
                }
                else {
                    Toast.makeText(NameActivity.this, "Please enter all details", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
