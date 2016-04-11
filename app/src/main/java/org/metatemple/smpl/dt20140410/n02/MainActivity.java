package org.metatemple.smpl.dt20140410.n02;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		this.set_the_txt_change();
    }
	
	public void set_the_txt_change ()
	{
		// This is where we call findViewByID to get
		// a TextView object referencing the text
		// display area who's text we wish to change.
		TextView tx_slot = (TextView)findViewById(R.id.hello_text);
		
		// And here, we call the TextView's method to
		// change the text displayed in that text
		// display. Clearly, referencing a string
		// in the string XML file is easier than
		// getting the TextView itself.
		tx_slot.setText(R.string.hello_out);
	}
}
