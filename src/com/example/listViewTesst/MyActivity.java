package com.example.listViewTesst;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */

    private List<Fruit> fruitList = new ArrayList<Fruit>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        initFruits();//初始化水果数据
        FruitAdapter adapter = new FruitAdapter(MyActivity.this,
                R.layout.fruit_item, fruitList
        );
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit fruit = fruitList.get(position);
                Toast.makeText(MyActivity.this,fruit.getName(),Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void initFruits() {
        Fruit apple = new Fruit("Apple", R.drawable.ic_launcher);
        fruitList.add(apple);
        Fruit banana = new Fruit("Banana", R.drawable.ic_launcher);
        fruitList.add(banana);
        Fruit orange = new Fruit("Orange", R.drawable.ic_launcher);
        fruitList.add(orange);
        Fruit watermelon = new Fruit("Watermelon", R.drawable.ic_launcher);
        fruitList.add(watermelon);
        Fruit pear = new Fruit("Pear", R.drawable.ic_launcher);
        fruitList.add(pear);
        Fruit grape = new Fruit("Grape", R.drawable.ic_launcher);
        fruitList.add(grape);
        Fruit pineapple = new Fruit("Pineapple", R.drawable.ic_launcher);
        fruitList.add(pineapple);
        Fruit strawberry = new Fruit("Strawberry", R.drawable.ic_launcher);
        fruitList.add(strawberry);
        Fruit cherry = new Fruit("Cherry", R.drawable.ic_launcher);
        fruitList.add(cherry);
        Fruit mango = new Fruit("Mango", R.drawable.ic_launcher);
        fruitList.add(mango);

    }


//    private String [] data={"Apple","Banana","Orange","Watermelon",
//            "Pear","Grape","Pineapple","Strawberry","Cherry","Mango",
//            "test1","test2","test3","test4","test5","test6","test7",
//    };
//    @Override
//    protected void onCreate(Bundle savedInstanceState){
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.main);
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
//                MyActivity.this,android.R.layout.simple_list_item_1,data
//        );
//        ListView listView = (ListView) findViewById(R.id.list_view);
//        listView.setAdapter(adapter);
//    }

}
