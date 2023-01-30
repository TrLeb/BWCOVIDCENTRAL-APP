package com.example.bwcovidcentral;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.List;

public class ChatActivity extends AppCompatActivity {

    Toolbar toolbar;
    RecyclerView recyclerView;
    ImageView profileTv;
    TextView nameTv, statusTv;
    ImageButton sendBtn;
    EditText messageEt;

    FirebaseDatabase firebaseDatabase;
    DatabaseReference usersDbRef;
    FirebaseAuth firebaseAuth;

    //for checking if user saw messAGE
    ValueEventListener seenListener;
    DatabaseReference userRefForSeen;

    //List<ModelChat> chatList;
    //AdapterChat adapterChat;

    String hisUid;
    String myUid;
    String hisImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        //init views
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("");

        recyclerView = findViewById(R.id.chat_recycleView);
        profileTv = findViewById(R.id.profileTv);
        nameTv = findViewById(R.id.nameTV);
        statusTv = findViewById(R.id.statusTv);
        messageEt= findViewById(R.id.messageEt);
        sendBtn = findViewById(R.id.sendBtn);
    }
}