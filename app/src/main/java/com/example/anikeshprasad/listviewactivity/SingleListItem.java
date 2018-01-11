package com.example.anikeshprasad.listviewactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Anikesh Prasad on 18-01-2017.
 */

public class SingleListItem extends Activity {
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.single_list_item_view);
        TextView txtProduct=(TextView)findViewById(R.id.product_label);
        Intent i=getIntent();
        String product=i.getStringExtra("product");
        txtProduct.setText(product);
    }
}
