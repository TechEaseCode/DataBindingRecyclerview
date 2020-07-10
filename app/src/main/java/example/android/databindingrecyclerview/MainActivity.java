package example.android.databindingrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import example.android.databindingrecyclerview.databinding.ActivityMainBinding;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;
    UserAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        activityMainBinding.recyclerview.setLayoutManager(new LinearLayoutManager(this));

        adapter = new UserAdapter(populateRecyclerView(), this);

        activityMainBinding.recyclerview.setAdapter(adapter);




    }

    public List<User> populateRecyclerView(){
        List<User> userList = new ArrayList<>();
        userList.add(new User("Tom", 12, R.drawable.one));
        userList.add(new User("Dan", 13, R.drawable.two));
        userList.add(new User("Zayn", 18, R.drawable.three));
        userList.add(new User("Hannah", 16, R.drawable.four));
        userList.add(new User("Eddy", 16, R.drawable.five));
        userList.add(new User("Burce", 11, R.drawable.six));
        userList.add(new User("Bill", 18, R.drawable.seven));
        userList.add(new User("Lucy", 14, R.drawable.eight));
        userList.add(new User("Logan", 16, R.drawable.nine));
        userList.add(new User("Jake", 13, R.drawable.ten));
        userList.add(new User("Eva", 19, R.drawable.eleven));
        userList.add(new User("Leo", 17, R.drawable.twelve));
        userList.add(new User("Derek", 11, R.drawable.thirteen));
        userList.add(new User("Tim", 13, R.drawable.fourteen));
        userList.add(new User("Elon", 15, R.drawable.fifteen));
        userList.add(new User("Jeff", 16, R.drawable.sixteen));
        userList.add(new User("Kim", 18, R.drawable.one));

        return userList;
    }

}
