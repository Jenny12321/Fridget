package hack.refrigerator;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
/**
 * Created by chansuo on 2017-05-27.
 */

public class Add_Food extends Activity{

        /** Called when the activity is first created. */
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.adding_food_form);

            Button next = (Button) findViewById(R.id.ButtonSendFeedback);
            next.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent();
                    setResult(RESULT_OK, intent);
                    finish();
                }

            });
        }
}
