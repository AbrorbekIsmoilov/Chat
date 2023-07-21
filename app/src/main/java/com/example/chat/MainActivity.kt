package com.example.chat

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import com.example.chat.adapter.RvAdapter
import com.example.chat.databinding.ActivityMainBinding
import com.example.ecoavalon.models.MyMessage
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private lateinit var rvAdapter: RvAdapter
    private lateinit var firebaseDataView: FirebaseDatabase
    private lateinit var reference: DatabaseReference

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        firebaseDataView = FirebaseDatabase.getInstance()
        reference = firebaseDataView.getReference("my_message")
        binding.apply {
            rvAdapter = RvAdapter()
            rv.adapter = rvAdapter

            edtMessage.addTextChangedListener {
                if (edtMessage.text.isNotEmpty()) {
                    btnSend.setOnClickListener {
                        val id = reference.push().key
                        val myMessage = MyMessage(id, edtMessage.text.toString())
                        reference.child(id!!).setValue(myMessage)
                        Toast.makeText(this@MainActivity, "yuborildi", Toast.LENGTH_SHORT).show()
                        edtMessage.text.clear()
                    }
                }
            }
        }
        reference.addValueEventListener(object : ValueEventListener {
            @SuppressLint("NotifyDataSetChanged")
            override fun onDataChange(snapshot: DataSnapshot) {
                val children = snapshot.children
                val list = ArrayList<MyMessage>()
                for (child in children) {
                    val value = child.getValue(MyMessage::class.java)
                    if (value != null) {
                        list.add(value)
                    }
                }
                rvAdapter.list.clear()
                rvAdapter.list.addAll(list)
                rvAdapter.notifyDataSetChanged()
            }
//            men user1
// man masterdan yangilanish qilyapman user1da korinish kerak
// man masterdan yangilanish qilyapman user1da korinish kerak
// man masterdan yangilanish qilyapman user1da korinish kerak
// man masterdan yangilanish qilyapman user1da korinish kerak
// man masterdan yangilanish qilyapman user1da korinish kerak
// man masterdan yangilanish qilyapman user1da korinish kerak
// man masterdan yangilanish qilyapman user1da korinish kerak
// man masterdan yangilanish qilyapman user1da korinish kerak
// man masterdan yangilanish qilyapman user1da korinish kerak
// man masterdan yangilanish qilyapman user1da korinish kerak
// man masterdan yangilanish qilyapman user1da korinish kerak
// man masterdan yangilanish qilyapman user1da korinish kerak
// man masterdan yangilanish qilyapman user1da korinish kerak
// man masterdan yangilanish qilyapman user1da korinish kerak
// man masterdan yangilanish qilyapman user1da korinish kerak
// man masterdan yangilanish qilyapman user1da korinish kerak
// man masterdan yangilanish qilyapman user1da korinish kerak
// man masterdan yangilanish qilyapman user1da korinish kerak
// man masterdan yangilanish qilyapman user1da korinish kerak
// man masterdan yangilanish qilyapman user1da korinish kerak
// man masterdan yangilanish qilyapman user1da korinish kerak
// man masterdan yangilanish qilyapman user1da korinish kerak
// man masterdan yangilanish qilyapman user1da korinish kerak
// man masterdan yangilanish qilyapman user1da korinish kerak
// man masterdan yangilanish qilyapman user1da korinish kerak
// man masterdan yangilanish qilyapman user1da korinish kerak
// man masterdan yangilanish qilyapman user1da korinish kerak
// man masterdan yangilanish qilyapman user1da korinish kerak
// man masterdan yangilanish qilyapman user1da korinish kerak
// man masterdan yangilanish qilyapman user1da korinish kerak
// man masterdan yangilanish qilyapman user1da korinish kerak
// man masterdan yangilanish qilyapman user1da korinish kerak
// man masterdan yangilanish qilyapman user1da korinish kerak
// man masterdan yangilanish qilyapman user1da korinish kerak
// man masterdan yangilanish qilyapman user1da korinish kerak
// man masterdan yangilanish qilyapman user1da korinish kerak
// man masterdan yangilanish qilyapman user1da korinish kerak
// man masterdan yangilanish qilyapman user1da korinish kerak
// man masterdan yangilanish qilyapman user1da korinish kerak
// man masterdan yangilanish qilyapman user1da korinish kerak
// man masterdan yangilanish qilyapman user1da korinish kerak
// man masterdan yangilanish qilyapman user1da korinish kerak
// man masterdan yangilanish qilyapman user1da korinish kerak
// man masterdan yangilanish qilyapman user1da korinish kerak
// man masterdan yangilanish qilyapman user1da korinish kerak
            override fun onCancelled(error: DatabaseError) {

            }
        })
    }
}