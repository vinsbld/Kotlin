package vincent.com

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

//fonction avec retour
fun isOldEnough(age : Int): Boolean{
    //traitement
    return age >=5
}

fun describePoeple(name:String, age:Int, taille:Float){
    val canPlayOrNot = when(isOldEnoughBis(age)){
        true -> "can play"
        false -> "no he or she can't play"
    }
    println("${name} a ${age} ans, meusure ${taille}m et ${canPlayOrNot}")
}

//même fun ecrit plus simplement
fun isOldEnoughBis(age : Int) : Boolean = age >=5

//fonction sans retour
fun isOldEnoughNoRetour(age : Int){
    //traitement
}


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var age: Int = 10
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
        //println(newName!!.length)

        describePoeple(name, age, height)

        //déclaration d'un tableau
        val array : Array<Int> = Array<Int>(10){0}
        //ou
        val arraySimplifie = Array<Int>(10){0}
        println(Arrays.toString(arraySimplifie))

        //deux façons de pdéclarer les éléments dans le tableau
        val names = Array<String>(5){""}
        names.set(0, "bob")
        names[1] = "John"
        println(names.get(0))
        println(names.get(1))

        val ages = arrayOf(4,5,6)
        val indexAge = 2
        println("le 3ème élément est : ${ages[indexAge]}")//6

        ages[indexAge] = 29
        println("Le 3ème élément est maintenant : ${ages[indexAge]}")//29
    }
}