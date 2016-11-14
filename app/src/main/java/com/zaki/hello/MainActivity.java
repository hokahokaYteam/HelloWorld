package com.zaki.hello;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] members = {"item01", "item02", "item03"};
        lv = (ListView) findViewById(R.id.list_item);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, members);
        lv.setAdapter(adapter);

//        TextView textView = (TextView) findViewById(R.id.text01);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                ListView listView = (ListView) parent;
                String item = (String) listView.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), item + "clicked", Toast.LENGTH_SHORT).show();

//AlertDialogの発生
//                LayoutInflater inflater = LayoutInflater.from(MainActivity.this);
//                final View inputView = inflater.inflate(R.layout.dialog, null);
//                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
//                builder.setMessage("AlertDialog");
//                builder.setView(inputView);
//                builder.create().show();
//            }
            }

//        }

//    }

        });
    }
}