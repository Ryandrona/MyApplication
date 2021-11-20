package com.example.myapplication.Activities;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.google.android.material.textfield.TextInputLayout;

import java.util.regex.Pattern;

public class RegisterActivity extends AppCompatActivity {
    ImageView IMG_signup_back;
    Button BTN_signup_next;
    TextView TXT_signup_title;
    TextInputLayout TXTL_signup_HoVaTen, TXTL_signup_TenDN, TXTL_signup_Email, TXTL_signup_SDT, TXTL_signup_MatKhau;
    public static final String BUNDLE = "BUNDLE";
    private static final Pattern PASSWORD_PATTERN =
            Pattern.compile("^" +
                    //"(?=.*[@#$%^&+=])" +     // at least 1 special character
                    "(?=\\S+$)" +            // no white spaces
                    ".{6,}" +                // at least 6 characters
                    "$");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_layout);

        //region lấy đối tượng view
        IMG_signup_back = (ImageView)findViewById(R.id.img_signup_back);
        BTN_signup_next = (Button)findViewById(R.id.btn_signup_next);
        TXT_signup_title = (TextView)findViewById(R.id.txt_signup_title);
        TXTL_signup_HoVaTen = (TextInputLayout)findViewById(R.id.txtl_signup_HoVaTen);
        TXTL_signup_TenDN = (TextInputLayout)findViewById(R.id.txtl_signup_TenDN);
        TXTL_signup_Email = (TextInputLayout)findViewById(R.id.txtl_signup_Email);
        TXTL_signup_SDT = (TextInputLayout)findViewById(R.id.txtl_signup_SDT);
        TXTL_signup_MatKhau = (TextInputLayout)findViewById(R.id.txtl_signup_MatKhau);
        //endregion
    }
}
