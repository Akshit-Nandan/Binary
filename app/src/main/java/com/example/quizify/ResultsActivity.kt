package com.example.quizify

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo
import kotlinx.android.synthetic.main.activity_results.*


class ResultsActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)
        YoYo.with(Techniques.Tada)
            .duration(1000)
            .repeat(0)
            .playOn(findViewById(R.id.NameResult));
        YoYo.with(Techniques.Tada)
            .duration(1000)
            .repeat(0)
            .playOn(findViewById(R.id.congo));
        NameResult.text = "Sensational $name"
        Score.text = "Your have scored  $score/${getQuestions().size}"

        btnFinish.setOnClickListener {
            score = 0
            startActivity(
                Intent(
                    this,
                    MainActivity::class.java,
                )
            )

        }

    }
}
