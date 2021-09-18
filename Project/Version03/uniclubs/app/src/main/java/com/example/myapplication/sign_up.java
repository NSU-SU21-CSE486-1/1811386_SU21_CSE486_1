package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class sign_up extends AppCompatActivity {
    private EditText edituseremail;
    private EditText edituserpassword;
FirebaseAuth auth;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        edituseremail= findViewById(R.id.useremail);
        edituserpassword= findViewById(R.id.Password);
        auth= FirebaseAuth.getInstance();

    }



    public void gotobasicscreen(View view) {

        Intent intent = new Intent(this, basic.class);

        String messagemail = edituseremail.getText().toString();
        String messagepassword = edituserpassword.getText().toString();

        if ( TextUtils.isEmpty(messagemail) || TextUtils.isEmpty(messagepassword)){
            Toast.makeText(sign_up.this, "Empty credentials!", Toast.LENGTH_SHORT).show();
        } else if (messagepassword.length() < 6){
            Toast.makeText(sign_up.this, "Password too short!", Toast.LENGTH_SHORT).show();
        } else {
            registerUser(messagemail , messagepassword);
        }
        startActivity(intent);
    }

    private void registerUser(String messagemail, String messagepassword) {
        auth.createUserWithEmailAndPassword(messagemail,messagepassword).addOnCompleteListener(sign_up.this, new OnCompleteListener<AuthResult>() {

            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
if(task.isSuccessful()){
    Toast.makeText(sign_up.this,"added to firebase",Toast.LENGTH_SHORT).show();

}
else {
    Toast.makeText(sign_up.this,"you messed up",Toast.LENGTH_SHORT).show();
}
            }
        });

    }


}
