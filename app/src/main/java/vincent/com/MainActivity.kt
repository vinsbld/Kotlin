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


        //if else
        if (age<5){
            println("$name est trop jeune pour jouer au basket")
        }
        if (age >=5 && height >= 1.50F){
            println("$name peut jouer au basket")
        }else{
            println("$name n'a ni l'age ni la taille pour jouer")
        }

        var type = if(age<18) "child" else "adult"
        println("${name} is a ${type}")


        //le mot clé when
        when(name){
            "Bob" -> println("c'est ${name}")
            "Alex" -> println("c'est ${name}")
            else -> println("c'est personne ")
        }

        //les intervales
        when(age){
            in 1..5 -> println("${name} est trop jeune")
            in 6..10 -> println("${name} peut jouer !")
            !in 1..18 -> println("${name} ne peut pas jouer avec des enfants")
            else -> println("inconue :)")
        }

        var newName : String?="Peter"
        newName=null

        if (newName!=null){
            println(name.length)
        }
        //evalue la nullabilité
        println(newName?.length)
        //peut cracher
        println(newName!!.length)


    }
}