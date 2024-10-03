package classes

abstract class Vehicule(var marque: String, var couleur: String, var annee: Int) {

    abstract fun afficherDetails()

    abstract fun klaxonner()
}