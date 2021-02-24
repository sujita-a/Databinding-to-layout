package edu.tu.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;


import edu.tu.databinding.databinding.ActivitySecondBinding;

public class MainActivity extends AppCompatActivity {

    private int i = 0;
    private ActivitySecondBinding binding;//Object of binding will be xml File name followed by "Binding" at the end
    private List<User> mList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_second);
        Button btnChange = findViewById(R.id.btn_change);
        mList.add(new User("Ripu", "22", "Nepal"));
        mList.add(new User("Kumar", "23", "India"));
        mList.add(new User("Fuada", "24", "Iserail"));
        mList.add(new User("Sirin", "25", "UAE"));
        mList.add(new User("Ola", "26", "USA"));

        updateUI(mList.get(i));
        i++;
        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateUI(mList.get(i));
                i++;
                if (i == mList.size())
                    i = 0;
            }
        });

        /*User user = new User();
        user.setName("Aditya");
        user.setAge("20");
        user.setAddress("Nepal");*/

    }

    private void updateUI(User user) {
        binding.setAbcd(user);
    }
}