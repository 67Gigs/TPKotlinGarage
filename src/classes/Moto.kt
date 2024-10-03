package classes

class Moto : Vehicule {

    var sideCar: Boolean = false

    constructor(marque: String, couleur: String, annee: Int, sideCar: Boolean) : super(marque, couleur, annee) {
        this.sideCar = sideCar
    }

    override fun afficherDetails() {
        println("Marque: $marque, Couleur: $couleur, Annee: $annee, Side-car: $sideCar")
    }

    override fun klaxonner() {
        println("Bip bip!")
    }
}