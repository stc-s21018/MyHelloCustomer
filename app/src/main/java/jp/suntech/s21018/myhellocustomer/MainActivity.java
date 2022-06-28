package jp.suntech.s21018.myhellocustomer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btClick = findViewById(R.id.btClick);
        HelloListener listener = new HelloListener();
        btClick.setOnClickListener(listener);

        Button btClear = findViewById(R.id.btClear);
        btClear.setOnClickListener(listener);

        Button btName = findViewById(R.id.btName);
        btName.setOnClickListener(listener);
    }

    private class HelloListener implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            
            EditText input = findViewById(R.id.etPrace);
            EditText input2 = findViewById(R.id.etName);
            TextView output = findViewById(R.id.tvOutput);
            TextView output2 = findViewById(R.id.tvOutput2);

            int id = view.getId();
            switch (id){
                case R.id.btClick:
                    String inputStr = input.getText().toString();
                    output.setText(inputStr + "にお住いの ");
                    String inputStr2 = input2.getText().toString();
                    output2.setText(inputStr2 + "さん、こんにちは！");
                    break;
                case R.id.btClear:
                    input.setText("");
                    output.setText("");
                    break;
                case R.id.btName:
                    input2.setText("");
                    output2.setText("");
                    break;
            }
        }
    }
}