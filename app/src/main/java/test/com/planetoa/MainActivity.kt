package test.com.planetoa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import de.hdodenhof.circleimageview.CircleImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.decorView.apply { systemUiVisibility
            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN

        }

        my_recycler.adapter=Adapter(setData.setPlanets())
        my_recycler.layoutManager=LinearLayoutManager(this)

        val aboutme = findViewById<CircleImageView>(R.id.about_me)

        aboutme.setOnClickListener{
            val intent = Intent(this,AboutMe::class.java)
            startActivity(intent)
        }



    }
}