package com.example.radiobutton;
import android.app.Activity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends Activity
{
	//Defining the radiobutton as r1,r2,r3 respectively
	RadioButton r1,r2,r3;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//Refer the radio button with their respective id's from XML
		r1=(RadioButton)findViewById(R.id.radioButton1);
		r2=(RadioButton)findViewById(R.id.radioButton2);
		r3=(RadioButton)findViewById(R.id.radioButton3);
		
		//Set the listener for radio button, we use oncheckedchanged listener here 
		r1.setOnCheckedChangeListener(new OnCheckedChangeListener()
		{
		@Override
		public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
		{
		// TODO Auto-generated method stub
		// Set the condition for radiobutton
		if(isChecked)
		{
		r2.setChecked(false);
		r3.setChecked(false);
		// Set the Toast message on radiobutton click
		Toast.makeText(getApplicationContext(), "Classic Account",Toast.LENGTH_LONG).show();
		}
		}
		});
		           
		r2.setOnCheckedChangeListener(new OnCheckedChangeListener()
		{
		@Override
		public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
		{
		// TODO Auto-generated method stub
		//Set the condition for radiobutton
		if(isChecked)
		{
		r1.setChecked(false);
		r3.setChecked(false);
		//Set the Toast message on radiobutton r2 click
		Toast.makeText(getApplicationContext(), "Gold Account",Toast.LENGTH_LONG).show();
		}
		}
		});

		r3.setOnCheckedChangeListener(new OnCheckedChangeListener()
		{
		@Override
		public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
		{
		// TODO Auto-generated method stub
		//Set the condition for radiobutton
		if(isChecked)
		{
		r2.setChecked(false);
		r1.setChecked(false);
		//Set the Toast message on radiobutton r3  click
		Toast.makeText(getApplicationContext(), "Platinum Account",Toast.LENGTH_LONG).show();
		}
		}
		});
	}

	
}
