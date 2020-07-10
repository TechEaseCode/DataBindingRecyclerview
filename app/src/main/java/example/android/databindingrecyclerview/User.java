package example.android.databindingrecyclerview;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

public class User {

    private String name;

    private int age;

    private int imageId;

    public User(String name, int age, int imageId) {
        this.name = name;
        this.age = age;
        this.imageId = imageId;
    }

    @BindingAdapter("imageUrl")
    public static void setImageRes(ImageView imageView, int res){
        imageView.setImageResource(res);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getImageId() {
        return imageId;
    }


}
