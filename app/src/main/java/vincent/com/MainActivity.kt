package vincent.com

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var age: Int = 5
        var name: String = "Alex"
        var height: Float = 1.60F

        if (age<5){
            println("$name est trop jeune pour jouer au basket")
        }
        if (age >=5 && height >= 1.50F){
            println("$name peut jouer au basket")
        }else{
            println("$name n'a ni l'age ni la taille pour jouer")
        }

        var type = if(age<18) "child" else "adult"
        println("${name} i a ${type}")
    }
}