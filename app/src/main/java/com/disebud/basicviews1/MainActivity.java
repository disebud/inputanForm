package com.disebud.basicviews1;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //---Button view---
        Button btnOpen = (Button) findViewById(R.id.btnOpen);
        btnOpen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                DisplayToast("You have clicked the Open button");
            }
        });
        //---Button Save view---
        Button btnSave = (Button) findViewById(R.id.btnSave);
        btnSave.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                DisplayToast("You have clicked the Save button");
            }
        });
        //---Button Image view---
        ImageButton btnImg = (ImageButton) findViewById(R.id.btnImg1);
        btnImg.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                DisplayToast("You have clicked the Image button");
            }
        });
        //---CheckBox AutoSave---
        CheckBox checkBox = (CheckBox) findViewById(R.id.chkAutosave);
        checkBox.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    DisplayToast("CheckBox is checked");
                else
                    DisplayToast("CheckBox is unchecked");
            }
        });
        //---CheckBox Start---
        CheckBox checkBoxStart = (CheckBox) findViewById(R.id.star);
        checkBoxStart.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    DisplayToast("Start 1 is checked");
                else
                    DisplayToast("Start 1 is unchecked");
            }
        });
        //---CheckBox Start---
        CheckBox checkBoxStart2 = (CheckBox) findViewById(R.id.star2);
        checkBoxStart2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    DisplayToast("Start 2 is checked");
                else
                    DisplayToast("Start 2 is unchecked");
            }
        });
        //---CheckBox Start---
        CheckBox checkBoxStart3 = (CheckBox) findViewById(R.id.star3);
        checkBoxStart3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    DisplayToast("Start 3 is checked");
                else
                    DisplayToast("Start 3 is unchecked");
            }
        });
        //---CheckBox Start---
        CheckBox checkBoxStart4 = (CheckBox) findViewById(R.id.star4);
        checkBoxStart4.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    DisplayToast("Start 4 is checked");
                else
                    DisplayToast("Start 4 is unchecked");
            }
        });
        //---CheckBox Start---
        CheckBox checkBoxStart5 = (CheckBox) findViewById(R.id.star5);
        checkBoxStart5.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    DisplayToast("Start 5 is checked");
                else
                    DisplayToast("Start 5 is unchecked");
            }
        });
        //---CheckBox Start---
        CheckBox checkBoxStart6 = (CheckBox) findViewById(R.id.star6);
        checkBoxStart6.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    DisplayToast("Start 6 is checked");
                else
                    DisplayToast("Start 6 is unchecked");
            }
        });
        //---RadioButton---
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.rdbGp1);
        radioGroup.setOnCheckedChangeListener(
                new RadioGroup.OnCheckedChangeListener()
                {
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        RadioButton rb1 = (RadioButton) findViewById(R.id.rdb1);
                        RadioButton rb2 = (RadioButton) findViewById(R.id.rdb2);
                        RadioButton rb3 = (RadioButton) findViewById(R.id.rdb3);
                        if (rb1.isChecked()) {
                            DisplayToast("Option 1 checked!");
                        } else if (rb2.isChecked()) {
                            DisplayToast("Option 2 checked!");
                        } else if (rb3.isChecked()) {
                            DisplayToast("Option 3 checked!");
                        }else {
                            DisplayToast("Option 4 checked!");
                        }
                    }
                });
        //---ToggleButton---
        ToggleButton toggleButton =
                (ToggleButton) findViewById(R.id.toggle1);
        toggleButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked())
                    DisplayToast("Toggle button is On");
                else
                    DisplayToast("Toggle button is Off");
            }
        });
    }
    private void DisplayToast(String msg)
    {
        Toast.makeText(getBaseContext(), msg,
                Toast.LENGTH_SHORT).show();
    }
}