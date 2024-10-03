package classes

// abstract class to be inherited by other classes
abstract class Vehicule(var marque: String, var couleur: String, var annee: Int) {

    abstract fun afficherDetails() // abstract method to be implemented by child classes

    abstract fun klaxonner() // abstract method to be implemented by child classess
}