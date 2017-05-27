package hack.refrigerator;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import hack.refrigerator.Globals;

public class PageAddFood extends Activity{

    /** Called when the activity is first created. */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_add);

        Button next = (Button) findViewById(R.id.btn_submit);

        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //stores info
                String name;
                int quantity;
                int expDay;
                int expMonth;
                int expYear;
                String Group;

                RadioGroup radioGroup;
                RadioButton radioButton;
                radioGroup = (RadioGroup) findViewById(R.id.radio_buttons);
                int selected = radioGroup.getCheckedRadioButtonId();
                radioButton = (RadioButton) findViewById(selected);
                Group=radioButton.getText().toString();

                EditText nameText = (EditText)findViewById(R.id.editText_name);
                name = nameText.getText().toString();

                EditText quantText = (EditText)findViewById(R.id.editText_quant);
                quantity = Integer.parseInt(quantText.getText().toString());

                EditText expDayText = (EditText)findViewById(R.id.editText_expDay);
                expDay = Integer.parseInt(expDayText.getText().toString());

                EditText expMonthText = (EditText)findViewById(R.id.editText_expMonth);
                expMonth = Integer.parseInt(expMonthText.getText().toString());

                EditText expYearText = (EditText)findViewById(R.id.editText_expYear);
                expYear = Integer.parseInt(expYearText.getText().toString());

                Food new_food = new Food(getApplicationContext(), name, expDay, expMonth, expYear, quantity, Group);
                Globals.foods.add(new_food);

                Intent intent = new Intent();
                setResult(RESULT_OK, intent);
                finish();
            }

        });
    }
}